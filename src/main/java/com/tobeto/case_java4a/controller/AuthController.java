package com.tobeto.case_java4a.controller;

import com.tobeto.case_java4a.model.entity.User;
import com.tobeto.case_java4a.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser() {
        // Oturum açma işlemleri burada ele alınabilir (JWT oluşturma, token döndürme vb.)
        return ResponseEntity.ok("Login successful");
    }
}
