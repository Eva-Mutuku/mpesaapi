/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Repositories;

import com.Eva_Mutuku.mpesa.Datalayer.IdType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author root
 */
public interface IdTypeRepository extends JpaRepository<IdType, Long> {

    @Query("select u from IdType u where u.idTypeName=:IdTypeName")
    public IdType findOneByIdTypeName(@Param("IdTypeName") String IdTypeName);

}
