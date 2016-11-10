/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcReqChangeAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqChangeAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqChangeAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcReqChangeAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcReqChangeAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcReqChangeAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcReqChangeAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcReqChangeAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcReqChangeAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcReqChangeAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcReqChangeAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcReqChangeAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcReqChangeAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcReqChangeAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ctpJNI.CThostFtdcReqChangeAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcReqChangeAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ctpJNI.CThostFtdcReqChangeAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ctpJNI.CThostFtdcReqChangeAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ctpJNI.CThostFtdcReqChangeAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ctpJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setNewBankAccount(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
  }

  public String getNewBankAccount() {
    return ctpJNI.CThostFtdcReqChangeAccountField_NewBankAccount_get(swigCPtr, this);
  }

  public void setNewBankPassWord(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
  }

  public String getNewBankPassWord() {
    return ctpJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Password_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcReqChangeAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ctpJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ctpJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ctpJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ctpJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpJNI.CThostFtdcReqChangeAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpJNI.CThostFtdcReqChangeAccountField_TID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpJNI.CThostFtdcReqChangeAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpJNI.CThostFtdcReqChangeAccountField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcReqChangeAccountField() {
    this(ctpJNI.new_CThostFtdcReqChangeAccountField(), true);
  }

}
