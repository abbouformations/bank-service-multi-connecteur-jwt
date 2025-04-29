package ma.formations.multiconnector;

import ma.formations.multiconnector.dtos.bankaccount.AddBankAccountRequest;
import ma.formations.multiconnector.dtos.customer.AddCustomerRequest;
import ma.formations.multiconnector.dtos.customer.CustomerDto;
import ma.formations.multiconnector.dtos.transaction.AddWirerTransferRequest;
import ma.formations.multiconnector.dtos.user.PermissionVo;
import ma.formations.multiconnector.dtos.user.RoleVo;
import ma.formations.multiconnector.dtos.user.UserVo;
import ma.formations.multiconnector.enums.Permisssions;
import ma.formations.multiconnector.enums.Roles;
import ma.formations.multiconnector.service.IBankAccountService;
import ma.formations.multiconnector.service.ICustomerService;
import ma.formations.multiconnector.service.ITransactionService;
import ma.formations.multiconnector.service.IUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BankServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankServiceApplication.class, args);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner initDataBase(ICustomerService customerService,
                                   IBankAccountService bankAccountService,
                                   ITransactionService transactionService, IUserService userService) {

        return args -> {
            customerService.createCustomer(AddCustomerRequest.builder().
                    username("user1").
                    identityRef("A100").
                    firstname("FIRST_NAME1").
                    lastname("LAST_NAME1").
                    build());

            bankAccountService.saveBankAccount(AddBankAccountRequest.builder().
                    rib("RIB_1").
                    amount(1000000d).
                    customer(CustomerDto.builder().identityRef("A100").build()).
                    build());
            bankAccountService.saveBankAccount(AddBankAccountRequest.builder().
                    rib("RIB_11").
                    amount(2000000d).
                    customer(CustomerDto.builder().identityRef("A100").build()).
                    build());

            customerService.createCustomer(AddCustomerRequest.builder().
                    username("user2").
                    identityRef("A200").
                    firstname("FIRST_NAME2").
                    lastname("LAST_NAME2").
                    build());

            bankAccountService.saveBankAccount(AddBankAccountRequest.builder().
                    rib("RIB_2").
                    amount(2000000d).
                    customer(CustomerDto.builder().identityRef("A200").build()).
                    build());


            customerService.createCustomer(AddCustomerRequest.builder().
                    username("user3").
                    identityRef("A900").
                    firstname("FIRST_NAME9").
                    lastname("LAST_NAME9").
                    build());

            bankAccountService.saveBankAccount(AddBankAccountRequest.builder().
                    rib("RIB_9").
                    amount(-25000d).
                    customer(CustomerDto.builder().identityRef("A900").build()).
                    build());


            customerService.createCustomer(AddCustomerRequest.builder().
                    username("user4").
                    identityRef("A800").
                    firstname("FIRST_NAME8").
                    lastname("LAST_NAME8").
                    build());

            bankAccountService.saveBankAccount(AddBankAccountRequest.builder().
                    rib("RIB_8").
                    amount(0.0).
                    customer(CustomerDto.builder().identityRef("A800").build()).
                    build());

            transactionService.wiredTransfer(AddWirerTransferRequest.builder().
                    ribFrom("RIB_1").
                    ribTo("RIB_2").
                    amount(10000.0).
                    username("user1").
                    build());

            transactionService.wiredTransfer(AddWirerTransferRequest.builder().
                    ribFrom("RIB_1").
                    ribTo("RIB_9").
                    amount(20000.0).
                    username("user1").
                    build());

            transactionService.wiredTransfer(AddWirerTransferRequest.builder().
                    ribFrom("RIB_1").
                    ribTo("RIB_8").
                    amount(500.0).
                    username("user1").
                    build());


            transactionService.wiredTransfer(AddWirerTransferRequest.builder().
                    ribFrom("RIB_2").
                    ribTo("RIB_11").
                    amount(300.0).
                    username("user2").
                    build());

            Arrays.stream(Permisssions.values()).toList().forEach(permisssions ->
                    userService.save(PermissionVo.builder().authority(permisssions.name()).build()));

            RoleVo roleaAgentGuichet = RoleVo.builder().
                    authority(Roles.ROLE_AGENT_GUICHET.name()).
                    authorities(List.of(
                            userService.getPermissionByName(Permisssions.GET_ALL_CUSTUMERS.name()),
                            userService.getPermissionByName(Permisssions.GET_CUSTOMER_BY_IDENTITY.name()),
                            userService.getPermissionByName(Permisssions.CREATE_CUSTOMER.name()),
                            userService.getPermissionByName(Permisssions.UPDATE_CUSTOMER.name()),
                            userService.getPermissionByName(Permisssions.DELETE_CUSTOMER.name()),
                            userService.getPermissionByName(Permisssions.GET_ALL_BANK_ACCOUNT.name()),
                            userService.getPermissionByName(Permisssions.GET_BANK_ACCOUNT_BY_RIB.name()),
                            userService.getPermissionByName(Permisssions.CREATE_BANK_ACCOUNT.name()))).
                    build();

            //Agent guichet pour lecture seule.
            RoleVo roleaAgentGuichetGet = RoleVo.builder().
                    authority(Roles.ROLE_AGENT_GUICHET_GET.name()).
                    authorities(List.of(
                            userService.getPermissionByName(Permisssions.GET_ALL_CUSTUMERS.name()),
                            userService.getPermissionByName(Permisssions.GET_CUSTOMER_BY_IDENTITY.name()),
                            userService.getPermissionByName(Permisssions.GET_ALL_BANK_ACCOUNT.name()),
                            userService.getPermissionByName(Permisssions.GET_BANK_ACCOUNT_BY_RIB.name()))).
                    build();

            RoleVo roleClient = RoleVo.builder().
                    authority(Roles.ROLE_CLIENT.name()).
                    authorities(List.of(
                            userService.getPermissionByName(Permisssions.GET_CUSTOMER_BY_IDENTITY.name()),
                            userService.getPermissionByName(Permisssions.GET_BANK_ACCOUNT_BY_RIB.name()),
                            userService.getPermissionByName(Permisssions.ADD_WIRED_TRANSFER.name()),
                            userService.getPermissionByName(Permisssions.GET_TRANSACTIONS.name())
                    )).build();

            userService.save(roleaAgentGuichet);
            userService.save(roleaAgentGuichetGet);
            userService.save(roleClient);

            UserVo agentguichet = UserVo.builder().
                    username("agentguichet").
                    password("agentguichet").
                    accountNonExpired(true).
                    accountNonLocked(true).
                    enabled(true).
                    credentialsNonExpired(true).
                    authorities(List.of(roleaAgentGuichet)).
                    build();

            UserVo agentguichet2 = UserVo.builder().
                    username("agentguichet2").
                    password("agentguichet2").
                    accountNonExpired(true).
                    accountNonLocked(true).
                    enabled(true).
                    credentialsNonExpired(true).
                    authorities(List.of(roleaAgentGuichetGet)).
                    build();

            UserVo client = UserVo.builder().
                    username("client").
                    password("client").
                    accountNonExpired(true).
                    accountNonLocked(true).
                    enabled(true).
                    credentialsNonExpired(true).
                    authorities(List.of(roleClient)).
                    build();

            UserVo superadmin = UserVo.builder().
                    username("superadmin").
                    password("superadmin").
                    accountNonExpired(true).
                    accountNonLocked(true).
                    enabled(true).
                    credentialsNonExpired(true).
                    authorities(List.of(roleClient, roleaAgentGuichet)).
                    build();

            userService.save(agentguichet);
            userService.save(agentguichet2);
            userService.save(client);
            userService.save(superadmin);
        };
    }
}
