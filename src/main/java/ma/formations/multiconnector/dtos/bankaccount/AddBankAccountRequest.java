package ma.formations.multiconnector.dtos.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.multiconnector.dtos.customer.CustomerDto;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddBankAccountRequest {
    private String rib;
    private Double amount;
    private CustomerDto customer;
}
