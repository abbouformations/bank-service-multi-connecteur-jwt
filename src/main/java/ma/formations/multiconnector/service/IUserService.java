package ma.formations.multiconnector.service;

import ma.formations.multiconnector.dtos.user.PermissionVo;
import ma.formations.multiconnector.dtos.user.RoleVo;
import ma.formations.multiconnector.dtos.user.UserVo;

public interface IUserService {
    void save(UserVo user);

    void save(RoleVo role);

    void save(PermissionVo vo);

    RoleVo getRoleByName(String role);

    PermissionVo getPermissionByName(String authority);
}
