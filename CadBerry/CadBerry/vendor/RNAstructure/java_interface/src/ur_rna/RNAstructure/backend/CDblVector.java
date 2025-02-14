/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ur_rna.RNAstructure.backend;

public class CDblVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CDblVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CDblVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RNABackendJNI.delete_CDblVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CDblVector() {
    this(RNABackendJNI.new_CDblVector__SWIG_0(), true);
  }

  public CDblVector(long n) {
    this(RNABackendJNI.new_CDblVector__SWIG_1(n), true);
  }

  public long size() {
    return RNABackendJNI.CDblVector_size(swigCPtr, this);
  }

  public long capacity() {
    return RNABackendJNI.CDblVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    RNABackendJNI.CDblVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return RNABackendJNI.CDblVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    RNABackendJNI.CDblVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    RNABackendJNI.CDblVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return RNABackendJNI.CDblVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    RNABackendJNI.CDblVector_set(swigCPtr, this, i, val);
  }

}
