/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcAuthenticationInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    ctpJNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return ctpJNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    ctpJNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return ctpJNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(ctpJNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}
