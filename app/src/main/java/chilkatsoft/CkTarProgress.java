/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package chilkatsoft;

public class CkTarProgress extends CkBaseProgress {
  private transient long swigCPtr;

  protected CkTarProgress(long cPtr, boolean cMemoryOwn) {
    super(chilkatJNI.CkTarProgress_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkTarProgress obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkTarProgress(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    chilkatJNI.CkTarProgress_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    chilkatJNI.CkTarProgress_change_ownership(this, swigCPtr, true);
  }

  public CkTarProgress() {
    this(chilkatJNI.new_CkTarProgress(), true);
    chilkatJNI.CkTarProgress_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean NextTarFile(String path, long fileSize, boolean bIsDirectory) {
    return (getClass() == CkTarProgress.class) ? chilkatJNI.CkTarProgress_NextTarFile(swigCPtr, this, path, fileSize, bIsDirectory) : chilkatJNI.CkTarProgress_NextTarFileSwigExplicitCkTarProgress(swigCPtr, this, path, fileSize, bIsDirectory);
  }

}
