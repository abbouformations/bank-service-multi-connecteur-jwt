package ma.formations.multiconnector.service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String authority;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Permission> authorities;
}
