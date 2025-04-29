package ma.formations.multiconnector.dtos.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GetTransactionListRequest {
    private String rib;
    private String dateTo;
    private String dateFrom;
}
