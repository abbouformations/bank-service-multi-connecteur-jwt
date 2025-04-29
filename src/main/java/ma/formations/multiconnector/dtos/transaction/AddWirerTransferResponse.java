package ma.formations.multiconnector.dtos.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddWirerTransferResponse {
    private String message;
    private TransactionDto transactionFrom;
    private TransactionDto transactionTo;
}
