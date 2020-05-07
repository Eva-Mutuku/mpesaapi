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
public enum PaymentInstrumentTypesEnums {
    TillNumber(1, "TillNumber"),
    PayBill(2, "PayBill"),
    AgentNumber(3, "AgentNumber"),
    ConsumerWallet(4, "ConsumerWallet"),
    BankSVA(5, "BankSVA"),
    CommissionSVA(6, "CommissionSVA"),
    ATM(7, "ATM");
    private final String PITypeName;
    private final long PITypeId;

    private PaymentInstrumentTypesEnums(long PITypeId, String PITypeName) {
        this.PITypeName = PITypeName;
        this.PITypeId = PITypeId;
    }

    public String getPITypeName() {
        return PITypeName;
    }

    public long getPITypeId() {
        return PITypeId;
    }

}
