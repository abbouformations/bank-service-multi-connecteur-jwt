package ma.formations.multiconnector.dao;

import ma.formations.multiconnector.service.model.BankAccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BankAccountTransactionRepository extends JpaRepository<BankAccountTransaction, Long> {
    List<BankAccountTransaction> findByBankAccount_RibAndCreatedAtBetween(String rib, Date from, Date to);
}
