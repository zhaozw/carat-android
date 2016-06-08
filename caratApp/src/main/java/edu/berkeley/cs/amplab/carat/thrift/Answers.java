/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-8")
public class Answers implements org.apache.thrift.TBase<Answers, Answers._Fields>, java.io.Serializable, Cloneable, Comparable<Answers> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Answers");

  private static final org.apache.thrift.protocol.TField UU_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField ANSWERS_FIELD_DESC = new org.apache.thrift.protocol.TField("answers", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnswersStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnswersTupleSchemeFactory());
  }

  public String uuId; // required
  public double timestamp; // optional
  public List<QuestionnaireAnswer> answers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UU_ID((short)1, "uuId"),
    TIMESTAMP((short)2, "timestamp"),
    ANSWERS((short)3, "answers");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UU_ID
          return UU_ID;
        case 2: // TIMESTAMP
          return TIMESTAMP;
        case 3: // ANSWERS
          return ANSWERS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UU_ID, new org.apache.thrift.meta_data.FieldMetaData("uuId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ANSWERS, new org.apache.thrift.meta_data.FieldMetaData("answers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, QuestionnaireAnswer.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Answers.class, metaDataMap);
  }

  public Answers() {
  }

  public Answers(
    String uuId,
    List<QuestionnaireAnswer> answers)
  {
    this();
    this.uuId = uuId;
    this.answers = answers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Answers(Answers other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUuId()) {
      this.uuId = other.uuId;
    }
    this.timestamp = other.timestamp;
    if (other.isSetAnswers()) {
      List<QuestionnaireAnswer> __this__answers = new ArrayList<QuestionnaireAnswer>(other.answers.size());
      for (QuestionnaireAnswer other_element : other.answers) {
        __this__answers.add(new QuestionnaireAnswer(other_element));
      }
      this.answers = __this__answers;
    }
  }

  public Answers deepCopy() {
    return new Answers(this);
  }

  @Override
  public void clear() {
    this.uuId = null;
    setTimestampIsSet(false);
    this.timestamp = 0.0;
    this.answers = null;
  }

  public String getUuId() {
    return this.uuId;
  }

  public Answers setUuId(String uuId) {
    this.uuId = uuId;
    return this;
  }

  public void unsetUuId() {
    this.uuId = null;
  }

  /** Returns true if field uuId is set (has been assigned a value) and false otherwise */
  public boolean isSetUuId() {
    return this.uuId != null;
  }

  public void setUuIdIsSet(boolean value) {
    if (!value) {
      this.uuId = null;
    }
  }

  public double getTimestamp() {
    return this.timestamp;
  }

  public Answers setTimestamp(double timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public int getAnswersSize() {
    return (this.answers == null) ? 0 : this.answers.size();
  }

  public java.util.Iterator<QuestionnaireAnswer> getAnswersIterator() {
    return (this.answers == null) ? null : this.answers.iterator();
  }

  public void addToAnswers(QuestionnaireAnswer elem) {
    if (this.answers == null) {
      this.answers = new ArrayList<QuestionnaireAnswer>();
    }
    this.answers.add(elem);
  }

  public List<QuestionnaireAnswer> getAnswers() {
    return this.answers;
  }

  public Answers setAnswers(List<QuestionnaireAnswer> answers) {
    this.answers = answers;
    return this;
  }

  public void unsetAnswers() {
    this.answers = null;
  }

  /** Returns true if field answers is set (has been assigned a value) and false otherwise */
  public boolean isSetAnswers() {
    return this.answers != null;
  }

  public void setAnswersIsSet(boolean value) {
    if (!value) {
      this.answers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UU_ID:
      if (value == null) {
        unsetUuId();
      } else {
        setUuId((String)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Double)value);
      }
      break;

    case ANSWERS:
      if (value == null) {
        unsetAnswers();
      } else {
        setAnswers((List<QuestionnaireAnswer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UU_ID:
      return getUuId();

    case TIMESTAMP:
      return Double.valueOf(getTimestamp());

    case ANSWERS:
      return getAnswers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UU_ID:
      return isSetUuId();
    case TIMESTAMP:
      return isSetTimestamp();
    case ANSWERS:
      return isSetAnswers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Answers)
      return this.equals((Answers)that);
    return false;
  }

  public boolean equals(Answers that) {
    if (that == null)
      return false;

    boolean this_present_uuId = true && this.isSetUuId();
    boolean that_present_uuId = true && that.isSetUuId();
    if (this_present_uuId || that_present_uuId) {
      if (!(this_present_uuId && that_present_uuId))
        return false;
      if (!this.uuId.equals(that.uuId))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_answers = true && this.isSetAnswers();
    boolean that_present_answers = true && that.isSetAnswers();
    if (this_present_answers || that_present_answers) {
      if (!(this_present_answers && that_present_answers))
        return false;
      if (!this.answers.equals(that.answers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuId = true && (isSetUuId());
    list.add(present_uuId);
    if (present_uuId)
      list.add(uuId);

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_answers = true && (isSetAnswers());
    list.add(present_answers);
    if (present_answers)
      list.add(answers);

    return list.hashCode();
  }

  @Override
  public int compareTo(Answers other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuId()).compareTo(other.isSetUuId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuId, other.uuId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnswers()).compareTo(other.isSetAnswers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnswers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.answers, other.answers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Answers(");
    boolean first = true;

    sb.append("uuId:");
    if (this.uuId == null) {
      sb.append("null");
    } else {
      sb.append(this.uuId);
    }
    first = false;
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("answers:");
    if (this.answers == null) {
      sb.append("null");
    } else {
      sb.append(this.answers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uuId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuId' was not present! Struct: " + toString());
    }
    if (answers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'answers' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnswersStandardSchemeFactory implements SchemeFactory {
    public AnswersStandardScheme getScheme() {
      return new AnswersStandardScheme();
    }
  }

  private static class AnswersStandardScheme extends StandardScheme<Answers> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Answers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UU_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uuId = iprot.readString();
              struct.setUuIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.timestamp = iprot.readDouble();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ANSWERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.answers = new ArrayList<QuestionnaireAnswer>(_list112.size);
                QuestionnaireAnswer _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = new QuestionnaireAnswer();
                  _elem113.read(iprot);
                  struct.answers.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setAnswersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Answers struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuId != null) {
        oprot.writeFieldBegin(UU_ID_FIELD_DESC);
        oprot.writeString(struct.uuId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeDouble(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.answers != null) {
        oprot.writeFieldBegin(ANSWERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.answers.size()));
          for (QuestionnaireAnswer _iter115 : struct.answers)
          {
            _iter115.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnswersTupleSchemeFactory implements SchemeFactory {
    public AnswersTupleScheme getScheme() {
      return new AnswersTupleScheme();
    }
  }

  private static class AnswersTupleScheme extends TupleScheme<Answers> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Answers struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.uuId);
      {
        oprot.writeI32(struct.answers.size());
        for (QuestionnaireAnswer _iter116 : struct.answers)
        {
          _iter116.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetTimestamp()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTimestamp()) {
        oprot.writeDouble(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Answers struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuId = iprot.readString();
      struct.setUuIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.answers = new ArrayList<QuestionnaireAnswer>(_list117.size);
        QuestionnaireAnswer _elem118;
        for (int _i119 = 0; _i119 < _list117.size; ++_i119)
        {
          _elem118 = new QuestionnaireAnswer();
          _elem118.read(iprot);
          struct.answers.add(_elem118);
        }
      }
      struct.setAnswersIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readDouble();
        struct.setTimestampIsSet(true);
      }
    }
  }

}

