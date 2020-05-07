/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Datalayer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
@Table(name = "Users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_seq")
    @SequenceGenerator(name = "User_Seq", initialValue = 1, allocationSize = 1, sequenceName = "Use_seq")
    private long UserId; //Other than using @GeneratedValue can you use type UUID

    private String username;
    private String password;

    public User() {
    }

    private static List<User> DB = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
