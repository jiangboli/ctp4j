/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcBrokerTradingParamsField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingParamsField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingParamsField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcBrokerTradingParamsField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_InvestorID_get(swigCPtr, this);
  }

  public void setMarginPriceType(char value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_set(swigCPtr, this, value);
  }

  public char getMarginPriceType() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_Algorithm_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_get(swigCPtr, this);
  }

  public void setOptionRoyaltyPriceType(char value) {
    ctpJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_set(swigCPtr, this, value);
  }

  public char getOptionRoyaltyPriceType() {
    return ctpJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingParamsField() {
    this(ctpJNI.new_CThostFtdcBrokerTradingParamsField(), true);
  }

}
