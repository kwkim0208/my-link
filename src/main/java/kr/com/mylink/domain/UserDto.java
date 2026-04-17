package kr.com.mylink.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private Long userNO;
    private String userId;
    private String userPassword;
    private String nickname;
    private String deleteYn;
    private String role;
}
