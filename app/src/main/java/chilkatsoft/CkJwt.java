/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package chilkatsoft;

public class CkJwt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkJwt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkJwt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkJwt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkJwt() {
    this(chilkatJNI.new_CkJwt(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkJwt_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkJwt_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkJwt_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AutoCompact() {
    return chilkatJNI.CkJwt_get_AutoCompact(swigCPtr, this);
  }

  public void put_AutoCompact(boolean newVal) {
    chilkatJNI.CkJwt_put_AutoCompact(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkJwt_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkJwt_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkJwt_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkJwt_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkJwt_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkJwt_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkJwt_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkJwt_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkJwt_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkJwt_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkJwt_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkJwt_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkJwt_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkJwt_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkJwt_version(swigCPtr, this);
  }

  public boolean CreateJwt(String header, String payload, String password, CkString outStr) {
    return chilkatJNI.CkJwt_CreateJwt(swigCPtr, this, header, payload, password, CkString.getCPtr(outStr), outStr);
  }

  public String createJwt(String header, String payload, String password) {
    return chilkatJNI.CkJwt_createJwt(swigCPtr, this, header, payload, password);
  }

  public boolean CreateJwtPk(String header, String payload, CkPrivateKey key, CkString outStr) {
    return chilkatJNI.CkJwt_CreateJwtPk(swigCPtr, this, header, payload, CkPrivateKey.getCPtr(key), key, CkString.getCPtr(outStr), outStr);
  }

  public String createJwtPk(String header, String payload, CkPrivateKey key) {
    return chilkatJNI.CkJwt_createJwtPk(swigCPtr, this, header, payload, CkPrivateKey.getCPtr(key), key);
  }

  public int GenNumericDate(int numSecOffset) {
    return chilkatJNI.CkJwt_GenNumericDate(swigCPtr, this, numSecOffset);
  }

  public boolean GetHeader(String token, CkString outStr) {
    return chilkatJNI.CkJwt_GetHeader(swigCPtr, this, token, CkString.getCPtr(outStr), outStr);
  }

  public String getHeader(String token) {
    return chilkatJNI.CkJwt_getHeader(swigCPtr, this, token);
  }

  public String header(String token) {
    return chilkatJNI.CkJwt_header(swigCPtr, this, token);
  }

  public boolean GetPayload(String token, CkString outStr) {
    return chilkatJNI.CkJwt_GetPayload(swigCPtr, this, token, CkString.getCPtr(outStr), outStr);
  }

  public String getPayload(String token) {
    return chilkatJNI.CkJwt_getPayload(swigCPtr, this, token);
  }

  public String payload(String token) {
    return chilkatJNI.CkJwt_payload(swigCPtr, this, token);
  }

  public boolean IsTimeValid(String jwt, int leeway) {
    return chilkatJNI.CkJwt_IsTimeValid(swigCPtr, this, jwt, leeway);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkJwt_SaveLastError(swigCPtr, this, path);
  }

  public boolean VerifyJwt(String token, String password) {
    return chilkatJNI.CkJwt_VerifyJwt(swigCPtr, this, token, password);
  }

  public boolean VerifyJwtPk(String token, CkPublicKey key) {
    return chilkatJNI.CkJwt_VerifyJwtPk(swigCPtr, this, token, CkPublicKey.getCPtr(key), key);
  }

}
