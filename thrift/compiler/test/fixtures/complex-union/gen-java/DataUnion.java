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

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class DataUnion extends TUnion<DataUnion> implements Comparable<DataUnion> {
  public static boolean DEFAULT_PRETTY_PRINT = true;
  private static final TStruct STRUCT_DESC = new TStruct("DataUnion");
  private static final TField BINARY_DATA_FIELD_DESC = new TField("binaryData", TType.STRING, (short)1);
  private static final TField STRING_DATA_FIELD_DESC = new TField("stringData", TType.STRING, (short)2);

  public static final int BINARYDATA = 1;
  public static final int STRINGDATA = 2;

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(BINARYDATA, new FieldMetaData("binaryData", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(STRINGDATA, new FieldMetaData("stringData", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public DataUnion() {
    super();
  }

  public DataUnion(int setField, Object value) {
    super(setField, value);
  }

  public DataUnion(DataUnion other) {
    super(other);
  }
  public DataUnion deepCopy() {
    return new DataUnion(this);
  }

  public static DataUnion binaryData(byte[] value) {
    DataUnion x = new DataUnion();
    x.setBinaryData(value);
    return x;
  }

  public static DataUnion stringData(String value) {
    DataUnion x = new DataUnion();
    x.setStringData(value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object value) throws ClassCastException {
    switch (setField) {
      case BINARYDATA:
        if (value instanceof byte[]) {
          break;
        }
        throw new ClassCastException("Was expecting value of type byte[] for field 'binaryData', but got " + value.getClass().getSimpleName());
      case STRINGDATA:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'stringData', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField field = iprot.readFieldBegin();
    if (field.type != TType.STOP)
    {
      value_ = readValue(iprot, field);
      if (value_ != null)
      {
        switch (field.id) {
          case BINARYDATA:
            if (field.type == BINARY_DATA_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case STRINGDATA:
            if (field.type == STRING_DATA_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      iprot.readFieldBegin();
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField field) throws TException {
    switch (field.id) {
      case BINARYDATA:
        if (field.type == BINARY_DATA_FIELD_DESC.type) {
          byte[] binaryData;
          binaryData = iprot.readBinary();
          return binaryData;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case STRINGDATA:
        if (field.type == STRING_DATA_FIELD_DESC.type) {
          String stringData;
          stringData = iprot.readString();
          return stringData;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      default:
        TProtocolUtil.skip(iprot, field.type);
        return null;
    }
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object value) throws TException {
    switch (setField) {
      case BINARYDATA:
        byte[] binaryData = (byte[])getFieldValue();
        oprot.writeBinary(binaryData);
        return;
      case STRINGDATA:
        String stringData = (String)getFieldValue();
        oprot.writeString(stringData);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case BINARYDATA:
        return BINARY_DATA_FIELD_DESC;
      case STRINGDATA:
        return STRING_DATA_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  public byte[] getBinaryData() {
    if (getSetField() == BINARYDATA) {
      return (byte[])getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'binaryData' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBinaryData(byte[] value) {
    if (value == null) throw new NullPointerException();
    setField_ = BINARYDATA;
    value_ = value;
  }

  public String getStringData() {
    if (getSetField() == STRINGDATA) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringData' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringData(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = STRINGDATA;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof DataUnion) {
      return equals((DataUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(DataUnion other) {
    return equalsSlowImpl(other);
  }

  @Override
  public int compareTo(DataUnion other) {
    return compareToImpl(other);
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
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
    StringBuilder sb = new StringBuilder("DataUnion");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    // Only print this field if it is the set field
    if (getSetField() == BINARYDATA)
    {
      sb.append(indentStr);
      sb.append("binaryData");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getBinaryData() == null) {
        sb.append("null");
      } else {
          int __binaryData_size = Math.min(this.getBinaryData().length, 128);
          for (int i = 0; i < __binaryData_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getBinaryData()[i]).length() > 1 ? Integer.toHexString(this.getBinaryData()[i]).substring(Integer.toHexString(this.getBinaryData()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getBinaryData()[i]).toUpperCase());
          }
          if (this.getBinaryData().length > 128) sb.append(" ...");
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == STRINGDATA)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("stringData");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getStringData() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getStringData(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }


}
