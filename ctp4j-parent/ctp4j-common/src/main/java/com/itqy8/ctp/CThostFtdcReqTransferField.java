/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcReqTransferField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqTransferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcReqTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcReqTransferField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcReqTransferField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcReqTransferField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcReqTransferField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcReqTransferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcReqTransferField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcReqTransferField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcReqTransferField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcReqTransferField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcReqTransferField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcReqTransferField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcReqTransferField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcReqTransferField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcReqTransferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcReqTransferField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcReqTransferField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcReqTransferField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcReqTransferField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcReqTransferField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcReqTransferField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcReqTransferField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcReqTransferField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcReqTransferField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcReqTransferField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcReqTransferField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcReqTransferField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcReqTransferField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcReqTransferField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcReqTransferField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcReqTransferField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpJNI.CThostFtdcReqTransferField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcReqTransferField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcReqTransferField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcReqTransferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcReqTransferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcReqTransferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcReqTransferField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ctpJNI.CThostFtdcReqTransferField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ctpJNI.CThostFtdcReqTransferField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcReqTransferField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcReqTransferField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ctpJNI.CThostFtdcReqTransferField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ctpJNI.CThostFtdcReqTransferField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcReqTransferField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcReqTransferField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    ctpJNI.CThostFtdcReqTransferField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return ctpJNI.CThostFtdcReqTransferField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    ctpJNI.CThostFtdcReqTransferField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return ctpJNI.CThostFtdcReqTransferField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    ctpJNI.CThostFtdcReqTransferField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return ctpJNI.CThostFtdcReqTransferField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ctpJNI.CThostFtdcReqTransferField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ctpJNI.CThostFtdcReqTransferField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    ctpJNI.CThostFtdcReqTransferField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return ctpJNI.CThostFtdcReqTransferField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ctpJNI.CThostFtdcReqTransferField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ctpJNI.CThostFtdcReqTransferField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpJNI.CThostFtdcReqTransferField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpJNI.CThostFtdcReqTransferField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ctpJNI.CThostFtdcReqTransferField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ctpJNI.CThostFtdcReqTransferField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpJNI.CThostFtdcReqTransferField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpJNI.CThostFtdcReqTransferField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ctpJNI.CThostFtdcReqTransferField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ctpJNI.CThostFtdcReqTransferField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpJNI.CThostFtdcReqTransferField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpJNI.CThostFtdcReqTransferField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ctpJNI.CThostFtdcReqTransferField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ctpJNI.CThostFtdcReqTransferField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ctpJNI.CThostFtdcReqTransferField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ctpJNI.CThostFtdcReqTransferField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ctpJNI.CThostFtdcReqTransferField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ctpJNI.CThostFtdcReqTransferField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpJNI.CThostFtdcReqTransferField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpJNI.CThostFtdcReqTransferField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcReqTransferField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcReqTransferField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpJNI.CThostFtdcReqTransferField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpJNI.CThostFtdcReqTransferField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    ctpJNI.CThostFtdcReqTransferField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return ctpJNI.CThostFtdcReqTransferField_TransferStatus_get(swigCPtr, this);
  }

  public CThostFtdcReqTransferField() {
    this(ctpJNI.new_CThostFtdcReqTransferField(), true);
  }

}
