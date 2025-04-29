package ma.formations.multiconnector.dao;

import ma.formations.multiconnector.service.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByAuthority(String roleName);
}
