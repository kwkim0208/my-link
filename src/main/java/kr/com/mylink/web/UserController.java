package kr.com.mylink.web;

import kr.com.mylink.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }
    @GetMapping("/join")
    public String join() {
        return "/user/join";
    }

}
