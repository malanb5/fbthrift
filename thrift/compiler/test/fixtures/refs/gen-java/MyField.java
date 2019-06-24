/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyField implements TBase, java.io.Serializable, Cloneable, Comparable<MyField> {
  private static final TStruct STRUCT_DESC = new TStruct("MyField");
  private static final TField OPT_VALUE_FIELD_DESC = new TField("opt_value", TType.I64, (short)1);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.I64, (short)2);
  private static final TField REQ_VALUE_FIELD_DESC = new TField("req_value", TType.I64, (short)3);

  public long opt_value;
  public long value;
  public long req_value;
  public static final int OPT_VALUE = 1;
  public static final int VALUE = 2;
  public static final int REQ_VALUE = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __OPT_VALUE_ISSET_ID = 0;
  private static final int __VALUE_ISSET_ID = 1;
  private static final int __REQ_VALUE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(OPT_VALUE, new FieldMetaData("opt_value", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(REQ_VALUE, new FieldMetaData("req_value", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MyField.class, metaDataMap);
  }

  public MyField() {
  }

  public MyField(
    long req_value)
  {
    this();
    this.req_value = req_value;
    setReq_valueIsSet(true);
  }

  public MyField(
    long value,
    long req_value)
  {
    this();
    this.value = value;
    setValueIsSet(true);
    this.req_value = req_value;
    setReq_valueIsSet(true);
  }

  public MyField(
    long opt_value,
    long value,
    long req_value)
  {
    this();
    this.opt_value = opt_value;
    setOpt_valueIsSet(true);
    this.value = value;
    setValueIsSet(true);
    this.req_value = req_value;
    setReq_valueIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyField(MyField other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.opt_value = TBaseHelper.deepCopy(other.opt_value);
    this.value = TBaseHelper.deepCopy(other.value);
    this.req_value = TBaseHelper.deepCopy(other.req_value);
  }

  public MyField deepCopy() {
    return new MyField(this);
  }

  @Deprecated
  public MyField clone() {
    return new MyField(this);
  }

  public long getOpt_value() {
    return this.opt_value;
  }

  public MyField setOpt_value(long opt_value) {
    this.opt_value = opt_value;
    setOpt_valueIsSet(true);
    return this;
  }

  public void unsetOpt_value() {
    __isset_bit_vector.clear(__OPT_VALUE_ISSET_ID);
  }

  // Returns true if field opt_value is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_value() {
    return __isset_bit_vector.get(__OPT_VALUE_ISSET_ID);
  }

  public void setOpt_valueIsSet(boolean value) {
    __isset_bit_vector.set(__OPT_VALUE_ISSET_ID, value);
  }

  public long getValue() {
    return this.value;
  }

  public MyField setValue(long value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bit_vector.clear(__VALUE_ISSET_ID);
  }

  // Returns true if field value is set (has been assigned a value) and false otherwise
  public boolean isSetValue() {
    return __isset_bit_vector.get(__VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bit_vector.set(__VALUE_ISSET_ID, value);
  }

  public long getReq_value() {
    return this.req_value;
  }

  public MyField setReq_value(long req_value) {
    this.req_value = req_value;
    setReq_valueIsSet(true);
    return this;
  }

  public void unsetReq_value() {
    __isset_bit_vector.clear(__REQ_VALUE_ISSET_ID);
  }

  // Returns true if field req_value is set (has been assigned a value) and false otherwise
  public boolean isSetReq_value() {
    return __isset_bit_vector.get(__REQ_VALUE_ISSET_ID);
  }

  public void setReq_valueIsSet(boolean value) {
    __isset_bit_vector.set(__REQ_VALUE_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case OPT_VALUE:
      if (value == null) {
        unsetOpt_value();
      } else {
        setOpt_value((Long)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((Long)value);
      }
      break;

    case REQ_VALUE:
      if (value == null) {
        unsetReq_value();
      } else {
        setReq_value((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case OPT_VALUE:
      return new Long(getOpt_value());

    case VALUE:
      return new Long(getValue());

    case REQ_VALUE:
      return new Long(getReq_value());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case OPT_VALUE:
      return isSetOpt_value();
    case VALUE:
      return isSetValue();
    case REQ_VALUE:
      return isSetReq_value();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MyField)
      return this.equals((MyField)that);
    return false;
  }

  public boolean equals(MyField that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_opt_value = true && this.isSetOpt_value();
    boolean that_present_opt_value = true && that.isSetOpt_value();
    if (this_present_opt_value || that_present_opt_value) {
      if (!(this_present_opt_value && that_present_opt_value))
        return false;
      if (!TBaseHelper.equalsNobinary(this.opt_value, that.opt_value))
        return false;
    }

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!TBaseHelper.equalsNobinary(this.value, that.value))
        return false;
    }

    boolean this_present_req_value = true;
    boolean that_present_req_value = true;
    if (this_present_req_value || that_present_req_value) {
      if (!(this_present_req_value && that_present_req_value))
        return false;
      if (!TBaseHelper.equalsNobinary(this.req_value, that.req_value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(MyField other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpt_value()).compareTo(other.isSetOpt_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_value, other.opt_value);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(value, other.value);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetReq_value()).compareTo(other.isSetReq_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(req_value, other.req_value);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case OPT_VALUE:
          if (field.type == TType.I64) {
            this.opt_value = iprot.readI64();
            setOpt_valueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VALUE:
          if (field.type == TType.I64) {
            this.value = iprot.readI64();
            setValueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REQ_VALUE:
          if (field.type == TType.I64) {
            this.req_value = iprot.readI64();
            setReq_valueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetReq_value()) {
      throw new TProtocolException("Required field 'req_value' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetOpt_value()) {
      oprot.writeFieldBegin(OPT_VALUE_FIELD_DESC);
      oprot.writeI64(this.opt_value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(VALUE_FIELD_DESC);
    oprot.writeI64(this.value);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REQ_VALUE_FIELD_DESC);
    oprot.writeI64(this.req_value);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("MyField");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetOpt_value())
    {
      sb.append(indentStr);
      sb.append("opt_value");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getOpt_value(), indent + 1, prettyPrint));
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("value");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getValue(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("req_value");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getReq_value(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'req_value' because it's a primitive and you chose the non-beans generator.
  }

}

