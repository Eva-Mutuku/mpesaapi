/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Datalayer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
@Table(name = "CustomerTypes")
public class CustomerType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CustomerType_seq")
    @SequenceGenerator(name = "CustomerType", initialValue = 1, allocationSize = 1, sequenceName = "CustomerTyp_seq")
    private Long CustomerTypeId;

    @Column(name = "CustomerTypeName", nullable = false, unique = true)
    private String CustomerTypeName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CreatedOn", nullable = false)
    private Date CreatedOn;

    @Column(name = "CreatedBy", nullable = false)
    private String CreatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdatedOn")
    private Date UpdatedOn;

    @Column(name = "UpdatedBy")
    private String UpdatedBy;

    public CustomerType() {
    }

    public CustomerType(Long CustomerTypeId) {
        this.CustomerTypeId = CustomerTypeId;
    }

    public CustomerType(String CustomerTypeName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.CustomerTypeName = CustomerTypeName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }

    public CustomerType(Long CustomerTypeId, String CustomerTypeName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.CustomerTypeId = CustomerTypeId;
        this.CustomerTypeName = CustomerTypeName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }

}
