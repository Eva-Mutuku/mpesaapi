/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Controllers;

import com.Eva_Mutuku.mpesa.Datalayer.User;
import com.Eva_Mutuku.mpesa.Requests.UserRequest;
import com.Eva_Mutuku.mpesa.Responses.UserResponse;
import com.Eva_Mutuku.mpesa.Services.UserService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController //help access methods for implementing business logic by the client
@RequestMapping("/api/Users") //describes path to access methods
public class userController {

    @Autowired
    private UserService userService; //instantiating b.logic class

    @PostMapping(value = "/Create") //name for method create
    public UserResponse createUser(@Valid @RequestBody UserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping(value = "/GetCustomers")
    public List<User> getAllPeople() {
        return userService.getAllPeople();
    }
}
