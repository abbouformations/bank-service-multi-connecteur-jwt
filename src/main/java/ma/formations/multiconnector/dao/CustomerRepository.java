package ma.formations.multiconnector.dao;

import ma.formations.multiconnector.service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByIdentityRef(String identityRef);

    Optional<Customer> findByUsername(String username);


}
