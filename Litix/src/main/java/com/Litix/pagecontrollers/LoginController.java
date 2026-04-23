package com.Litix.pagecontrollers;


import com.Litix.security.LoginForm;
import com.Litix.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final UserService userService;


    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String loginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping()
    public String processLogin(LoginForm form) throws Exception{
        userService.loginUser(form.getUsername(), form.getPassword());
        return "redirect:/";
    }
}
