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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-27")
public class NetworkStatistics implements org.apache.thrift.TBase<NetworkStatistics, NetworkStatistics._Fields>, java.io.Serializable, Cloneable, Comparable<NetworkStatistics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NetworkStatistics");

  private static final org.apache.thrift.protocol.TField WIFI_RECEIVED_FIELD_DESC = new org.apache.thrift.protocol.TField("wifiReceived", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField WIFI_SENT_FIELD_DESC = new org.apache.thrift.protocol.TField("wifiSent", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField MOBILE_RECEIVED_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileReceived", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField MOBILE_SENT_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileSent", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NetworkStatisticsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NetworkStatisticsTupleSchemeFactory());
  }

  public double wifiReceived; // optional
  public double wifiSent; // optional
  public double mobileReceived; // optional
  public double mobileSent; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WIFI_RECEIVED((short)1, "wifiReceived"),
    WIFI_SENT((short)2, "wifiSent"),
    MOBILE_RECEIVED((short)3, "mobileReceived"),
    MOBILE_SENT((short)4, "mobileSent");

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
        case 1: // WIFI_RECEIVED
          return WIFI_RECEIVED;
        case 2: // WIFI_SENT
          return WIFI_SENT;
        case 3: // MOBILE_RECEIVED
          return MOBILE_RECEIVED;
        case 4: // MOBILE_SENT
          return MOBILE_SENT;
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
  private static final int __WIFIRECEIVED_ISSET_ID = 0;
  private static final int __WIFISENT_ISSET_ID = 1;
  private static final int __MOBILERECEIVED_ISSET_ID = 2;
  private static final int __MOBILESENT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.WIFI_RECEIVED,_Fields.WIFI_SENT,_Fields.MOBILE_RECEIVED,_Fields.MOBILE_SENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WIFI_RECEIVED, new org.apache.thrift.meta_data.FieldMetaData("wifiReceived", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.WIFI_SENT, new org.apache.thrift.meta_data.FieldMetaData("wifiSent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MOBILE_RECEIVED, new org.apache.thrift.meta_data.FieldMetaData("mobileReceived", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MOBILE_SENT, new org.apache.thrift.meta_data.FieldMetaData("mobileSent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NetworkStatistics.class, metaDataMap);
  }

  public NetworkStatistics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NetworkStatistics(NetworkStatistics other) {
    __isset_bitfield = other.__isset_bitfield;
    this.wifiReceived = other.wifiReceived;
    this.wifiSent = other.wifiSent;
    this.mobileReceived = other.mobileReceived;
    this.mobileSent = other.mobileSent;
  }

  public NetworkStatistics deepCopy() {
    return new NetworkStatistics(this);
  }

  @Override
  public void clear() {
    setWifiReceivedIsSet(false);
    this.wifiReceived = 0.0;
    setWifiSentIsSet(false);
    this.wifiSent = 0.0;
    setMobileReceivedIsSet(false);
    this.mobileReceived = 0.0;
    setMobileSentIsSet(false);
    this.mobileSent = 0.0;
  }

  public double getWifiReceived() {
    return this.wifiReceived;
  }

  public NetworkStatistics setWifiReceived(double wifiReceived) {
    this.wifiReceived = wifiReceived;
    setWifiReceivedIsSet(true);
    return this;
  }

  public void unsetWifiReceived() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WIFIRECEIVED_ISSET_ID);
  }

  /** Returns true if field wifiReceived is set (has been assigned a value) and false otherwise */
  public boolean isSetWifiReceived() {
    return EncodingUtils.testBit(__isset_bitfield, __WIFIRECEIVED_ISSET_ID);
  }

  public void setWifiReceivedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WIFIRECEIVED_ISSET_ID, value);
  }

  public double getWifiSent() {
    return this.wifiSent;
  }

  public NetworkStatistics setWifiSent(double wifiSent) {
    this.wifiSent = wifiSent;
    setWifiSentIsSet(true);
    return this;
  }

  public void unsetWifiSent() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WIFISENT_ISSET_ID);
  }

  /** Returns true if field wifiSent is set (has been assigned a value) and false otherwise */
  public boolean isSetWifiSent() {
    return EncodingUtils.testBit(__isset_bitfield, __WIFISENT_ISSET_ID);
  }

  public void setWifiSentIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WIFISENT_ISSET_ID, value);
  }

  public double getMobileReceived() {
    return this.mobileReceived;
  }

  public NetworkStatistics setMobileReceived(double mobileReceived) {
    this.mobileReceived = mobileReceived;
    setMobileReceivedIsSet(true);
    return this;
  }

  public void unsetMobileReceived() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MOBILERECEIVED_ISSET_ID);
  }

  /** Returns true if field mobileReceived is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileReceived() {
    return EncodingUtils.testBit(__isset_bitfield, __MOBILERECEIVED_ISSET_ID);
  }

  public void setMobileReceivedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MOBILERECEIVED_ISSET_ID, value);
  }

  public double getMobileSent() {
    return this.mobileSent;
  }

  public NetworkStatistics setMobileSent(double mobileSent) {
    this.mobileSent = mobileSent;
    setMobileSentIsSet(true);
    return this;
  }

  public void unsetMobileSent() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MOBILESENT_ISSET_ID);
  }

  /** Returns true if field mobileSent is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileSent() {
    return EncodingUtils.testBit(__isset_bitfield, __MOBILESENT_ISSET_ID);
  }

  public void setMobileSentIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MOBILESENT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WIFI_RECEIVED:
      if (value == null) {
        unsetWifiReceived();
      } else {
        setWifiReceived((Double)value);
      }
      break;

    case WIFI_SENT:
      if (value == null) {
        unsetWifiSent();
      } else {
        setWifiSent((Double)value);
      }
      break;

    case MOBILE_RECEIVED:
      if (value == null) {
        unsetMobileReceived();
      } else {
        setMobileReceived((Double)value);
      }
      break;

    case MOBILE_SENT:
      if (value == null) {
        unsetMobileSent();
      } else {
        setMobileSent((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WIFI_RECEIVED:
      return Double.valueOf(getWifiReceived());

    case WIFI_SENT:
      return Double.valueOf(getWifiSent());

    case MOBILE_RECEIVED:
      return Double.valueOf(getMobileReceived());

    case MOBILE_SENT:
      return Double.valueOf(getMobileSent());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WIFI_RECEIVED:
      return isSetWifiReceived();
    case WIFI_SENT:
      return isSetWifiSent();
    case MOBILE_RECEIVED:
      return isSetMobileReceived();
    case MOBILE_SENT:
      return isSetMobileSent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NetworkStatistics)
      return this.equals((NetworkStatistics)that);
    return false;
  }

  public boolean equals(NetworkStatistics that) {
    if (that == null)
      return false;

    boolean this_present_wifiReceived = true && this.isSetWifiReceived();
    boolean that_present_wifiReceived = true && that.isSetWifiReceived();
    if (this_present_wifiReceived || that_present_wifiReceived) {
      if (!(this_present_wifiReceived && that_present_wifiReceived))
        return false;
      if (this.wifiReceived != that.wifiReceived)
        return false;
    }

    boolean this_present_wifiSent = true && this.isSetWifiSent();
    boolean that_present_wifiSent = true && that.isSetWifiSent();
    if (this_present_wifiSent || that_present_wifiSent) {
      if (!(this_present_wifiSent && that_present_wifiSent))
        return false;
      if (this.wifiSent != that.wifiSent)
        return false;
    }

    boolean this_present_mobileReceived = true && this.isSetMobileReceived();
    boolean that_present_mobileReceived = true && that.isSetMobileReceived();
    if (this_present_mobileReceived || that_present_mobileReceived) {
      if (!(this_present_mobileReceived && that_present_mobileReceived))
        return false;
      if (this.mobileReceived != that.mobileReceived)
        return false;
    }

    boolean this_present_mobileSent = true && this.isSetMobileSent();
    boolean that_present_mobileSent = true && that.isSetMobileSent();
    if (this_present_mobileSent || that_present_mobileSent) {
      if (!(this_present_mobileSent && that_present_mobileSent))
        return false;
      if (this.mobileSent != that.mobileSent)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_wifiReceived = true && (isSetWifiReceived());
    list.add(present_wifiReceived);
    if (present_wifiReceived)
      list.add(wifiReceived);

    boolean present_wifiSent = true && (isSetWifiSent());
    list.add(present_wifiSent);
    if (present_wifiSent)
      list.add(wifiSent);

    boolean present_mobileReceived = true && (isSetMobileReceived());
    list.add(present_mobileReceived);
    if (present_mobileReceived)
      list.add(mobileReceived);

    boolean present_mobileSent = true && (isSetMobileSent());
    list.add(present_mobileSent);
    if (present_mobileSent)
      list.add(mobileSent);

    return list.hashCode();
  }

  @Override
  public int compareTo(NetworkStatistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWifiReceived()).compareTo(other.isSetWifiReceived());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWifiReceived()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wifiReceived, other.wifiReceived);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWifiSent()).compareTo(other.isSetWifiSent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWifiSent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wifiSent, other.wifiSent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobileReceived()).compareTo(other.isSetMobileReceived());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileReceived()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileReceived, other.mobileReceived);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobileSent()).compareTo(other.isSetMobileSent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileSent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileSent, other.mobileSent);
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
    StringBuilder sb = new StringBuilder("NetworkStatistics(");
    boolean first = true;

    if (isSetWifiReceived()) {
      sb.append("wifiReceived:");
      sb.append(this.wifiReceived);
      first = false;
    }
    if (isSetWifiSent()) {
      if (!first) sb.append(", ");
      sb.append("wifiSent:");
      sb.append(this.wifiSent);
      first = false;
    }
    if (isSetMobileReceived()) {
      if (!first) sb.append(", ");
      sb.append("mobileReceived:");
      sb.append(this.mobileReceived);
      first = false;
    }
    if (isSetMobileSent()) {
      if (!first) sb.append(", ");
      sb.append("mobileSent:");
      sb.append(this.mobileSent);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class NetworkStatisticsStandardSchemeFactory implements SchemeFactory {
    public NetworkStatisticsStandardScheme getScheme() {
      return new NetworkStatisticsStandardScheme();
    }
  }

  private static class NetworkStatisticsStandardScheme extends StandardScheme<NetworkStatistics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NetworkStatistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WIFI_RECEIVED
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.wifiReceived = iprot.readDouble();
              struct.setWifiReceivedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WIFI_SENT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.wifiSent = iprot.readDouble();
              struct.setWifiSentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MOBILE_RECEIVED
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.mobileReceived = iprot.readDouble();
              struct.setMobileReceivedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBILE_SENT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.mobileSent = iprot.readDouble();
              struct.setMobileSentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NetworkStatistics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetWifiReceived()) {
        oprot.writeFieldBegin(WIFI_RECEIVED_FIELD_DESC);
        oprot.writeDouble(struct.wifiReceived);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWifiSent()) {
        oprot.writeFieldBegin(WIFI_SENT_FIELD_DESC);
        oprot.writeDouble(struct.wifiSent);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMobileReceived()) {
        oprot.writeFieldBegin(MOBILE_RECEIVED_FIELD_DESC);
        oprot.writeDouble(struct.mobileReceived);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMobileSent()) {
        oprot.writeFieldBegin(MOBILE_SENT_FIELD_DESC);
        oprot.writeDouble(struct.mobileSent);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NetworkStatisticsTupleSchemeFactory implements SchemeFactory {
    public NetworkStatisticsTupleScheme getScheme() {
      return new NetworkStatisticsTupleScheme();
    }
  }

  private static class NetworkStatisticsTupleScheme extends TupleScheme<NetworkStatistics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NetworkStatistics struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWifiReceived()) {
        optionals.set(0);
      }
      if (struct.isSetWifiSent()) {
        optionals.set(1);
      }
      if (struct.isSetMobileReceived()) {
        optionals.set(2);
      }
      if (struct.isSetMobileSent()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetWifiReceived()) {
        oprot.writeDouble(struct.wifiReceived);
      }
      if (struct.isSetWifiSent()) {
        oprot.writeDouble(struct.wifiSent);
      }
      if (struct.isSetMobileReceived()) {
        oprot.writeDouble(struct.mobileReceived);
      }
      if (struct.isSetMobileSent()) {
        oprot.writeDouble(struct.mobileSent);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NetworkStatistics struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.wifiReceived = iprot.readDouble();
        struct.setWifiReceivedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.wifiSent = iprot.readDouble();
        struct.setWifiSentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mobileReceived = iprot.readDouble();
        struct.setMobileReceivedIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobileSent = iprot.readDouble();
        struct.setMobileSentIsSet(true);
      }
    }
  }

}

