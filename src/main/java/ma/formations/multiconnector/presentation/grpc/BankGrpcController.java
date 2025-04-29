package ma.formations.multiconnector.presentation.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.formations.multiconnector.dtos.bankaccount.AddBankAccountRequest;
import ma.formations.multiconnector.dtos.bankaccount.AddBankAccountResponse;
import ma.formations.multiconnector.dtos.bankaccount.BankAccountDto;
import ma.formations.multiconnector.dtos.customer.*;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferRequest;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferResponse;
import ma.formations.multiconnector.dtos.transaction.GetTransactionListRequest;
import ma.formations.multiconnector.dtos.transaction.TransactionDto;
import ma.formations.multiconnector.grpc.stub.Bank;
import ma.formations.multiconnector.grpc.stub.BankServiceGrpc;
import ma.formations.multiconnector.service.IBankAccountService;
import ma.formations.multiconnector.service.ICustomerService;
import ma.formations.multiconnector.service.ITransactionService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@GrpcService
public class BankGrpcController extends BankServiceGrpc.BankServiceImplBase {
    private ICustomerService customerService;
    private IBankAccountService bankAccountService;
    private ModelMapper modelMapper;
    private ITransactionService transactionService;

    @Override
    public void customers(Bank.CustomersRequest request, StreamObserver<Bank.CustomersResponse> responseObserver) {
        List<CustomerDto> customers = customerService.getAllCustomers();
        Bank.CustomersResponse response = Bank.CustomersResponse.newBuilder().
                addAllCustomers(
                        customers.stream().map(customerDto ->
                                        modelMapper.map(customerDto, Bank.CustomerDTO.Builder.class).build()).
                                collect(Collectors.toList())).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void customerByIdentity(Bank.CustomerByIdentityRequest request, StreamObserver<Bank.CustomerByIdentityResponse> responseObserver) {
        CustomerDto customerDto = customerService.getCustomByIdentity(request.getIdentityRef());
        Bank.CustomerByIdentityResponse response = Bank.CustomerByIdentityResponse.newBuilder().
                setCustomer(modelMapper.map(customerDto, Bank.CustomerDTO.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createCustomer(Bank.CreateCustomerRequest request, StreamObserver<Bank.CreateCustomerResponse> responseObserver) {
        AddCustomerResponse addCustomerResponse = customerService.createCustomer(modelMapper.map(request, AddCustomerRequest.class));
        Bank.CreateCustomerResponse response = Bank.CreateCustomerResponse.newBuilder().
                setMessage(addCustomerResponse.getMessage()).
                setCustomer(modelMapper.map(addCustomerResponse, Bank.CustomerDTO.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateCustomer(Bank.UpdateCustomerRequest request, StreamObserver<Bank.UpdateCustomerResponse> responseObserver) {

        UpdateCustomerResponse updateCustomerResponse = customerService.updateCustomer(
                request.getIdentityRef(), modelMapper.map(request.getUpdatedCustomer(), UpdateCustomerRequest.class));
        Bank.UpdateCustomerResponse response = Bank.UpdateCustomerResponse.newBuilder().
                setMessage(updateCustomerResponse.getMessage()).
                setCustomer(modelMapper.map(updateCustomerResponse, Bank.CustomerDTO.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCustomer(Bank.DeleteCustomerRequest request, StreamObserver<Bank.DeleteCustomerResponse> responseObserver) {
        String message = customerService.deleteCustomerByIdentityRef(request.getIdentityRef());
        Bank.DeleteCustomerResponse response = Bank.DeleteCustomerResponse.newBuilder().
                setMessage(message).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void bankAccounts(Bank.BankAccountsRequest request, StreamObserver<Bank.BankAccountsResponse> responseObserver) {
        List<BankAccountDto> bankAccounts = bankAccountService.getAllBankAccounts();
        Bank.BankAccountsResponse response = Bank.BankAccountsResponse.newBuilder().
                addAllBankAccount(
                        bankAccounts.stream().
                                map(bankAccount -> modelMapper.map(bankAccount, Bank.BankAccountDto.Builder.class).build()).
                                collect(Collectors.toList())).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void bankAccountByRib(Bank.BankAccountByRibRequest request, StreamObserver<Bank.BankAccountByRibResponse> responseObserver) {
        BankAccountDto bankAccount = bankAccountService.getBankAccountByRib(request.getRib());

        Bank.BankAccountByRibResponse response = Bank.BankAccountByRibResponse.newBuilder().
                setBankAccount(modelMapper.map(bankAccount, Bank.BankAccountDto.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addBankAccount(Bank.AddBankAccountRequest request, StreamObserver<Bank.AddBankAccountResponse> responseObserver) {
        AddBankAccountResponse addBankAccountResponse = bankAccountService.saveBankAccount(
                modelMapper.map(request, AddBankAccountRequest.class));
        Bank.AddBankAccountResponse response = Bank.AddBankAccountResponse.newBuilder().
                setMessage(addBankAccountResponse.getMessage()).
                setBankAccount(modelMapper.map(addBankAccountResponse, Bank.BankAccountDto.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addWirerTransfer(Bank.AddWirerTransferRequest request, StreamObserver<Bank.AddWirerTransferResponse> responseObserver) {
        AddWirerTransferResponse addWirerTransferResponse = transactionService.wiredTransfer(modelMapper.map(request, AddWirerTransferRequest.class));
        Bank.AddWirerTransferResponse response = Bank.AddWirerTransferResponse.newBuilder().
                setMessage(addWirerTransferResponse.getMessage()).
                setTransactionFrom(modelMapper.map(addWirerTransferResponse.getTransactionFrom(), Bank.TransactionDto.Builder.class).build()).
                setTransactionTo(modelMapper.map(addWirerTransferResponse.getTransactionTo(), Bank.TransactionDto.Builder.class).build()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getTransactions(Bank.GetTransactionsRequest request, StreamObserver<Bank.GetTransactionsResponse> responseObserver) {
        List<TransactionDto> transactions = transactionService.getTransactions(modelMapper.map(request, GetTransactionListRequest.class));
        Bank.GetTransactionsResponse response = Bank.GetTransactionsResponse.newBuilder().
                addAllTransaction(transactions.stream().
                        map(transactionDto -> modelMapper.map(transactionDto, Bank.TransactionDto.Builder.class).build()).
                        collect(Collectors.toList())).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
