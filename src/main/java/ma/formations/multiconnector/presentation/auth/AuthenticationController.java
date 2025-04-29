package ma.formations.multiconnector.presentation.auth;

import lombok.AllArgsConstructor;
import ma.formations.multiconnector.dtos.TokenVo;
import ma.formations.multiconnector.dtos.user.UserRequest;
import ma.formations.multiconnector.jwt.JwtUtils;
import ma.formations.multiconnector.service.IUserService;
import ma.formations.multiconnector.service.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private IUserService userService;

    @PostMapping("/signin")
    public ResponseEntity<TokenVo> authenticateUser(@RequestBody UserRequest userRequest) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(userRequest.username(),
                            userRequest.password()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);
            TokenVo tokenVo = TokenVo.builder().
                    jwtToken(jwt).
                    username(userRequest.username()).
                    roles(authentication.getAuthorities().stream().
                            map(GrantedAuthority::getAuthority).
                            collect(Collectors.toList())).build();
            return ResponseEntity.ok(tokenVo);
        } catch (Exception e) {
            throw new BusinessException("Login ou mot de passe incorrect");
        }
    }
}
