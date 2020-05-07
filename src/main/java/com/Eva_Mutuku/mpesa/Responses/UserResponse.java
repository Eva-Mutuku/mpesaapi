/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Responses;

import lombok.Data;

/**
 *
 * @author root
 */
@Data
public class UserResponse {

    private String username;
    private long userid;

    public UserResponse(String username, long userid) {
        this.username = username;
        this.userid = userid;
    }

}
