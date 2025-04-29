package ma.formations.multiconnector.service;

import lombok.AllArgsConstructor;
import ma.formations.multiconnector.dao.PermissionRepository;
import ma.formations.multiconnector.dao.RoleRepository;
import ma.formations.multiconnector.dao.UserRepository;
import ma.formations.multiconnector.dtos.user.PermissionVo;
import ma.formations.multiconnector.dtos.user.RoleVo;
import ma.formations.multiconnector.dtos.user.UserVo;
import ma.formations.multiconnector.service.model.Permission;
import ma.formations.multiconnector.service.model.Role;
import ma.formations.multiconnector.service.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements IUserService, UserDetailsService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;
    private RoleRepository roleRepository;
    private PermissionRepository permissionRepository;

    @Override
    public void save(UserVo user) {
        User userBo = modelMapper.map(user, User.class);
        userBo.setPassword(passwordEncoder.encode(user.getPassword()));
        userBo.setAuthorities(user.getAuthorities().stream().
                map(role -> roleRepository.findByAuthority(role.getAuthority()).get())
                .toList());
        userRepository.save(userBo);

    }

    @Override
    public void save(RoleVo role) {
        Role roleBo = modelMapper.map(role, Role.class);
        roleBo.setAuthorities(role.getAuthorities().
                stream().
                map(roleDto -> permissionRepository.findByAuthority(roleDto.getAuthority()).get()).
                toList());
        roleRepository.save(roleBo);
    }

    @Override
    public void save(PermissionVo vo) {
        permissionRepository.save(modelMapper.map(vo, Permission.class));
    }

    @Override
    public RoleVo getRoleByName(String role) {
        return modelMapper.map(roleRepository.findByAuthority(role), RoleVo.class);
    }

    @Override
    public PermissionVo getPermissionByName(String authority) {
        return modelMapper.map(permissionRepository.findByAuthority(authority), PermissionVo.class);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVo uservo = modelMapper.map(userRepository.findByUsername(username), UserVo.class);
        List<RoleVo> permissions = new ArrayList<>();
        uservo.getAuthorities().forEach(roleVo -> {
            roleVo.getAuthorities().forEach(permissionVo -> {
                permissions.add(RoleVo.builder().authority(permissionVo.getAuthority()).build());
            });
        });
        uservo.getAuthorities().addAll(permissions);
        return uservo;
    }
}
