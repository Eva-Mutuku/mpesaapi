/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.Services;

import com.Eva_Mutuku.mpesa.Datalayer.CustomerType;
import com.Eva_Mutuku.mpesa.Datalayer.IdType;
import com.Eva_Mutuku.mpesa.Repositories.CustomerTypeRepository;
import com.Eva_Mutuku.mpesa.Repositories.IdTypeRepository;
import com.Eva_Mutuku.mpesa.Requests.CreateCustomerTypeRequest;
import com.Eva_Mutuku.mpesa.Requests.CreateidtypeRequest;
import com.Eva_Mutuku.mpesa.Requests.UpdateCustomerTypeRequest;
import com.Eva_Mutuku.mpesa.Requests.UpdateIdTypeRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author root
 */
@Service
public class CustomerService {

    ObjectMapper obj = new ObjectMapper();
    @Autowired
    private IdTypeRepository idTypeRepository;

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    public IdType createidType(CreateidtypeRequest idType) {
        try {

            return idTypeRepository.save(new IdType(idType.getIdTypeName(), new Date(), idType.getCreatedBy(), null, null));

        } catch (Exception e) {
            throw e;
        }

    }

    public List<IdType> FetchAllIdTypes() {
        try {
            return idTypeRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public IdType FetchIdTypeByIdTypeName(String IdTypeName) {
        try {
            //return idTypeRepository.findById(10L).get();
            return idTypeRepository.findOneByIdTypeName(IdTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

    public CustomerType CreateCustomerType(CreateCustomerTypeRequest customerType) {
        try {
            return customerTypeRepository.save(new CustomerType(customerType.getCustomerTypeName(), new Date(), customerType.getCreatedBy(), null, null));
        } catch (Exception e) {
            throw e;
        }
    }

    public List<CustomerType> FetchAllCustomerTypes() {
        try {
            return customerTypeRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public CustomerType GetCustomerTypeByCustomerTypeName(String customerTypeName) {
        try {
            return customerTypeRepository.findOneByCustomerTypeName(customerTypeName);
        } catch (Exception e) {
            throw e;
        }
    }

    public CustomerType UpdateCustomerType(UpdateCustomerTypeRequest updatedcustomerType, String CustomerTypeName) throws Exception {
        try {
            CustomerType customertype = GetCustomerTypeByCustomerTypeName(CustomerTypeName);
            if (customertype == null) {
                throw new Exception("Customer Type is not available");
            } else {
                customertype.setCustomerTypeName(updatedcustomerType.getCustomerTypeName() == null ? customertype.getCustomerTypeName() : updatedcustomerType.getCustomerTypeName());
                customertype.setUpdatedBy(updatedcustomerType.getUpdatedBy());
                customertype.setUpdatedOn(new Date());
                customertype = customerTypeRepository.save(customertype);
                return customertype;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public IdType UpdateIdType(UpdateIdTypeRequest updatedidType, String idTypeName) throws Exception {
        try {
            IdType idtype = FetchIdTypeByIdTypeName(idTypeName);
            if (idtype == null) {
                throw new Exception("IdType is not available.");
            } else {
                idtype.setIdTypeName(updatedidType.getIdTypeName() == null ? idtype.getIdTypeName() : updatedidType.getIdTypeName());
                idtype.setUpdatedBy(updatedidType.getUpdatedBy());
                idtype.setUpdatedOn(new Date());
                idtype = idTypeRepository.save(idtype);
                return idtype;
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
