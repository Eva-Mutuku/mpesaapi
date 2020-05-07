/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Datalayer;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
public class TransactionTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TransactionTypes_seq ")
    @SequenceGenerator(name = "TransactionTypes_seq", initialValue = 1, allocationSize = 1, sequenceName = "TransactionTypes")
    private long TransactionTypes;

    @Column(name = "TransactionTypesName", nullable = false)
    private String TransactionTypesName;

    private Date CreatedOn;
    private String CreatedBy;
    private Date UpdatedOn;
    private String UpdatedBy;

    public TransactionTypes() {
    }

    public TransactionTypes(String TransactionTypesName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.TransactionTypesName = TransactionTypesName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }

    public TransactionTypes(long TransactionTypes, String TransactionTypesName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.TransactionTypes = TransactionTypes;
        this.TransactionTypesName = TransactionTypesName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }

}
