/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eva_Mutuku.mpesa.config;

import com.Eva_Mutuku.mpesa.Datalayer.CustomerType;
import com.Eva_Mutuku.mpesa.Datalayer.IdType;
import com.Eva_Mutuku.mpesa.Datalayer.PaymentInstrumentTypes;
import com.Eva_Mutuku.mpesa.Datalayer.TransactionTypes;
import com.Eva_Mutuku.mpesa.Enumarated.CustomerTypesEnum;
import com.Eva_Mutuku.mpesa.Enumarated.IdTypeEnum;
import com.Eva_Mutuku.mpesa.Enumarated.PaymentInstrumentTypesEnums;
import com.Eva_Mutuku.mpesa.Enumarated.TransactionTypesEnum;
import com.Eva_Mutuku.mpesa.Repositories.CustomerTypeRepository;
import com.Eva_Mutuku.mpesa.Repositories.IdTypeRepository;
import com.Eva_Mutuku.mpesa.Repositories.PaymentInstrumentTypesRepository;
import com.Eva_Mutuku.mpesa.Repositories.TransactionTypesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component //scan this bean at runtime
public class Seeder {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Autowired
    private IdTypeRepository idTypeRepository;

    @Autowired
    private TransactionTypesRepository transactionTypesRepository;

    @Autowired
    private PaymentInstrumentTypesRepository paymentInstrumentTypesRepository;
    ObjectMapper obj = new ObjectMapper();

    @EventListener({ContextRefreshedEvent.class})
    void contextRefreshedEvent() throws Exception {
        if (idTypeRepository.count() > 0) {
            return;
        }

        List<IdType> idtypes = new ArrayList<>();
        Arrays.asList(IdTypeEnum.values()).forEach(idtype -> {
            idtypes.add(new IdType(idtype.getIdTypeId(), idtype.getIdTypeName(), new Date(), "System", null, null));
        });
        idTypeRepository.saveAll(idtypes);

        List<CustomerType> customerTypes = new ArrayList<>();
        Arrays.asList(CustomerTypesEnum.values()).forEach(customerType -> {
            customerTypes.add(new CustomerType(customerType.getCustomerTypeId(), customerType.getCustomerTypeName(), new Date(), "System", null, null));
        });
        customerTypeRepository.saveAll(customerTypes);

        List<PaymentInstrumentTypes> paymentInstrumenttypes = new ArrayList<>();
        Arrays.asList(PaymentInstrumentTypesEnums.values()).forEach(paymentInstrumenttype -> {
            long customertypeid = 0;
            System.out.println("pitypeNsame=" + paymentInstrumenttype.getPITypeName());
            switch (paymentInstrumenttype.getPITypeName()) {
                case "TillNumber":
                    customertypeid = CustomerTypesEnum.Merchant.getCustomerTypeId();
                    break;
                case "PayBill":
                    customertypeid = CustomerTypesEnum.Biller.getCustomerTypeId();
                    break;
                case "AgentNumber":
                    customertypeid = CustomerTypesEnum.Agent.getCustomerTypeId();
                    break;
                case "ConsumerWallet":
                    customertypeid = CustomerTypesEnum.Consumer.getCustomerTypeId();
                    break;
                case "BankSVA":
                    customertypeid = CustomerTypesEnum.FinancialInstrumentUser.getCustomerTypeId();
                    break;
                case "CommissionSVA":
                    customertypeid = CustomerTypesEnum.NonFinancialInstrumentUser.getCustomerTypeId();
                    break;
                case "ATM":
                    customertypeid = CustomerTypesEnum.BankOutlet.getCustomerTypeId();
                    break;

                default:
                    break;
            }
            System.out.println("CustomerTypeId=" + customertypeid);
            paymentInstrumenttypes.add(new PaymentInstrumentTypes(paymentInstrumenttype.getPITypeId(), paymentInstrumenttype.getPITypeName(), "System", new Date(), null, null, new CustomerType(customertypeid)));
        });
        // System.out.println("listData=" + obj.writerWithDefaultPrettyPrinter().writeValueAsString(paymentInstrumenttypes));
        paymentInstrumentTypesRepository.saveAll(paymentInstrumenttypes);

        List<TransactionTypes> transactionTypes = new ArrayList<>();
        Arrays.asList(TransactionTypesEnum.values()).forEach(transactionType -> {
            transactionTypes.add(new TransactionTypes(transactionType.getTransactionTypeId(), transactionType.getTransactionTypeName(), new Date(), "System", null, null));
        });
        transactionTypesRepository.saveAll(transactionTypes);

    }
}
