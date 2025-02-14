/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ur_rna.RNAstructureUI.drawing.proxy;

public class StructureBackend {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StructureBackend(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StructureBackend obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        StructureBackendProxyJNI.delete_StructureBackend(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StructureBackend() {
    this(StructureBackendProxyJNI.new_StructureBackend(), true);
  }

  public boolean addAnnotationProbability(String file) {
    return StructureBackendProxyJNI.StructureBackend_addAnnotationProbability(swigCPtr, this, file);
  }

  public boolean addAnnotationSHAPE(String file) {
    return StructureBackendProxyJNI.StructureBackend_addAnnotationSHAPE(swigCPtr, this, file);
  }

  public void flip() {
    StructureBackendProxyJNI.StructureBackend_flip(swigCPtr, this);
  }

  public void setFlipped(boolean flipped) {
    StructureBackendProxyJNI.StructureBackend_setFlipped(swigCPtr, this, flipped);
  }

  public String getStructureData(int number) {
    return StructureBackendProxyJNI.StructureBackend_getStructureData(swigCPtr, this, number);
  }

  public String readStructureData(String file) {
    return StructureBackendProxyJNI.StructureBackend_readStructureData(swigCPtr, this, file);
  }

  public void removeAnnotation() {
    StructureBackendProxyJNI.StructureBackend_removeAnnotation(swigCPtr, this);
  }

  public void setNucleotidesCircled(boolean circled) {
    StructureBackendProxyJNI.StructureBackend_setNucleotidesCircled(swigCPtr, this, circled);
  }

  public void setBackboneStyle(int style) {
    StructureBackendProxyJNI.StructureBackend_setBackboneStyle(swigCPtr, this, style);
  }

  public String writeDotBracketFile(String inFile, String outFile) {
    return StructureBackendProxyJNI.StructureBackend_writeDotBracketFile(swigCPtr, this, inFile, outFile);
  }

  public String writeHelixFile(String inFile, String outFile, int number) {
    return StructureBackendProxyJNI.StructureBackend_writeHelixFile(swigCPtr, this, inFile, outFile, number);
  }

  public void writePostscriptFile(String outFile, int number) {
    StructureBackendProxyJNI.StructureBackend_writePostscriptFile(swigCPtr, this, outFile, number);
  }

  public void writeSVGFile(String outFile, int number) {
    StructureBackendProxyJNI.StructureBackend_writeSVGFile(swigCPtr, this, outFile, number);
  }

  public int getStructureCount() {
    return StructureBackendProxyJNI.StructureBackend_getStructureCount(swigCPtr, this);
  }

}
