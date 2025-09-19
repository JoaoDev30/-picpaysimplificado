package com.picpaysimplificado.controllers;

import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.dtos.UserDTO;
import com.picpaysimplificado.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // EndPoint para criar usuários
    @PostMapping
    // RequestBody necessário para spring inejtar o corpo da requisição, caso contrário, vai retornar como null
    public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

        // EndPoint para listar usuários
       @GetMapping
        public ResponseEntity<List<User>> getAllUsers(){
           List<User> users = this.userService.getAllUsers();
           return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }

