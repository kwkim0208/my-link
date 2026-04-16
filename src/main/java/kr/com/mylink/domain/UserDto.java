package kr.com.mylink.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String id;
    private String password;
    private String name;
    private String email;
    private String role;
}
