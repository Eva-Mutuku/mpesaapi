/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Repositories;

import com.Eva_Mutuku.mpesa.Datalayer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author root
 */
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {

    @Query("select u from CustomerType u where u.CustomerTypeName=:customerTypeName")
    public CustomerType findOneByCustomerTypeName(@Param("customerTypeName") String customerTypeName);

}
