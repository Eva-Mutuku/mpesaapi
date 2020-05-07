/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Enumarated;

/**
 *
 * @author root
 */
public enum IdTypeEnum {
    National(1, "National"),
    Military(2,"Military"),
    Passport(3,"Passport");
    private final long IdTypeId;
    private final String IdTypeName;

    private IdTypeEnum(long IdTypeId, String IdTypeName) {
        this.IdTypeId = IdTypeId;
        this.IdTypeName = IdTypeName;
    }

    public long getIdTypeId() {
        return IdTypeId;
    }

    public String getIdTypeName() {
        return IdTypeName;
    }
    
    
}
