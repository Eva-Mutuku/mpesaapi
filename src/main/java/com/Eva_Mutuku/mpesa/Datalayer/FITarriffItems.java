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
public class FITarriffItems implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FITarriffItems_seq")
    @SequenceGenerator(name = "FITarriffItems_seq", initialValue = 1, allocationSize = 1, sequenceName = "FITarriffItem_seq")
    private long FITarriffItemsId;

    private long MinValue;
    private long MaxValue;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date CreatedOn;
    private String CreatedBy;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date UpdatedOn;
    private String UpdatedBy;

    @OneToOne
    @JoinColumn(name = "FITarriffsId")
    private FITarriffs FITarriff;

    public FITarriffItems() {
    }

    public FITarriffItems(long MinValue, long MaxValue, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy, FITarriffs FITarriff) {
        this.MinValue = MinValue;
        this.MaxValue = MaxValue;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
        this.FITarriff = FITarriff;
    }

}
