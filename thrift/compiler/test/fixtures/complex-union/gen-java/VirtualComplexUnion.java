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
public class VirtualComplexUnion extends TUnion<VirtualComplexUnion> implements Comparable<VirtualComplexUnion> {
  public static boolean DEFAULT_PRETTY_PRINT = true;
  private static final TStruct STRUCT_DESC = new TStruct("VirtualComplexUnion");
  private static final TField THING_ONE_FIELD_DESC = new TField("thingOne", TType.STRING, (short)1);
  private static final TField THING_TWO_FIELD_DESC = new TField("thingTwo", TType.STRING, (short)2);

  public static final int THINGONE = 1;
  public static final int THINGTWO = 2;

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(THINGONE, new FieldMetaData("thingOne", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(THINGTWO, new FieldMetaData("thingTwo", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public VirtualComplexUnion() {
    super();
  }

  public VirtualComplexUnion(int setField, Object value) {
    super(setField, value);
  }

  public VirtualComplexUnion(VirtualComplexUnion other) {
    super(other);
  }
  public VirtualComplexUnion deepCopy() {
    return new VirtualComplexUnion(this);
  }

  public static VirtualComplexUnion thingOne(String value) {
    VirtualComplexUnion x = new VirtualComplexUnion();
    x.setThingOne(value);
    return x;
  }

  public static VirtualComplexUnion thingTwo(String value) {
    VirtualComplexUnion x = new VirtualComplexUnion();
    x.setThingTwo(value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object value) throws ClassCastException {
    switch (setField) {
      case THINGONE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'thingOne', but got " + value.getClass().getSimpleName());
      case THINGTWO:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'thingTwo', but got " + value.getClass().getSimpleName());
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
          case THINGONE:
            if (field.type == THING_ONE_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case THINGTWO:
            if (field.type == THING_TWO_FIELD_DESC.type) {
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
      case THINGONE:
        if (field.type == THING_ONE_FIELD_DESC.type) {
          String thingOne;
          thingOne = iprot.readString();
          return thingOne;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case THINGTWO:
        if (field.type == THING_TWO_FIELD_DESC.type) {
          String thingTwo;
          thingTwo = iprot.readString();
          return thingTwo;
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
      case THINGONE:
        String thingOne = (String)getFieldValue();
        oprot.writeString(thingOne);
        return;
      case THINGTWO:
        String thingTwo = (String)getFieldValue();
        oprot.writeString(thingTwo);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case THINGONE:
        return THING_ONE_FIELD_DESC;
      case THINGTWO:
        return THING_TWO_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  public String getThingOne() {
    if (getSetField() == THINGONE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'thingOne' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setThingOne(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = THINGONE;
    value_ = value;
  }

  public String getThingTwo() {
    if (getSetField() == THINGTWO) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'thingTwo' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setThingTwo(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = THINGTWO;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof VirtualComplexUnion) {
      return equals((VirtualComplexUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(VirtualComplexUnion other) {
    return equalsNobinaryImpl(other);
  }

  @Override
  public int compareTo(VirtualComplexUnion other) {
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
    StringBuilder sb = new StringBuilder("VirtualComplexUnion");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    // Only print this field if it is the set field
    if (getSetField() == THINGONE)
    {
      sb.append(indentStr);
      sb.append("thingOne");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getThingOne() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getThingOne(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == THINGTWO)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("thingTwo");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getThingTwo() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getThingTwo(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }


}
