/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcCFMMCTradingAccountTokenField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountTokenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcCFMMCTradingAccountTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_get(swigCPtr, this);
  }

  public void setToken(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_set(swigCPtr, this, value);
  }

  public String getToken() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountTokenField() {
    this(ctpJNI.new_CThostFtdcCFMMCTradingAccountTokenField(), true);
  }

}
