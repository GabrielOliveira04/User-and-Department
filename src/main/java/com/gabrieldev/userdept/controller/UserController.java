package com.gabrieldev.userdept.controller;

import com.gabrieldev.userdept.entities.User;
import com.gabrieldev.userdept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @Autowired //Mecanismo de injenção de dependência
    private UserRepository repository;

     @GetMapping(value = "/all")
    public List<User> findAll(){
       List<User> result = repository.findAll();
        return result;
    }



    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
         User result = repository.findById(id).get();
         return result;
    }

    @PostMapping
    public User insert(@RequestBody User user){
         User result = repository.save(user);
         return result;

    }




}
