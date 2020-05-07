/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Datalayer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
public class ConsumerTarriffs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Tarriffs_seq")
    @SequenceGenerator(name = "Tarriffs_seq", initialValue = 1, allocationSize = 1, sequenceName = "Tarriff_seq")
    private long ConsumerTarriffsId;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date CreatedOn;
    private String CreatedBy;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date UpdatedOn;
    private String UpdatedBy;

    @OneToOne
    @JoinColumn(name = "TransactionTypes")
    private TransactionTypes transactiontype;

    @OneToOne
    @JoinColumn(name = "CustomerTypeId")
    private CustomerType customertype;

    public ConsumerTarriffs() {
    }

    public ConsumerTarriffs(Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy, TransactionTypes transactiontype, CustomerType customertype) {
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
        this.transactiontype = transactiontype;
        this.customertype = customertype;
    }

}
