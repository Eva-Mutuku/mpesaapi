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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Customer_Seq")
    @SequenceGenerator(name = "Customer_Seq", initialValue = 1, allocationSize = 1, sequenceName = "Custom_seq")
    private Long customerId;

    @Column(name = "CustomerFirstName", nullable = false)
    private String CustomerFirstName;

    private String CustomerMiddleName;

    @Column(name = "CustomerSurName", nullable = false)
    private String CustomerSurName;

    @Column(name = "CustomerIdNumber", nullable = false, unique = true)
    private String CustomerIdNumber;

    @Column(name = "CustomerDOB")
    private Date CustomerDOB;

    @Email
    @Column(name = "CustomerEmailAddress", nullable = false, unique = true)
    private String CustomerEmailAddress;

    @Column(name = "CustomerPinNumber", nullable = false, unique = true)
    private String CustomerPinNumber;

    @Column(name = "CustomerAddress")
    private String CustomerAddress;

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

    @ManyToOne
    @JoinColumn(name = "CustomerTypeId", nullable = false)
    private CustomerType customerType;

    @OneToOne
    @JoinColumn(name = "idTypeId", nullable = false)
    private IdType idType;

    public Customer() {
    }

    public Customer(String CustomerFirstName, String CustomerMiddleName, String CustomerSurName, String CustomerIdNumber, Date CustomerDOB, String CustomerEmailAddress, String CustomerPinNumber, String CustomerAddress, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy, CustomerType customerType, IdType idType) {
        this.CustomerFirstName = CustomerFirstName;
        this.CustomerMiddleName = CustomerMiddleName;
        this.CustomerSurName = CustomerSurName;
        this.CustomerIdNumber = CustomerIdNumber;
        this.CustomerDOB = CustomerDOB;
        this.CustomerEmailAddress = CustomerEmailAddress;
        this.CustomerPinNumber = CustomerPinNumber;
        this.CustomerAddress = CustomerAddress;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
        this.customerType = customerType;
        this.idType = idType;
    }

}
