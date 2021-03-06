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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-1")
public class QuestionItem implements org.apache.thrift.TBase<QuestionItem, QuestionItem._Fields>, java.io.Serializable, Cloneable, Comparable<QuestionItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QuestionItem");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUESTION_FIELD_DESC = new org.apache.thrift.protocol.TField("question", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CHOICES_FIELD_DESC = new org.apache.thrift.protocol.TField("choices", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QuestionItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QuestionItemTupleSchemeFactory());
  }

  public String type; // required
  public String title; // optional
  public String question; // optional
  public List<String> choices; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    TITLE((short)2, "title"),
    QUESTION((short)3, "question"),
    CHOICES((short)4, "choices");

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
        case 1: // TYPE
          return TYPE;
        case 2: // TITLE
          return TITLE;
        case 3: // QUESTION
          return QUESTION;
        case 4: // CHOICES
          return CHOICES;
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
  private static final _Fields optionals[] = {_Fields.TITLE,_Fields.QUESTION,_Fields.CHOICES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUESTION, new org.apache.thrift.meta_data.FieldMetaData("question", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHOICES, new org.apache.thrift.meta_data.FieldMetaData("choices", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QuestionItem.class, metaDataMap);
  }

  public QuestionItem() {
  }

  public QuestionItem(
    String type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QuestionItem(QuestionItem other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetQuestion()) {
      this.question = other.question;
    }
    if (other.isSetChoices()) {
      List<String> __this__choices = new ArrayList<String>(other.choices);
      this.choices = __this__choices;
    }
  }

  public QuestionItem deepCopy() {
    return new QuestionItem(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.title = null;
    this.question = null;
    this.choices = null;
  }

  public String getType() {
    return this.type;
  }

  public QuestionItem setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public QuestionItem setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getQuestion() {
    return this.question;
  }

  public QuestionItem setQuestion(String question) {
    this.question = question;
    return this;
  }

  public void unsetQuestion() {
    this.question = null;
  }

  /** Returns true if field question is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestion() {
    return this.question != null;
  }

  public void setQuestionIsSet(boolean value) {
    if (!value) {
      this.question = null;
    }
  }

  public int getChoicesSize() {
    return (this.choices == null) ? 0 : this.choices.size();
  }

  public java.util.Iterator<String> getChoicesIterator() {
    return (this.choices == null) ? null : this.choices.iterator();
  }

  public void addToChoices(String elem) {
    if (this.choices == null) {
      this.choices = new ArrayList<String>();
    }
    this.choices.add(elem);
  }

  public List<String> getChoices() {
    return this.choices;
  }

  public QuestionItem setChoices(List<String> choices) {
    this.choices = choices;
    return this;
  }

  public void unsetChoices() {
    this.choices = null;
  }

  /** Returns true if field choices is set (has been assigned a value) and false otherwise */
  public boolean isSetChoices() {
    return this.choices != null;
  }

  public void setChoicesIsSet(boolean value) {
    if (!value) {
      this.choices = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case QUESTION:
      if (value == null) {
        unsetQuestion();
      } else {
        setQuestion((String)value);
      }
      break;

    case CHOICES:
      if (value == null) {
        unsetChoices();
      } else {
        setChoices((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case TITLE:
      return getTitle();

    case QUESTION:
      return getQuestion();

    case CHOICES:
      return getChoices();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case TITLE:
      return isSetTitle();
    case QUESTION:
      return isSetQuestion();
    case CHOICES:
      return isSetChoices();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QuestionItem)
      return this.equals((QuestionItem)that);
    return false;
  }

  public boolean equals(QuestionItem that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_question = true && this.isSetQuestion();
    boolean that_present_question = true && that.isSetQuestion();
    if (this_present_question || that_present_question) {
      if (!(this_present_question && that_present_question))
        return false;
      if (!this.question.equals(that.question))
        return false;
    }

    boolean this_present_choices = true && this.isSetChoices();
    boolean that_present_choices = true && that.isSetChoices();
    if (this_present_choices || that_present_choices) {
      if (!(this_present_choices && that_present_choices))
        return false;
      if (!this.choices.equals(that.choices))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_question = true && (isSetQuestion());
    list.add(present_question);
    if (present_question)
      list.add(question);

    boolean present_choices = true && (isSetChoices());
    list.add(present_choices);
    if (present_choices)
      list.add(choices);

    return list.hashCode();
  }

  @Override
  public int compareTo(QuestionItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuestion()).compareTo(other.isSetQuestion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.question, other.question);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChoices()).compareTo(other.isSetChoices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChoices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.choices, other.choices);
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
    StringBuilder sb = new StringBuilder("QuestionItem(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetQuestion()) {
      if (!first) sb.append(", ");
      sb.append("question:");
      if (this.question == null) {
        sb.append("null");
      } else {
        sb.append(this.question);
      }
      first = false;
    }
    if (isSetChoices()) {
      if (!first) sb.append(", ");
      sb.append("choices:");
      if (this.choices == null) {
        sb.append("null");
      } else {
        sb.append(this.choices);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QuestionItemStandardSchemeFactory implements SchemeFactory {
    public QuestionItemStandardScheme getScheme() {
      return new QuestionItemStandardScheme();
    }
  }

  private static class QuestionItemStandardScheme extends StandardScheme<QuestionItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QuestionItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUESTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.question = iprot.readString();
              struct.setQuestionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHOICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.choices = new ArrayList<String>(_list88.size);
                String _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = iprot.readString();
                  struct.choices.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setChoicesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QuestionItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.question != null) {
        if (struct.isSetQuestion()) {
          oprot.writeFieldBegin(QUESTION_FIELD_DESC);
          oprot.writeString(struct.question);
          oprot.writeFieldEnd();
        }
      }
      if (struct.choices != null) {
        if (struct.isSetChoices()) {
          oprot.writeFieldBegin(CHOICES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.choices.size()));
            for (String _iter91 : struct.choices)
            {
              oprot.writeString(_iter91);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QuestionItemTupleSchemeFactory implements SchemeFactory {
    public QuestionItemTupleScheme getScheme() {
      return new QuestionItemTupleScheme();
    }
  }

  private static class QuestionItemTupleScheme extends TupleScheme<QuestionItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QuestionItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.type);
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetQuestion()) {
        optionals.set(1);
      }
      if (struct.isSetChoices()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetQuestion()) {
        oprot.writeString(struct.question);
      }
      if (struct.isSetChoices()) {
        {
          oprot.writeI32(struct.choices.size());
          for (String _iter92 : struct.choices)
          {
            oprot.writeString(_iter92);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QuestionItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = iprot.readString();
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.question = iprot.readString();
        struct.setQuestionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.choices = new ArrayList<String>(_list93.size);
          String _elem94;
          for (int _i95 = 0; _i95 < _list93.size; ++_i95)
          {
            _elem94 = iprot.readString();
            struct.choices.add(_elem94);
          }
        }
        struct.setChoicesIsSet(true);
      }
    }
  }

}

