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
public enum CustomerTypesEnum {
    Consumer(1, "Consumer"),
    Biller(2, "Biller"),
    Agent(3, "Agent"),
    Merchant(4, "Merchant"),
    FinancialInstrumentUser(5, "FinancialInstrumentUser"),
    NonFinancialInstrumentUser(6, "NonFinancialInstrumentUser"),
    BankOutlet(7, "BankOutlet");
    private final String CustomerTypeName;
    private final long CustomerTypeId;

    private CustomerTypesEnum(long CustomerTypeId, String CustomerTypeName) {
        this.CustomerTypeName = CustomerTypeName;
        this.CustomerTypeId = CustomerTypeId;
    }

    public String getCustomerTypeName() {
        return CustomerTypeName;
    }

    public long getCustomerTypeId() {
        return CustomerTypeId;
    }

}
