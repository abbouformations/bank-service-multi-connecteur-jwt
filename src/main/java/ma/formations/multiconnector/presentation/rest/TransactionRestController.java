package ma.formations.multiconnector.presentation.rest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.formations.multiconnector.common.CommonTools;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferRequest;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferResponse;
import ma.formations.multiconnector.dtos.transaction.GetTransactionListRequest;
import ma.formations.multiconnector.dtos.transaction.TransactionDto;
import ma.formations.multiconnector.service.ITransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/rest/transaction")
@CrossOrigin("http://localhost:3000/")
@PreAuthorize("hasAnyRole('AGENT_GUICHET','AGENT_GUICHET_GET','CLIENT')")
public class TransactionRestController {

    private ITransactionService transactionService;
    private CommonTools commonTools;

    @PostMapping("/create")
    @PreAuthorize("hasAuthority('ADD_WIRED_TRANSFER')")
    public ResponseEntity<AddWirerTransferResponse> addWirerTransfer(@Valid @RequestBody AddWirerTransferRequest dto) {
        return new ResponseEntity<>(transactionService.wiredTransfer(dto), HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('GET_TRANSACTIONS')")
    public List<TransactionDto> getTransactions(GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}
