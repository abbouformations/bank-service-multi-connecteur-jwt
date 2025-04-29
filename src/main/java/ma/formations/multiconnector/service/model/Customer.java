package ma.formations.multiconnector.service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User {
    @Column(unique = true)
    private String identityRef;
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;
}
