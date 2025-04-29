package ma.formations.multiconnector.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenVo {
    private String username;
    private String jwtToken;
    private List<String> roles = new ArrayList<>();
}
