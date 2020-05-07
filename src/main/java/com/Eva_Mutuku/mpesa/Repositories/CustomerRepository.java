/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Repositories;

import com.Eva_Mutuku.mpesa.Datalayer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author root
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
