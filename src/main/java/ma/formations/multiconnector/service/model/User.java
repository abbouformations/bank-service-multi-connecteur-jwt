package ma.formations.multiconnector.service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue
    protected Long id;
    protected String username;
    protected String firstname;
    protected String lastname;

    @OneToMany(mappedBy = "user")
    private List<BankAccountTransaction> bankAccountTransactionList;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Role> authorities;

    private String password;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialsNonExpired;

    private boolean enabled;


    public User(String username) {
        this.username = username;

    }
}
