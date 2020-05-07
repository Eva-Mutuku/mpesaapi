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
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
public class PaymentInstruments implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PaymentInstruments_seq")
    @SequenceGenerator(name = "PaymentInstruments_seq", initialValue = 1, allocationSize = 1, sequenceName = "PaymentInstrument_seq")
    private long PaymentInstrumentsId;
    private double Account;
    private Date CreatedOn;
    private String CreatedBy;
    private Date UpdatedOn;
    private String UpdatedBy;

    @OneToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "PaymentInstrumentTypesId", nullable = false)
    private PaymentInstrumentTypes paymentInstrumentType;

    public PaymentInstruments() {
    }

    public PaymentInstruments(double Account, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy, Customer customer, PaymentInstrumentTypes paymentInstrumentType) {
        this.Account = Account;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
        this.customer = customer;
        this.paymentInstrumentType = paymentInstrumentType;
    }

}
