/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcInstrumentStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setSettlementGroupID(String value) {
    ctpJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_set(swigCPtr, this, value);
  }

  public String getSettlementGroupID() {
    return ctpJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcInstrumentStatusField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcInstrumentStatusField_InstrumentID_get(swigCPtr, this);
  }

  public void setInstrumentStatus(char value) {
    ctpJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_set(swigCPtr, this, value);
  }

  public char getInstrumentStatus() {
    return ctpJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_get(swigCPtr, this);
  }

  public void setTradingSegmentSN(int value) {
    ctpJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_set(swigCPtr, this, value);
  }

  public int getTradingSegmentSN() {
    return ctpJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_get(swigCPtr, this);
  }

  public void setEnterTime(String value) {
    ctpJNI.CThostFtdcInstrumentStatusField_EnterTime_set(swigCPtr, this, value);
  }

  public String getEnterTime() {
    return ctpJNI.CThostFtdcInstrumentStatusField_EnterTime_get(swigCPtr, this);
  }

  public void setEnterReason(char value) {
    ctpJNI.CThostFtdcInstrumentStatusField_EnterReason_set(swigCPtr, this, value);
  }

  public char getEnterReason() {
    return ctpJNI.CThostFtdcInstrumentStatusField_EnterReason_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentStatusField() {
    this(ctpJNI.new_CThostFtdcInstrumentStatusField(), true);
  }

}
