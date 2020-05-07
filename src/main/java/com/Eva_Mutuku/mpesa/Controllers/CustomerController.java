/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Controllers;

import com.Eva_Mutuku.mpesa.Datalayer.CustomerType;
import com.Eva_Mutuku.mpesa.Datalayer.IdType;
import com.Eva_Mutuku.mpesa.Requests.CreateCustomerTypeRequest;
import com.Eva_Mutuku.mpesa.Requests.CreateidtypeRequest;
import com.Eva_Mutuku.mpesa.Requests.UpdateCustomerTypeRequest;
import com.Eva_Mutuku.mpesa.Requests.UpdateIdTypeRequest;
import com.Eva_Mutuku.mpesa.Services.CustomerService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
@RequestMapping("api/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/Create")
    public IdType CreatIdType(@Valid @RequestBody CreateidtypeRequest idType) {
        try {
            return customerService.createidType(idType);
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/FetchAllIdTypes") //fetch all records
    public List<IdType> FetchAllIdTypes() {
        try {
            return customerService.FetchAllIdTypes();
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/FetchIdTypeByIdTypeName")
    public IdType FetchIdTypeByIdTypeName(@RequestParam("IdTypeName") String IdTypeName) throws Exception {
        try {
            return customerService.FetchIdTypeByIdTypeName(IdTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

    @PostMapping("/Create/CustomerType") //create a new customer type
    public CustomerType CreateCustomerType(@Valid @RequestBody CreateCustomerTypeRequest customerType) {
        try {
            return customerService.CreateCustomerType(customerType);
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("FetchAllCustomerTypes") //get a list of all customer types in DB
    public List<CustomerType> FetchAllCustomerTypes() {
        try {
            return customerService.FetchAllCustomerTypes();
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/GetCustomerTypeByCustomerTypeName")
    public CustomerType GetCustomerTypeByCustomerTypeName(@RequestParam("customerTypeName") String customerTypeName) {
        try {
            return customerService.GetCustomerTypeByCustomerTypeName(customerTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param customerType
     * @param customerTypeName
     * @return
     * @throws java.lang.Exception
     */
    @PatchMapping("/Update/CustomerTypeByName") //update the name of customer type
    public CustomerType UpdateCustomerType(@Valid @RequestBody UpdateCustomerTypeRequest customerType, @RequestParam("customerTypeName") String customerTypeName) throws Exception {
        try {
            return customerService.UpdateCustomerType(customerType, customerTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

    @PatchMapping("/Update/IdTypeByName") //update id type by name
    public IdType UpdateIdType(@Valid @RequestBody UpdateIdTypeRequest idType, @RequestParam("idTypeName") String idTypeName) throws Exception {
        try {
            return customerService.UpdateIdType(idType, idTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

}
