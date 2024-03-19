package API.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import API.demo.entity.User;
import API.demo.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class Usercontroller {
    private final UserService userService;
    @PostMapping
    public void createUsuario (@RequestBody User user)
    {
        userService.createUsuario(user);
    }
}
