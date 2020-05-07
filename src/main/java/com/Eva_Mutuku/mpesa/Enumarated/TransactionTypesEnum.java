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
public enum TransactionTypesEnum {
    SendMoney(1, "SendMoney"), //Cons to cons
    Withdrawal(2, "Withdrawal"),
    BalanceEnquiry(3, "BalanceEnquiry"),
    Reversal(4, "Reversal"),
    ClientToPaybill(5, "ClientToPaybill"), //client paying by Paybill
    AgentToPaybill(6, "AgentToPaybill"), //agent paying by paybill
    DirectDebit(7, "DirectDebit"), //sending money to bank account
    FItoWallet(8, "FItoWallet"),
    FItoFI(9, "FItoFI"),
    Disbursement(10, "Disbursement"), //sending money to many people
    SettingPIN(11, "SettingPIN"), //setting your mpesa pin
    UpdatePIN(12, "UpdatePIN"),
    FISetPIN(13, "FISetPIN"), //setting your mobile banking pin
    FIResetPIN(14, "FIResetPIN"),
    FIUpdatePIN(15, "FIUpdatePIN"),
    TakeLoan(16, "TakeLoan"),
    PayLoan(17, "PayLoan"),
    WallettoUnregisteredUser(18, "WallettoUnregisteredUser"),
    CashoutUnregistered(19, "CashoutUnregistered"),
    AgentFloatInjection(20, "AgentFloatInjection"), //topup by mpesa
    AgentCashout(21, "AgentCashout"), //agent giving out money to client
    AgentBalanceEnquiry(22, "AgentBalanceEnquiry"),
    BillerCashout(23, "BillerCashout"),
    BillerFloatInjection(24, "BillerFloatInjection"); //biller tops up their paybill

    private final long TransactionTypeId;
    private final String TransactionTypeName;

    private TransactionTypesEnum(long TransactionTypeId, String TransactionTypeName) {
        this.TransactionTypeId = TransactionTypeId;
        this.TransactionTypeName = TransactionTypeName;
    }

    public long getTransactionTypeId() {
        return TransactionTypeId;
    }

    public String getTransactionTypeName() {
        return TransactionTypeName;
    }

}
