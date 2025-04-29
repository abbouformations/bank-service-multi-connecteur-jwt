package ma.formations.multiconnector.presentation.graphql;

import ma.formations.multiconnector.dtos.customer.*;
import ma.formations.multiconnector.service.ICustomerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerGraphqlController {

    private final ICustomerService customerService;

    public CustomerGraphqlController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping
    List<CustomerDto> customers() {
        return customerService.getAllCustomers();
    }

    @QueryMapping
    CustomerDto customerByIdentity(@Argument String identity) {
        return customerService.getCustomByIdentity(identity);
    }

    @MutationMapping
    public AddCustomerResponse createCustomer(@Argument("dto") AddCustomerRequest dto) {
        return customerService.createCustomer(dto);
    }

    @MutationMapping
    public UpdateCustomerResponse updateCustomer(@Argument("identityRef") String identityRef, @Argument("dto") UpdateCustomerRequest dto) {
        return customerService.updateCustomer(identityRef, dto);
    }

    @MutationMapping
    public String deleteCustomer(@Argument("identityRef") String identityRef) {
        return customerService.deleteCustomerByIdentityRef(identityRef);
    }

}
