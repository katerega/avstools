/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package chilkatsoft;

public class CkStringBuilder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkStringBuilder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkStringBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkStringBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkStringBuilder() {
    this(chilkatJNI.new_CkStringBuilder(), true);
  }

  public int get_IntValue() {
    return chilkatJNI.CkStringBuilder_get_IntValue(swigCPtr, this);
  }

  public void put_IntValue(int newVal) {
    chilkatJNI.CkStringBuilder_put_IntValue(swigCPtr, this, newVal);
  }

  public boolean get_IsBase64() {
    return chilkatJNI.CkStringBuilder_get_IsBase64(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkStringBuilder_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkStringBuilder_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_Length() {
    return chilkatJNI.CkStringBuilder_get_Length(swigCPtr, this);
  }

  public boolean Append(String value) {
    return chilkatJNI.CkStringBuilder_Append(swigCPtr, this, value);
  }

  public boolean AppendBd(CkBinData binData, String charset, int offset, int numBytes) {
    return chilkatJNI.CkStringBuilder_AppendBd(swigCPtr, this, CkBinData.getCPtr(binData), binData, charset, offset, numBytes);
  }

  public boolean AppendEncoded(CkByteData binaryData, String encoding) {
    return chilkatJNI.CkStringBuilder_AppendEncoded(swigCPtr, this, CkByteData.getCPtr(binaryData), binaryData, encoding);
  }

  public boolean AppendInt(int value) {
    return chilkatJNI.CkStringBuilder_AppendInt(swigCPtr, this, value);
  }

  public boolean AppendInt64(long value) {
    return chilkatJNI.CkStringBuilder_AppendInt64(swigCPtr, this, value);
  }

  public boolean AppendLine(String value, boolean crlf) {
    return chilkatJNI.CkStringBuilder_AppendLine(swigCPtr, this, value, crlf);
  }

  public boolean AppendSb(CkStringBuilder sb) {
    return chilkatJNI.CkStringBuilder_AppendSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public void Clear() {
    chilkatJNI.CkStringBuilder_Clear(swigCPtr, this);
  }

  public boolean Contains(String str, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_Contains(swigCPtr, this, str, caseSensitive);
  }

  public boolean ContainsWord(String word, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_ContainsWord(swigCPtr, this, word, caseSensitive);
  }

  public boolean ContentsEqual(String str, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_ContentsEqual(swigCPtr, this, str, caseSensitive);
  }

  public boolean ContentsEqualSb(CkStringBuilder sb, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_ContentsEqualSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb, caseSensitive);
  }

  public boolean Decode(String encoding, String charset) {
    return chilkatJNI.CkStringBuilder_Decode(swigCPtr, this, encoding, charset);
  }

  public boolean Encode(String encoding, String charset) {
    return chilkatJNI.CkStringBuilder_Encode(swigCPtr, this, encoding, charset);
  }

  public boolean EndsWith(String substr, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_EndsWith(swigCPtr, this, substr, caseSensitive);
  }

  public boolean EntityDecode() {
    return chilkatJNI.CkStringBuilder_EntityDecode(swigCPtr, this);
  }

  public boolean GetAfterBetween(String searchAfter, String beginMark, String endMark, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetAfterBetween(swigCPtr, this, searchAfter, beginMark, endMark, CkString.getCPtr(outStr), outStr);
  }

  public String getAfterBetween(String searchAfter, String beginMark, String endMark) {
    return chilkatJNI.CkStringBuilder_getAfterBetween(swigCPtr, this, searchAfter, beginMark, endMark);
  }

  public String afterBetween(String searchAfter, String beginMark, String endMark) {
    return chilkatJNI.CkStringBuilder_afterBetween(swigCPtr, this, searchAfter, beginMark, endMark);
  }

  public boolean GetAfterFinal(String marker, boolean removeFlag, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetAfterFinal(swigCPtr, this, marker, removeFlag, CkString.getCPtr(outStr), outStr);
  }

  public String getAfterFinal(String marker, boolean removeFlag) {
    return chilkatJNI.CkStringBuilder_getAfterFinal(swigCPtr, this, marker, removeFlag);
  }

  public String afterFinal(String marker, boolean removeFlag) {
    return chilkatJNI.CkStringBuilder_afterFinal(swigCPtr, this, marker, removeFlag);
  }

  public boolean GetAsString(CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetAsString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getAsString() {
    return chilkatJNI.CkStringBuilder_getAsString(swigCPtr, this);
  }

  public String asString() {
    return chilkatJNI.CkStringBuilder_asString(swigCPtr, this);
  }

  public boolean GetBefore(String marker, boolean removeFlag, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetBefore(swigCPtr, this, marker, removeFlag, CkString.getCPtr(outStr), outStr);
  }

  public String getBefore(String marker, boolean removeFlag) {
    return chilkatJNI.CkStringBuilder_getBefore(swigCPtr, this, marker, removeFlag);
  }

  public String before(String marker, boolean removeFlag) {
    return chilkatJNI.CkStringBuilder_before(swigCPtr, this, marker, removeFlag);
  }

  public boolean GetBetween(String beginMark, String endMark, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetBetween(swigCPtr, this, beginMark, endMark, CkString.getCPtr(outStr), outStr);
  }

  public String getBetween(String beginMark, String endMark) {
    return chilkatJNI.CkStringBuilder_getBetween(swigCPtr, this, beginMark, endMark);
  }

  public String between(String beginMark, String endMark) {
    return chilkatJNI.CkStringBuilder_between(swigCPtr, this, beginMark, endMark);
  }

  public boolean GetDecoded(String encoding, CkByteData outBytes) {
    return chilkatJNI.CkStringBuilder_GetDecoded(swigCPtr, this, encoding, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetEncoded(String encoding, String charset, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetEncoded(swigCPtr, this, encoding, charset, CkString.getCPtr(outStr), outStr);
  }

  public String getEncoded(String encoding, String charset) {
    return chilkatJNI.CkStringBuilder_getEncoded(swigCPtr, this, encoding, charset);
  }

  public String encoded(String encoding, String charset) {
    return chilkatJNI.CkStringBuilder_encoded(swigCPtr, this, encoding, charset);
  }

  public boolean GetNth(int index, String delimiterChar, boolean exceptDoubleQuoted, boolean exceptEscaped, CkString outStr) {
    return chilkatJNI.CkStringBuilder_GetNth(swigCPtr, this, index, delimiterChar, exceptDoubleQuoted, exceptEscaped, CkString.getCPtr(outStr), outStr);
  }

  public String getNth(int index, String delimiterChar, boolean exceptDoubleQuoted, boolean exceptEscaped) {
    return chilkatJNI.CkStringBuilder_getNth(swigCPtr, this, index, delimiterChar, exceptDoubleQuoted, exceptEscaped);
  }

  public String nth(int index, String delimiterChar, boolean exceptDoubleQuoted, boolean exceptEscaped) {
    return chilkatJNI.CkStringBuilder_nth(swigCPtr, this, index, delimiterChar, exceptDoubleQuoted, exceptEscaped);
  }

  public boolean LastNLines(int numLines, boolean bCrlf, CkString outStr) {
    return chilkatJNI.CkStringBuilder_LastNLines(swigCPtr, this, numLines, bCrlf, CkString.getCPtr(outStr), outStr);
  }

  public String lastNLines(int numLines, boolean bCrlf) {
    return chilkatJNI.CkStringBuilder_lastNLines(swigCPtr, this, numLines, bCrlf);
  }

  public boolean LoadFile(String path, String charset) {
    return chilkatJNI.CkStringBuilder_LoadFile(swigCPtr, this, path, charset);
  }

  public void Obfuscate() {
    chilkatJNI.CkStringBuilder_Obfuscate(swigCPtr, this);
  }

  public boolean Prepend(String value) {
    return chilkatJNI.CkStringBuilder_Prepend(swigCPtr, this, value);
  }

  public boolean PunyDecode() {
    return chilkatJNI.CkStringBuilder_PunyDecode(swigCPtr, this);
  }

  public boolean PunyEncode() {
    return chilkatJNI.CkStringBuilder_PunyEncode(swigCPtr, this);
  }

  public boolean RemoveAfterFinal(String marker) {
    return chilkatJNI.CkStringBuilder_RemoveAfterFinal(swigCPtr, this, marker);
  }

  public boolean RemoveBefore(String marker) {
    return chilkatJNI.CkStringBuilder_RemoveBefore(swigCPtr, this, marker);
  }

  public int Replace(String value, String replacement) {
    return chilkatJNI.CkStringBuilder_Replace(swigCPtr, this, value, replacement);
  }

  public boolean ReplaceAfterFinal(String marker, String replacement) {
    return chilkatJNI.CkStringBuilder_ReplaceAfterFinal(swigCPtr, this, marker, replacement);
  }

  public boolean ReplaceAllBetween(String beginMark, String endMark, String replacement, boolean replaceMarks) {
    return chilkatJNI.CkStringBuilder_ReplaceAllBetween(swigCPtr, this, beginMark, endMark, replacement, replaceMarks);
  }

  public int ReplaceBetween(String beginMark, String endMark, String value, String replacement) {
    return chilkatJNI.CkStringBuilder_ReplaceBetween(swigCPtr, this, beginMark, endMark, value, replacement);
  }

  public boolean ReplaceFirst(String value, String replacement) {
    return chilkatJNI.CkStringBuilder_ReplaceFirst(swigCPtr, this, value, replacement);
  }

  public int ReplaceI(String value, int replacement) {
    return chilkatJNI.CkStringBuilder_ReplaceI(swigCPtr, this, value, replacement);
  }

  public int ReplaceWord(String value, String replacement) {
    return chilkatJNI.CkStringBuilder_ReplaceWord(swigCPtr, this, value, replacement);
  }

  public void SecureClear() {
    chilkatJNI.CkStringBuilder_SecureClear(swigCPtr, this);
  }

  public boolean SetNth(int index, String value, String delimiterChar, boolean exceptDoubleQuoted, boolean exceptEscaped) {
    return chilkatJNI.CkStringBuilder_SetNth(swigCPtr, this, index, value, delimiterChar, exceptDoubleQuoted, exceptEscaped);
  }

  public boolean SetString(String value) {
    return chilkatJNI.CkStringBuilder_SetString(swigCPtr, this, value);
  }

  public boolean StartsWith(String substr, boolean caseSensitive) {
    return chilkatJNI.CkStringBuilder_StartsWith(swigCPtr, this, substr, caseSensitive);
  }

  public boolean ToCRLF() {
    return chilkatJNI.CkStringBuilder_ToCRLF(swigCPtr, this);
  }

  public boolean ToLF() {
    return chilkatJNI.CkStringBuilder_ToLF(swigCPtr, this);
  }

  public boolean ToLowercase() {
    return chilkatJNI.CkStringBuilder_ToLowercase(swigCPtr, this);
  }

  public boolean ToUppercase() {
    return chilkatJNI.CkStringBuilder_ToUppercase(swigCPtr, this);
  }

  public boolean Trim() {
    return chilkatJNI.CkStringBuilder_Trim(swigCPtr, this);
  }

  public boolean TrimInsideSpaces() {
    return chilkatJNI.CkStringBuilder_TrimInsideSpaces(swigCPtr, this);
  }

  public void Unobfuscate() {
    chilkatJNI.CkStringBuilder_Unobfuscate(swigCPtr, this);
  }

  public boolean WriteFile(String path, String charset, boolean emitBom) {
    return chilkatJNI.CkStringBuilder_WriteFile(swigCPtr, this, path, charset, emitBom);
  }

  public boolean WriteFileIfModified(String path, String charset, boolean emitBom) {
    return chilkatJNI.CkStringBuilder_WriteFileIfModified(swigCPtr, this, path, charset, emitBom);
  }

}
