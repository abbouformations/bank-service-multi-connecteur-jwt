package ma.formations.multiconnector.presentation.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.formations.multiconnector.common.CommonTools;
import ma.formations.multiconnector.dtos.bankaccount.AddBankAccountRequest;
import ma.formations.multiconnector.dtos.bankaccount.AddBankAccountResponse;
import ma.formations.multiconnector.dtos.bankaccount.BankAccountDto;
import ma.formations.multiconnector.dtos.customer.*;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferRequest;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferResponse;
import ma.formations.multiconnector.dtos.transaction.GetTransactionListRequest;
import ma.formations.multiconnector.dtos.transaction.TransactionDto;
import ma.formations.multiconnector.service.IBankAccountService;
import ma.formations.multiconnector.service.ICustomerService;
import ma.formations.multiconnector.service.ITransactionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "BankWS")
@AllArgsConstructor

public class BankSoapController {

    private final IBankAccountService bankAccountService;
    private final ICustomerService customerService;
    private ITransactionService transactionService;
    private CommonTools commonTools;


    @WebMethod

    /**
     *
     @WebResult was user in order to replace return balise
     by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public List<CustomerDto> customers() {
        return customerService.getAllCustomers();
    }


    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public CustomerDto customerByIdentity(@WebParam(name = "identity") String identity) {
        return customerService.getCustomByIdentity(identity);
    }

    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public AddCustomerResponse createCustomer(@WebParam(name = "Customer") AddCustomerRequest dto) {
        return customerService.createCustomer(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    @WebMethod
    public List<BankAccountDto> bankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    public BankAccountDto bankAccountByRib(@WebParam(name = "rib") String rib) {
        return bankAccountService.getBankAccountByRib(rib);
    }


    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    @WebMethod
    public AddBankAccountResponse createBankAccount(@WebParam(name = "bankAccountRequest") AddBankAccountRequest dto) {
        return bankAccountService.saveBankAccount(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by Transaction balise in SOAP Response.
     */
    @WebResult(name = "Transaction")
    @WebMethod
    public AddWirerTransferResponse createWirerTransfer(@WebParam(name = "wirerTransferRequest") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by Transaction balise in SOAP Response.
     */
    @WebResult(name = "Transaction")
    @WebMethod
    public List<TransactionDto> getTransactions(@WebParam(name = "dto") GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }

    @WebResult(name = "Customer")
    @WebMethod
    public UpdateCustomerResponse changeCustomer(@WebParam(name = "identityRef") String identityRef, @WebParam(name = "dto") UpdateCustomerRequest dto) {
        return customerService.updateCustomer(identityRef, dto);
    }

    @WebMethod
    public String deleteCustomer(@WebParam(name = "identityRef") String identityRef) {
        return customerService.deleteCustomerByIdentityRef(identityRef);
    }
}
