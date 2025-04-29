package ma.formations.multiconnector.service;

import ma.formations.multiconnector.dtos.transaction.AddWirerTransferRequest;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferResponse;
import ma.formations.multiconnector.dtos.transaction.GetTransactionListRequest;
import ma.formations.multiconnector.dtos.transaction.TransactionDto;

import java.util.List;
public interface ITransactionService {
    AddWirerTransferResponse wiredTransfer(AddWirerTransferRequest dto);
    List<TransactionDto> getTransactions(GetTransactionListRequest dto);
}
