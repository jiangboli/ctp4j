/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcCFMMCTradingAccountKeyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcCFMMCTradingAccountKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_KeyID_get(swigCPtr, this);
  }

  public void setCurrentKey(String value) {
    ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_CurrentKey_set(swigCPtr, this, value);
  }

  public String getCurrentKey() {
    return ctpJNI.CThostFtdcCFMMCTradingAccountKeyField_CurrentKey_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountKeyField() {
    this(ctpJNI.new_CThostFtdcCFMMCTradingAccountKeyField(), true);
  }

}