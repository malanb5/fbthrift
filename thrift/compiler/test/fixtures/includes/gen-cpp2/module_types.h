/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/Thrift.h>
#include <thrift/lib/cpp2/protocol/Protocol.h>
#include <thrift/lib/cpp/TApplicationException.h>
#include <folly/io/IOBuf.h>
#include <folly/io/Cursor.h>

#include "includes_types.h"
#include <thrift/lib/cpp2/GeneratedHeaderHelper.h>



namespace cpp2 {

class MyStruct;

class MyStruct : private apache::thrift::detail::st::ComparisonOperators<MyStruct> {
 public:

  MyStruct() :
      MyIncludedField( ::cpp2::Included(::apache::thrift::detail::wrap_argument<1>(5LL))),
      MyIncludedInt(42LL) {}
  // FragileConstructor for use in initialization lists only

  MyStruct(apache::thrift::FragileConstructor,  ::cpp2::Included MyIncludedField__arg,  ::cpp2::IncludedInt64 MyIncludedInt__arg) :
      MyIncludedField(std::move(MyIncludedField__arg)),
      MyIncludedInt(std::move(MyIncludedInt__arg)) {
    __isset.MyIncludedField = true;
    __isset.MyIncludedInt = true;
  }
  template <typename T__ThriftWrappedArgument__Ctor, typename... Args__ThriftWrappedArgument__Ctor>
  MyStruct(::apache::thrift::detail::argument_wrapper<1, T__ThriftWrappedArgument__Ctor> arg, Args__ThriftWrappedArgument__Ctor&&... args):
    MyStruct(std::forward<Args__ThriftWrappedArgument__Ctor>(args)...)
  {
    MyIncludedField = arg.move();
    __isset.MyIncludedField = true;
  }
  template <typename T__ThriftWrappedArgument__Ctor, typename... Args__ThriftWrappedArgument__Ctor>
  MyStruct(::apache::thrift::detail::argument_wrapper<2, T__ThriftWrappedArgument__Ctor> arg, Args__ThriftWrappedArgument__Ctor&&... args):
    MyStruct(std::forward<Args__ThriftWrappedArgument__Ctor>(args)...)
  {
    MyIncludedInt = arg.move();
    __isset.MyIncludedInt = true;
  }

  MyStruct(MyStruct&&) = default;

  MyStruct(const MyStruct&) = default;

  MyStruct& operator=(MyStruct&&) = default;

  MyStruct& operator=(const MyStruct&) = default;
  void __clear();

  virtual ~MyStruct() throw() {}

   ::cpp2::Included MyIncludedField;
   ::cpp2::IncludedInt64 MyIncludedInt;

  struct __isset {
    void __clear() {
      MyIncludedField = false;
      MyIncludedInt = false;
    }

    bool MyIncludedField = false;
    bool MyIncludedInt = false;
  } __isset;
  bool operator==(const MyStruct& rhs) const;
  bool operator < (const MyStruct& rhs) const;
  const  ::cpp2::Included& get_MyIncludedField() const&;
   ::cpp2::Included get_MyIncludedField() &&;
  template <typename T_MyStruct_MyIncludedField_struct_setter>
   ::cpp2::Included& set_MyIncludedField(T_MyStruct_MyIncludedField_struct_setter&& MyIncludedField_);

   ::cpp2::IncludedInt64 get_MyIncludedInt() const {
    return MyIncludedInt;
  }

   ::cpp2::IncludedInt64& set_MyIncludedInt( ::cpp2::IncludedInt64 MyIncludedInt_) {
    MyIncludedInt = MyIncludedInt_;
    __isset.MyIncludedInt = true;
    return MyIncludedInt;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;
};

void swap(MyStruct& a, MyStruct& b);
extern template uint32_t MyStruct::read<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t MyStruct::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t MyStruct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t MyStruct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t MyStruct::read<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t MyStruct::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t MyStruct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t MyStruct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
namespace apache { namespace thrift {

template <> inline void Cpp2Ops< ::cpp2::MyStruct>::clear( ::cpp2::MyStruct* obj) {
  return obj->__clear();
}

template <> inline constexpr apache::thrift::protocol::TType Cpp2Ops< ::cpp2::MyStruct>::thriftType() {
  return apache::thrift::protocol::T_STRUCT;
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::MyStruct>::write(Protocol* proto,  ::cpp2::MyStruct const* obj) {
  return obj->write(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::MyStruct>::read(Protocol* proto,  ::cpp2::MyStruct* obj) {
  return obj->read(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::MyStruct>::serializedSize(Protocol const* proto,  ::cpp2::MyStruct const* obj) {
  return obj->serializedSize(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::MyStruct>::serializedSizeZC(Protocol const* proto,  ::cpp2::MyStruct const* obj) {
  return obj->serializedSizeZC(proto);
}

}} // apache::thrift
namespace cpp2 {

} // cpp2
