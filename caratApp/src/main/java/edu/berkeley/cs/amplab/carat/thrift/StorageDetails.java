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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-29")
public class StorageDetails implements org.apache.thrift.TBase<StorageDetails, StorageDetails._Fields>, java.io.Serializable, Cloneable, Comparable<StorageDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StorageDetails");

  private static final org.apache.thrift.protocol.TField FREE_FIELD_DESC = new org.apache.thrift.protocol.TField("free", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FREE_EXTERNAL_FIELD_DESC = new org.apache.thrift.protocol.TField("freeExternal", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TOTAL_EXTERNAL_FIELD_DESC = new org.apache.thrift.protocol.TField("totalExternal", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField FREE_SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("freeSystem", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TOTAL_SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("totalSystem", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField FREE_SECONDARY_FIELD_DESC = new org.apache.thrift.protocol.TField("freeSecondary", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField TOTAL_SECONDARY_FIELD_DESC = new org.apache.thrift.protocol.TField("totalSecondary", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StorageDetailsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StorageDetailsTupleSchemeFactory());
  }

  public int free; // optional
  public int total; // optional
  public int freeExternal; // optional
  public int totalExternal; // optional
  public int freeSystem; // optional
  public int totalSystem; // optional
  public int freeSecondary; // optional
  public int totalSecondary; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FREE((short)1, "free"),
    TOTAL((short)2, "total"),
    FREE_EXTERNAL((short)3, "freeExternal"),
    TOTAL_EXTERNAL((short)4, "totalExternal"),
    FREE_SYSTEM((short)5, "freeSystem"),
    TOTAL_SYSTEM((short)6, "totalSystem"),
    FREE_SECONDARY((short)7, "freeSecondary"),
    TOTAL_SECONDARY((short)8, "totalSecondary");

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
        case 1: // FREE
          return FREE;
        case 2: // TOTAL
          return TOTAL;
        case 3: // FREE_EXTERNAL
          return FREE_EXTERNAL;
        case 4: // TOTAL_EXTERNAL
          return TOTAL_EXTERNAL;
        case 5: // FREE_SYSTEM
          return FREE_SYSTEM;
        case 6: // TOTAL_SYSTEM
          return TOTAL_SYSTEM;
        case 7: // FREE_SECONDARY
          return FREE_SECONDARY;
        case 8: // TOTAL_SECONDARY
          return TOTAL_SECONDARY;
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
  private static final int __FREE_ISSET_ID = 0;
  private static final int __TOTAL_ISSET_ID = 1;
  private static final int __FREEEXTERNAL_ISSET_ID = 2;
  private static final int __TOTALEXTERNAL_ISSET_ID = 3;
  private static final int __FREESYSTEM_ISSET_ID = 4;
  private static final int __TOTALSYSTEM_ISSET_ID = 5;
  private static final int __FREESECONDARY_ISSET_ID = 6;
  private static final int __TOTALSECONDARY_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FREE,_Fields.TOTAL,_Fields.FREE_EXTERNAL,_Fields.TOTAL_EXTERNAL,_Fields.FREE_SYSTEM,_Fields.TOTAL_SYSTEM,_Fields.FREE_SECONDARY,_Fields.TOTAL_SECONDARY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FREE, new org.apache.thrift.meta_data.FieldMetaData("free", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_EXTERNAL, new org.apache.thrift.meta_data.FieldMetaData("freeExternal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_EXTERNAL, new org.apache.thrift.meta_data.FieldMetaData("totalExternal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("freeSystem", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("totalSystem", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_SECONDARY, new org.apache.thrift.meta_data.FieldMetaData("freeSecondary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_SECONDARY, new org.apache.thrift.meta_data.FieldMetaData("totalSecondary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StorageDetails.class, metaDataMap);
  }

  public StorageDetails() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StorageDetails(StorageDetails other) {
    __isset_bitfield = other.__isset_bitfield;
    this.free = other.free;
    this.total = other.total;
    this.freeExternal = other.freeExternal;
    this.totalExternal = other.totalExternal;
    this.freeSystem = other.freeSystem;
    this.totalSystem = other.totalSystem;
    this.freeSecondary = other.freeSecondary;
    this.totalSecondary = other.totalSecondary;
  }

  public StorageDetails deepCopy() {
    return new StorageDetails(this);
  }

  @Override
  public void clear() {
    setFreeIsSet(false);
    this.free = 0;
    setTotalIsSet(false);
    this.total = 0;
    setFreeExternalIsSet(false);
    this.freeExternal = 0;
    setTotalExternalIsSet(false);
    this.totalExternal = 0;
    setFreeSystemIsSet(false);
    this.freeSystem = 0;
    setTotalSystemIsSet(false);
    this.totalSystem = 0;
    setFreeSecondaryIsSet(false);
    this.freeSecondary = 0;
    setTotalSecondaryIsSet(false);
    this.totalSecondary = 0;
  }

  public int getFree() {
    return this.free;
  }

  public StorageDetails setFree(int free) {
    this.free = free;
    setFreeIsSet(true);
    return this;
  }

  public void unsetFree() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREE_ISSET_ID);
  }

  /** Returns true if field free is set (has been assigned a value) and false otherwise */
  public boolean isSetFree() {
    return EncodingUtils.testBit(__isset_bitfield, __FREE_ISSET_ID);
  }

  public void setFreeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREE_ISSET_ID, value);
  }

  public int getTotal() {
    return this.total;
  }

  public StorageDetails setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public int getFreeExternal() {
    return this.freeExternal;
  }

  public StorageDetails setFreeExternal(int freeExternal) {
    this.freeExternal = freeExternal;
    setFreeExternalIsSet(true);
    return this;
  }

  public void unsetFreeExternal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREEEXTERNAL_ISSET_ID);
  }

  /** Returns true if field freeExternal is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeExternal() {
    return EncodingUtils.testBit(__isset_bitfield, __FREEEXTERNAL_ISSET_ID);
  }

  public void setFreeExternalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREEEXTERNAL_ISSET_ID, value);
  }

  public int getTotalExternal() {
    return this.totalExternal;
  }

  public StorageDetails setTotalExternal(int totalExternal) {
    this.totalExternal = totalExternal;
    setTotalExternalIsSet(true);
    return this;
  }

  public void unsetTotalExternal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALEXTERNAL_ISSET_ID);
  }

  /** Returns true if field totalExternal is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalExternal() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALEXTERNAL_ISSET_ID);
  }

  public void setTotalExternalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALEXTERNAL_ISSET_ID, value);
  }

  public int getFreeSystem() {
    return this.freeSystem;
  }

  public StorageDetails setFreeSystem(int freeSystem) {
    this.freeSystem = freeSystem;
    setFreeSystemIsSet(true);
    return this;
  }

  public void unsetFreeSystem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREESYSTEM_ISSET_ID);
  }

  /** Returns true if field freeSystem is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeSystem() {
    return EncodingUtils.testBit(__isset_bitfield, __FREESYSTEM_ISSET_ID);
  }

  public void setFreeSystemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREESYSTEM_ISSET_ID, value);
  }

  public int getTotalSystem() {
    return this.totalSystem;
  }

  public StorageDetails setTotalSystem(int totalSystem) {
    this.totalSystem = totalSystem;
    setTotalSystemIsSet(true);
    return this;
  }

  public void unsetTotalSystem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALSYSTEM_ISSET_ID);
  }

  /** Returns true if field totalSystem is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSystem() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALSYSTEM_ISSET_ID);
  }

  public void setTotalSystemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALSYSTEM_ISSET_ID, value);
  }

  public int getFreeSecondary() {
    return this.freeSecondary;
  }

  public StorageDetails setFreeSecondary(int freeSecondary) {
    this.freeSecondary = freeSecondary;
    setFreeSecondaryIsSet(true);
    return this;
  }

  public void unsetFreeSecondary() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREESECONDARY_ISSET_ID);
  }

  /** Returns true if field freeSecondary is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeSecondary() {
    return EncodingUtils.testBit(__isset_bitfield, __FREESECONDARY_ISSET_ID);
  }

  public void setFreeSecondaryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREESECONDARY_ISSET_ID, value);
  }

  public int getTotalSecondary() {
    return this.totalSecondary;
  }

  public StorageDetails setTotalSecondary(int totalSecondary) {
    this.totalSecondary = totalSecondary;
    setTotalSecondaryIsSet(true);
    return this;
  }

  public void unsetTotalSecondary() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALSECONDARY_ISSET_ID);
  }

  /** Returns true if field totalSecondary is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSecondary() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALSECONDARY_ISSET_ID);
  }

  public void setTotalSecondaryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALSECONDARY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FREE:
      if (value == null) {
        unsetFree();
      } else {
        setFree((Integer)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
      }
      break;

    case FREE_EXTERNAL:
      if (value == null) {
        unsetFreeExternal();
      } else {
        setFreeExternal((Integer)value);
      }
      break;

    case TOTAL_EXTERNAL:
      if (value == null) {
        unsetTotalExternal();
      } else {
        setTotalExternal((Integer)value);
      }
      break;

    case FREE_SYSTEM:
      if (value == null) {
        unsetFreeSystem();
      } else {
        setFreeSystem((Integer)value);
      }
      break;

    case TOTAL_SYSTEM:
      if (value == null) {
        unsetTotalSystem();
      } else {
        setTotalSystem((Integer)value);
      }
      break;

    case FREE_SECONDARY:
      if (value == null) {
        unsetFreeSecondary();
      } else {
        setFreeSecondary((Integer)value);
      }
      break;

    case TOTAL_SECONDARY:
      if (value == null) {
        unsetTotalSecondary();
      } else {
        setTotalSecondary((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FREE:
      return Integer.valueOf(getFree());

    case TOTAL:
      return Integer.valueOf(getTotal());

    case FREE_EXTERNAL:
      return Integer.valueOf(getFreeExternal());

    case TOTAL_EXTERNAL:
      return Integer.valueOf(getTotalExternal());

    case FREE_SYSTEM:
      return Integer.valueOf(getFreeSystem());

    case TOTAL_SYSTEM:
      return Integer.valueOf(getTotalSystem());

    case FREE_SECONDARY:
      return Integer.valueOf(getFreeSecondary());

    case TOTAL_SECONDARY:
      return Integer.valueOf(getTotalSecondary());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FREE:
      return isSetFree();
    case TOTAL:
      return isSetTotal();
    case FREE_EXTERNAL:
      return isSetFreeExternal();
    case TOTAL_EXTERNAL:
      return isSetTotalExternal();
    case FREE_SYSTEM:
      return isSetFreeSystem();
    case TOTAL_SYSTEM:
      return isSetTotalSystem();
    case FREE_SECONDARY:
      return isSetFreeSecondary();
    case TOTAL_SECONDARY:
      return isSetTotalSecondary();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StorageDetails)
      return this.equals((StorageDetails)that);
    return false;
  }

  public boolean equals(StorageDetails that) {
    if (that == null)
      return false;

    boolean this_present_free = true && this.isSetFree();
    boolean that_present_free = true && that.isSetFree();
    if (this_present_free || that_present_free) {
      if (!(this_present_free && that_present_free))
        return false;
      if (this.free != that.free)
        return false;
    }

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_freeExternal = true && this.isSetFreeExternal();
    boolean that_present_freeExternal = true && that.isSetFreeExternal();
    if (this_present_freeExternal || that_present_freeExternal) {
      if (!(this_present_freeExternal && that_present_freeExternal))
        return false;
      if (this.freeExternal != that.freeExternal)
        return false;
    }

    boolean this_present_totalExternal = true && this.isSetTotalExternal();
    boolean that_present_totalExternal = true && that.isSetTotalExternal();
    if (this_present_totalExternal || that_present_totalExternal) {
      if (!(this_present_totalExternal && that_present_totalExternal))
        return false;
      if (this.totalExternal != that.totalExternal)
        return false;
    }

    boolean this_present_freeSystem = true && this.isSetFreeSystem();
    boolean that_present_freeSystem = true && that.isSetFreeSystem();
    if (this_present_freeSystem || that_present_freeSystem) {
      if (!(this_present_freeSystem && that_present_freeSystem))
        return false;
      if (this.freeSystem != that.freeSystem)
        return false;
    }

    boolean this_present_totalSystem = true && this.isSetTotalSystem();
    boolean that_present_totalSystem = true && that.isSetTotalSystem();
    if (this_present_totalSystem || that_present_totalSystem) {
      if (!(this_present_totalSystem && that_present_totalSystem))
        return false;
      if (this.totalSystem != that.totalSystem)
        return false;
    }

    boolean this_present_freeSecondary = true && this.isSetFreeSecondary();
    boolean that_present_freeSecondary = true && that.isSetFreeSecondary();
    if (this_present_freeSecondary || that_present_freeSecondary) {
      if (!(this_present_freeSecondary && that_present_freeSecondary))
        return false;
      if (this.freeSecondary != that.freeSecondary)
        return false;
    }

    boolean this_present_totalSecondary = true && this.isSetTotalSecondary();
    boolean that_present_totalSecondary = true && that.isSetTotalSecondary();
    if (this_present_totalSecondary || that_present_totalSecondary) {
      if (!(this_present_totalSecondary && that_present_totalSecondary))
        return false;
      if (this.totalSecondary != that.totalSecondary)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_free = true && (isSetFree());
    list.add(present_free);
    if (present_free)
      list.add(free);

    boolean present_total = true && (isSetTotal());
    list.add(present_total);
    if (present_total)
      list.add(total);

    boolean present_freeExternal = true && (isSetFreeExternal());
    list.add(present_freeExternal);
    if (present_freeExternal)
      list.add(freeExternal);

    boolean present_totalExternal = true && (isSetTotalExternal());
    list.add(present_totalExternal);
    if (present_totalExternal)
      list.add(totalExternal);

    boolean present_freeSystem = true && (isSetFreeSystem());
    list.add(present_freeSystem);
    if (present_freeSystem)
      list.add(freeSystem);

    boolean present_totalSystem = true && (isSetTotalSystem());
    list.add(present_totalSystem);
    if (present_totalSystem)
      list.add(totalSystem);

    boolean present_freeSecondary = true && (isSetFreeSecondary());
    list.add(present_freeSecondary);
    if (present_freeSecondary)
      list.add(freeSecondary);

    boolean present_totalSecondary = true && (isSetTotalSecondary());
    list.add(present_totalSecondary);
    if (present_totalSecondary)
      list.add(totalSecondary);

    return list.hashCode();
  }

  @Override
  public int compareTo(StorageDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFree()).compareTo(other.isSetFree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.free, other.free);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreeExternal()).compareTo(other.isSetFreeExternal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeExternal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeExternal, other.freeExternal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalExternal()).compareTo(other.isSetTotalExternal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalExternal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalExternal, other.totalExternal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreeSystem()).compareTo(other.isSetFreeSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeSystem, other.freeSystem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalSystem()).compareTo(other.isSetTotalSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalSystem, other.totalSystem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreeSecondary()).compareTo(other.isSetFreeSecondary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeSecondary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeSecondary, other.freeSecondary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalSecondary()).compareTo(other.isSetTotalSecondary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSecondary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalSecondary, other.totalSecondary);
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
    StringBuilder sb = new StringBuilder("StorageDetails(");
    boolean first = true;

    if (isSetFree()) {
      sb.append("free:");
      sb.append(this.free);
      first = false;
    }
    if (isSetTotal()) {
      if (!first) sb.append(", ");
      sb.append("total:");
      sb.append(this.total);
      first = false;
    }
    if (isSetFreeExternal()) {
      if (!first) sb.append(", ");
      sb.append("freeExternal:");
      sb.append(this.freeExternal);
      first = false;
    }
    if (isSetTotalExternal()) {
      if (!first) sb.append(", ");
      sb.append("totalExternal:");
      sb.append(this.totalExternal);
      first = false;
    }
    if (isSetFreeSystem()) {
      if (!first) sb.append(", ");
      sb.append("freeSystem:");
      sb.append(this.freeSystem);
      first = false;
    }
    if (isSetTotalSystem()) {
      if (!first) sb.append(", ");
      sb.append("totalSystem:");
      sb.append(this.totalSystem);
      first = false;
    }
    if (isSetFreeSecondary()) {
      if (!first) sb.append(", ");
      sb.append("freeSecondary:");
      sb.append(this.freeSecondary);
      first = false;
    }
    if (isSetTotalSecondary()) {
      if (!first) sb.append(", ");
      sb.append("totalSecondary:");
      sb.append(this.totalSecondary);
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

  private static class StorageDetailsStandardSchemeFactory implements SchemeFactory {
    public StorageDetailsStandardScheme getScheme() {
      return new StorageDetailsStandardScheme();
    }
  }

  private static class StorageDetailsStandardScheme extends StandardScheme<StorageDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StorageDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FREE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.free = iprot.readI32();
              struct.setFreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FREE_EXTERNAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeExternal = iprot.readI32();
              struct.setFreeExternalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOTAL_EXTERNAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalExternal = iprot.readI32();
              struct.setTotalExternalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FREE_SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeSystem = iprot.readI32();
              struct.setFreeSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TOTAL_SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalSystem = iprot.readI32();
              struct.setTotalSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FREE_SECONDARY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.freeSecondary = iprot.readI32();
              struct.setFreeSecondaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TOTAL_SECONDARY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalSecondary = iprot.readI32();
              struct.setTotalSecondaryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StorageDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetFree()) {
        oprot.writeFieldBegin(FREE_FIELD_DESC);
        oprot.writeI32(struct.free);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotal()) {
        oprot.writeFieldBegin(TOTAL_FIELD_DESC);
        oprot.writeI32(struct.total);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFreeExternal()) {
        oprot.writeFieldBegin(FREE_EXTERNAL_FIELD_DESC);
        oprot.writeI32(struct.freeExternal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalExternal()) {
        oprot.writeFieldBegin(TOTAL_EXTERNAL_FIELD_DESC);
        oprot.writeI32(struct.totalExternal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFreeSystem()) {
        oprot.writeFieldBegin(FREE_SYSTEM_FIELD_DESC);
        oprot.writeI32(struct.freeSystem);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalSystem()) {
        oprot.writeFieldBegin(TOTAL_SYSTEM_FIELD_DESC);
        oprot.writeI32(struct.totalSystem);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFreeSecondary()) {
        oprot.writeFieldBegin(FREE_SECONDARY_FIELD_DESC);
        oprot.writeI32(struct.freeSecondary);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalSecondary()) {
        oprot.writeFieldBegin(TOTAL_SECONDARY_FIELD_DESC);
        oprot.writeI32(struct.totalSecondary);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StorageDetailsTupleSchemeFactory implements SchemeFactory {
    public StorageDetailsTupleScheme getScheme() {
      return new StorageDetailsTupleScheme();
    }
  }

  private static class StorageDetailsTupleScheme extends TupleScheme<StorageDetails> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StorageDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFree()) {
        optionals.set(0);
      }
      if (struct.isSetTotal()) {
        optionals.set(1);
      }
      if (struct.isSetFreeExternal()) {
        optionals.set(2);
      }
      if (struct.isSetTotalExternal()) {
        optionals.set(3);
      }
      if (struct.isSetFreeSystem()) {
        optionals.set(4);
      }
      if (struct.isSetTotalSystem()) {
        optionals.set(5);
      }
      if (struct.isSetFreeSecondary()) {
        optionals.set(6);
      }
      if (struct.isSetTotalSecondary()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetFree()) {
        oprot.writeI32(struct.free);
      }
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
      if (struct.isSetFreeExternal()) {
        oprot.writeI32(struct.freeExternal);
      }
      if (struct.isSetTotalExternal()) {
        oprot.writeI32(struct.totalExternal);
      }
      if (struct.isSetFreeSystem()) {
        oprot.writeI32(struct.freeSystem);
      }
      if (struct.isSetTotalSystem()) {
        oprot.writeI32(struct.totalSystem);
      }
      if (struct.isSetFreeSecondary()) {
        oprot.writeI32(struct.freeSecondary);
      }
      if (struct.isSetTotalSecondary()) {
        oprot.writeI32(struct.totalSecondary);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StorageDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.free = iprot.readI32();
        struct.setFreeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
      if (incoming.get(2)) {
        struct.freeExternal = iprot.readI32();
        struct.setFreeExternalIsSet(true);
      }
      if (incoming.get(3)) {
        struct.totalExternal = iprot.readI32();
        struct.setTotalExternalIsSet(true);
      }
      if (incoming.get(4)) {
        struct.freeSystem = iprot.readI32();
        struct.setFreeSystemIsSet(true);
      }
      if (incoming.get(5)) {
        struct.totalSystem = iprot.readI32();
        struct.setTotalSystemIsSet(true);
      }
      if (incoming.get(6)) {
        struct.freeSecondary = iprot.readI32();
        struct.setFreeSecondaryIsSet(true);
      }
      if (incoming.get(7)) {
        struct.totalSecondary = iprot.readI32();
        struct.setTotalSecondaryIsSet(true);
      }
    }
  }

}

