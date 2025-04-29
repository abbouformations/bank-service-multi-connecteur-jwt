package ma.formations.multiconnector.dtos.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddWirerTransferRequest {
    private String ribFrom;
    private String ribTo;
    private Double amount;
    private String username;
}
