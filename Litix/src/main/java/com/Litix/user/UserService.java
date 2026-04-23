package com.Litix.user;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService { //Service class


    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepository, PasswordEncoder encoder){
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    public User registerUser(User user){ //calls userRepository to save new registered user info
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

    public User loginUser(String username, String rawPassword) throws Exception{ //calls userRepository to load user info
        //in order to login
        User user = userRepository.findByUsername(username);

        if (user == null){
            throw new RuntimeException("User not found.");
        }

        if (!encoder.matches(rawPassword, user.getPassword())) {
            throw new RuntimeException("Invalid password.");
        }

        return user;
    }




}
