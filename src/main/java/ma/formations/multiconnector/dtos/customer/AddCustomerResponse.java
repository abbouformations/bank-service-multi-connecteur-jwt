package ma.formations.multiconnector.dtos.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddCustomerResponse {
    private String message;
    private Long id;
    private String username;
    private String identityRef;
    private String firstname;
    private String lastname;
}
