package com.Litix.pagecontrollers;

import com.Litix.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Litix.security.RegistrationForm;


@Controller
@RequestMapping("/register")
public class RegistrationController {
    private final UserService userService;


    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String registerForm(Model model) {
        model.addAttribute("registrationForm", new RegistrationForm());
        return "register";
    }

    @PostMapping()
    public String processRegistration(RegistrationForm form) {
        userService.registerUser(form.toUser());
        return "redirect:/login";
    }

}
