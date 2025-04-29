package ma.formations.multiconnector.service;

import ma.formations.multiconnector.dtos.customer.*;

import java.util.List;

public interface ICustomerService {
    List<CustomerDto> getAllCustomers();
    AddCustomerResponse createCustomer(AddCustomerRequest addCustomerRequest);
    UpdateCustomerResponse updateCustomer(String identityRef, UpdateCustomerRequest updateCustomerRequest);
    CustomerDto getCustomByIdentity(String identity);
    String deleteCustomerByIdentityRef(String identityRef);
}
