/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcQryProductExchRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryProductExchRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductExchRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQryProductExchRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ctpJNI.CThostFtdcQryProductExchRateField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ctpJNI.CThostFtdcQryProductExchRateField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductExchRateField() {
    this(ctpJNI.new_CThostFtdcQryProductExchRateField(), true);
  }

}
