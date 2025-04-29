package ma.formations.multiconnector.presentation.rest;

import jakarta.validation.Valid;
import ma.formations.multiconnector.dtos.customer.*;
import ma.formations.multiconnector.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rest/customer")
//@PreAuthorize("hasAnyRole('AGENT_GUICHET','AGENT_GUICHET_GET','CLIENT')")
public class CustomerRestController {

    private final ICustomerService customerService;

    public CustomerRestController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/agent_guichet/all")
    @PreAuthorize("hasAuthority('GET_ALL_CUSTUMERS')")
    List<CustomerDto> customers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/identity/{identity}")
    @PreAuthorize("hasAuthority('GET_CUSTOMER_BY_IDENTITY')")
    CustomerDto customerByIdentity(@RequestParam(value = "identity") String identity) {
        return customerService.getCustomByIdentity(identity);
    }

    @PostMapping("/agent_guichet/create")
    @PreAuthorize("hasAuthority('CREATE_CUSTOMER')")
    public ResponseEntity<AddCustomerResponse> createCustomer(@RequestBody @Valid AddCustomerRequest dto) {
        return new ResponseEntity<>(customerService.createCustomer(dto), HttpStatus.CREATED);
    }

    @PutMapping("/agent_guichet/update/{identityRef}")
    @PreAuthorize("hasAuthority('UPDATE_CUSTOMER')")
    public ResponseEntity<UpdateCustomerResponse> updateCustomer(@PathVariable String identityRef, @RequestBody @Valid UpdateCustomerRequest dto) {
        return new ResponseEntity<>(customerService.updateCustomer(identityRef, dto), HttpStatus.OK);
    }

    @DeleteMapping("/agent_guichet/delete/{identityRef}")
    @PreAuthorize("hasAuthority('DELETE_CUSTOMER')")
    public ResponseEntity<String> deleteCustomer(@PathVariable String identityRef) {
        customerService.deleteCustomerByIdentityRef(identityRef);
        return new ResponseEntity<>(String.format("Customer with identity %s is removed", identityRef), HttpStatus.OK);
    }
}
