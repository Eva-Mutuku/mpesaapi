/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Requests;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author root
 */
@Data
public class CreateCustomerTypeRequest {

    @NotNull(message = "This field cannot be empty")
    private String customerTypeName;
    @NotNull(message = "This field cannot be empty")
    private String createdBy;
}
