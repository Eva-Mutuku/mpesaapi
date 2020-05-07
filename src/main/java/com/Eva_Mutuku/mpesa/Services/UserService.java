/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Services;

import com.Eva_Mutuku.mpesa.Datalayer.User;
import com.Eva_Mutuku.mpesa.Repositories.UserRepository;
import com.Eva_Mutuku.mpesa.Requests.UserRequest;
import com.Eva_Mutuku.mpesa.Responses.UserResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author root
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest request) {
        try {
            User user = new User(request.getUsername(), request.getPassword());
            User user1 = userRepository.save(user);
            return new UserResponse(user1.getUsername(), user.getUserId());
        } catch (Exception e) {
            throw e;
        }
    }

    public List<User> getAllPeople() {
        return userRepository.findAll();
    }

}
