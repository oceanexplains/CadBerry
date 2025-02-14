/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ur_rna.RNAstructure.backend;

public class ProgressHandler {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProgressHandler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProgressHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RNABackendJNI.delete_ProgressHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void update(int percent) {
    RNABackendJNI.ProgressHandler_update__SWIG_0(swigCPtr, this, percent);
  }

  public void update(double workComplete, double totalWork) {
    RNABackendJNI.ProgressHandler_update__SWIG_1(swigCPtr, this, workComplete, totalWork);
  }

  public void updateFraction(double fractionComplete) {
    RNABackendJNI.ProgressHandler_updateFraction(swigCPtr, this, fractionComplete);
  }

  public boolean canceled() {
    return RNABackendJNI.ProgressHandler_canceled(swigCPtr, this);
  }

  public void cancel() {
    RNABackendJNI.ProgressHandler_cancel(swigCPtr, this);
  }

  public int progress() {
    return RNABackendJNI.ProgressHandler_progress(swigCPtr, this);
  }

  public void reset() {
    RNABackendJNI.ProgressHandler_reset(swigCPtr, this);
  }

}
