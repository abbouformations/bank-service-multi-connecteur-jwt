package ma.formations.multiconnector.service;

import lombok.AllArgsConstructor;
import ma.formations.multiconnector.dao.CustomerRepository;
import ma.formations.multiconnector.dtos.customer.*;
import ma.formations.multiconnector.service.exception.BusinessException;
import ma.formations.multiconnector.service.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll().stream().
                map(customer -> modelMapper.map(customer, CustomerDto.class)).
                collect(Collectors.toList());
    }

    @Override
    public AddCustomerResponse createCustomer(AddCustomerRequest addCustomerRequest) {
        Customer bo = modelMapper.map(addCustomerRequest, Customer.class);
        String identityRef = bo.getIdentityRef();
        String username = bo.getUsername();

        customerRepository.findByIdentityRef(identityRef).ifPresent(a ->
                {
                    throw new BusinessException(String.format("Customer with the same identity [%s] exist", identityRef));
                }
        );

        customerRepository.findByUsername(username).ifPresent(a ->
                {
                    throw new BusinessException(String.format("The username [%s] is already used", username));
                }
        );
        AddCustomerResponse response = modelMapper.map(customerRepository.save(bo), AddCustomerResponse.class);
        response.setMessage(String.format("Customer : [identity= %s,First Name= %s, Last Name= %s, username= %s] was created with success",
                response.getIdentityRef(), response.getFirstname(), response.getLastname(), response.getUsername()));
        return response;
    }


    @Override
    public UpdateCustomerResponse updateCustomer(String identityRef, UpdateCustomerRequest updateCustomerRequest) {
        Customer customerToPersist = modelMapper.map(updateCustomerRequest, Customer.class);
        Customer customerFound = customerRepository.findAll().stream().filter(bo -> bo.getIdentityRef().equals(identityRef)).findFirst().orElseThrow(
                () -> new BusinessException(String.format("No Customer with identity [%s] exist !", identityRef))
        );
        customerToPersist.setId(customerFound.getId());
        customerToPersist.setIdentityRef(identityRef);
        UpdateCustomerResponse updateCustomerResponse = modelMapper.map(customerRepository.save(customerToPersist), UpdateCustomerResponse.class);
        updateCustomerResponse.setMessage(String.format("Customer identity %s is updated with success", identityRef));
        return updateCustomerResponse;
    }

    @Override
    public CustomerDto getCustomByIdentity(String identity) {
        return modelMapper.map(customerRepository.findByIdentityRef(identity).orElseThrow(
                        () -> new BusinessException(String.format("No Customer with identity [%s] exist !", identity))),
                CustomerDto.class);
    }

    @Override
    public String deleteCustomerByIdentityRef(String identityRef) {
        if (identityRef == null || identityRef.isEmpty())
            throw new BusinessException("Enter a correct identity customer");
        Customer customerFound = customerRepository.findAll().stream().filter(customer -> customer.getIdentityRef().equals(identityRef)).findFirst().orElseThrow(
                () -> new BusinessException(String.format("No customer with identity %s exist in database", identityRef))
        );
        customerRepository.delete(customerFound);
        return String.format("Customer with identity %s is deleted with success", identityRef);

    }
}
