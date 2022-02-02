package com.guven.cvpreparationproject.controller;

import com.guven.cvpreparationproject.model.User;
import com.guven.cvpreparationproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user){
         return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



//    @GetMapping("{userId}")
//    public ResponseEntity<?> getUserById(@PathVariable Long userId){
//        return new ResponseEntity<>(userService.findByUser(userId), HttpStatus.OK);
//    }

//    @GetMapping
//    public ResponseEntity<?> getAllUser(){
//        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
//    }

}
