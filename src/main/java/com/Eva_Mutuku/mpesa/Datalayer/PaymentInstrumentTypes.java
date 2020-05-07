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
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
@Entity
public class PaymentInstrumentTypes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PaymentInstrumentTypes_seq")
    @SequenceGenerator(name = "PaymentInstrumentTypes_seq", initialValue = 1, allocationSize = 1, sequenceName = "PaymentInstrumentTyp_seq")
    private long PaymentInstrumentTypesId;

    @Column(name = "PITypeName", nullable = false)
    private String PITypeName;

    @Column(name = "createdBy", nullable = false)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "updatedBy")
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @ManyToOne
    @JoinColumn(name = "CustomerTypeId", nullable = false)
    private CustomerType customerType;

    public PaymentInstrumentTypes() {
    }

    public PaymentInstrumentTypes(long PaymentInstrumentTypesId) {
        this.PaymentInstrumentTypesId = PaymentInstrumentTypesId;
    }

    public PaymentInstrumentTypes(String PITypeName, String createdBy, Date createdOn, String updatedBy, Date updatedOn, CustomerType customerType) {
        this.PITypeName = PITypeName;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.customerType = customerType;
    }

    public PaymentInstrumentTypes(long PaymentInstrumentTypesId, String PITypeName, String createdBy, Date createdOn, String updatedBy, Date updatedOn, CustomerType customerType) {
        this.PaymentInstrumentTypesId = PaymentInstrumentTypesId;
        this.PITypeName = PITypeName;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.customerType = customerType;
    }

}
