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
@Table(name = "IdTypes")
public class IdType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdType_seq")
    @SequenceGenerator(name = "IdType_seq", initialValue = 1, allocationSize = 1, sequenceName = "IdTyp_seq")
    private long idTypeId;

    @Column(name = "idTypeName", nullable = false, unique = true)
    private String idTypeName;

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

    public IdType() {
    }

    public IdType(long idTypeId) {
        this.idTypeId = idTypeId;
    }

    public IdType(String idTypeName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.idTypeName = idTypeName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }

    public IdType(long idTypeId, String idTypeName, Date CreatedOn, String CreatedBy, Date UpdatedOn, String UpdatedBy) {
        this.idTypeId = idTypeId;
        this.idTypeName = idTypeName;
        this.CreatedOn = CreatedOn;
        this.CreatedBy = CreatedBy;
        this.UpdatedOn = UpdatedOn;
        this.UpdatedBy = UpdatedBy;
    }
}
