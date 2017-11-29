#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import thrift.py3.types
import thrift.py3.exceptions
from thrift.py3.types import NOTSET, NOTSETTYPE
from thrift.py3.serializer import Protocol
import typing as _typing

import sys
import itertools
from enum import Enum


class TypedEnum(Enum):
    VAL1 = ...
    VAL2 = ...
    value: int


class MyUnionType(Enum):
    EMPTY = ...
    anInteger = ...
    aString = ...
    value: int


class MyUnion(thrift.py3.types.Union):
    def __init__(
        self, *,
        anInteger: int=None,
        aString: str=None
    ) -> None: ...

    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'MyUnion') -> bool: ...

    @property
    def anInteger(self) -> int: ...
    @property
    def aString(self) -> str: ...
    @property
    def value(self) -> _typing.Union[int, str]: ...
    @property
    def type(self) -> MyUnionType: ...
    def get_type(self) -> MyUnionType: ...


class MyField(thrift.py3.types.Struct):
    def __init__(
        self, *,
        opt_value: int=None,
        value: int=None,
        req_value: int
    ) -> None: ...

    def __call__(
        self, *,
        opt_value: _typing.Union[int, NOTSETTYPE, None]=NOTSET,
        value: _typing.Union[int, NOTSETTYPE, None]=NOTSET,
        req_value: _typing.Union[int, NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['MyField'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'MyField') -> bool: ...

    @property
    def opt_value(self) -> int: ...
    @property
    def value(self) -> int: ...
    @property
    def req_value(self) -> int: ...


class MyStruct(thrift.py3.types.Struct):
    def __init__(
        self, *,
        opt_ref: 'MyField'=None,
        ref: 'MyField'=None,
        req_ref: 'MyField'
    ) -> None: ...

    def __call__(
        self, *,
        opt_ref: _typing.Union['MyField', NOTSETTYPE, None]=NOTSET,
        ref: _typing.Union['MyField', NOTSETTYPE, None]=NOTSET,
        req_ref: _typing.Union['MyField', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['MyStruct'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'MyStruct') -> bool: ...

    @property
    def opt_ref(self) -> 'MyField': ...
    @property
    def ref(self) -> 'MyField': ...
    @property
    def req_ref(self) -> 'MyField': ...


class StructWithUnion(thrift.py3.types.Struct):
    def __init__(
        self, *,
        u: 'MyUnion'=None,
        aDouble: float=None,
        f: 'MyField'=None
    ) -> None: ...

    def __call__(
        self, *,
        u: _typing.Union['MyUnion', NOTSETTYPE, None]=NOTSET,
        aDouble: _typing.Union[float, NOTSETTYPE, None]=NOTSET,
        f: _typing.Union['MyField', NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithUnion'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithUnion') -> bool: ...

    @property
    def u(self) -> 'MyUnion': ...
    @property
    def aDouble(self) -> float: ...
    @property
    def f(self) -> 'MyField': ...


class RecursiveStruct(thrift.py3.types.Struct):
    def __init__(
        self, *,
        mes: _typing.Sequence['RecursiveStruct']=None
    ) -> None: ...

    def __call__(
        self, *,
        mes: _typing.Union[_typing.Sequence['RecursiveStruct'], NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['RecursiveStruct'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'RecursiveStruct') -> bool: ...

    @property
    def mes(self) -> _typing.Sequence['RecursiveStruct']: ...


class StructWithContainers(thrift.py3.types.Struct):
    def __init__(
        self, *,
        list_ref: _typing.Sequence[int]=None,
        set_ref: _typing.AbstractSet[int]=None,
        map_ref: _typing.Mapping[int, int]=None,
        list_ref_unique: _typing.Sequence[int]=None,
        set_ref_shared: _typing.AbstractSet[int]=None,
        list_ref_shared_const: _typing.Sequence[int]=None
    ) -> None: ...

    def __call__(
        self, *,
        list_ref: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        set_ref: _typing.Union[_typing.AbstractSet[int], NOTSETTYPE, None]=NOTSET,
        map_ref: _typing.Union[_typing.Mapping[int, int], NOTSETTYPE, None]=NOTSET,
        list_ref_unique: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        set_ref_shared: _typing.Union[_typing.AbstractSet[int], NOTSETTYPE, None]=NOTSET,
        list_ref_shared_const: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithContainers'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithContainers') -> bool: ...

    @property
    def list_ref(self) -> _typing.Sequence[int]: ...
    @property
    def set_ref(self) -> _typing.AbstractSet[int]: ...
    @property
    def map_ref(self) -> _typing.Mapping[int, int]: ...
    @property
    def list_ref_unique(self) -> _typing.Sequence[int]: ...
    @property
    def set_ref_shared(self) -> _typing.AbstractSet[int]: ...
    @property
    def list_ref_shared_const(self) -> _typing.Sequence[int]: ...


class StructWithSharedConst(thrift.py3.types.Struct):
    def __init__(
        self, *,
        opt_shared_const: 'MyField'=None,
        shared_const: 'MyField'=None,
        req_shared_const: 'MyField'
    ) -> None: ...

    def __call__(
        self, *,
        opt_shared_const: _typing.Union['MyField', NOTSETTYPE, None]=NOTSET,
        shared_const: _typing.Union['MyField', NOTSETTYPE, None]=NOTSET,
        req_shared_const: _typing.Union['MyField', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithSharedConst'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithSharedConst') -> bool: ...

    @property
    def opt_shared_const(self) -> 'MyField': ...
    @property
    def shared_const(self) -> 'MyField': ...
    @property
    def req_shared_const(self) -> 'MyField': ...


class Empty(thrift.py3.types.Struct):
    def __init__(
        self, 
    ) -> None: ...

    def __call__(
        self, 
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['Empty'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'Empty') -> bool: ...



class StructWithRef(thrift.py3.types.Struct):
    def __init__(
        self, *,
        def_field: 'Empty'=None,
        opt_field: 'Empty'=None,
        req_field: 'Empty'
    ) -> None: ...

    def __call__(
        self, *,
        def_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        opt_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        req_field: _typing.Union['Empty', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithRef'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithRef') -> bool: ...

    @property
    def def_field(self) -> 'Empty': ...
    @property
    def opt_field(self) -> 'Empty': ...
    @property
    def req_field(self) -> 'Empty': ...


class StructWithRefTypeUnique(thrift.py3.types.Struct):
    def __init__(
        self, *,
        def_field: 'Empty'=None,
        opt_field: 'Empty'=None,
        req_field: 'Empty'
    ) -> None: ...

    def __call__(
        self, *,
        def_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        opt_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        req_field: _typing.Union['Empty', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithRefTypeUnique'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithRefTypeUnique') -> bool: ...

    @property
    def def_field(self) -> 'Empty': ...
    @property
    def opt_field(self) -> 'Empty': ...
    @property
    def req_field(self) -> 'Empty': ...


class StructWithRefTypeShared(thrift.py3.types.Struct):
    def __init__(
        self, *,
        def_field: 'Empty'=None,
        opt_field: 'Empty'=None,
        req_field: 'Empty'
    ) -> None: ...

    def __call__(
        self, *,
        def_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        opt_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        req_field: _typing.Union['Empty', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithRefTypeShared'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithRefTypeShared') -> bool: ...

    @property
    def def_field(self) -> 'Empty': ...
    @property
    def opt_field(self) -> 'Empty': ...
    @property
    def req_field(self) -> 'Empty': ...


class StructWithRefTypeSharedConst(thrift.py3.types.Struct):
    def __init__(
        self, *,
        def_field: 'Empty'=None,
        opt_field: 'Empty'=None,
        req_field: 'Empty'
    ) -> None: ...

    def __call__(
        self, *,
        def_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        opt_field: _typing.Union['Empty', NOTSETTYPE, None]=NOTSET,
        req_field: _typing.Union['Empty', NOTSETTYPE]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithRefTypeSharedConst'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithRefTypeSharedConst') -> bool: ...

    @property
    def def_field(self) -> 'Empty': ...
    @property
    def opt_field(self) -> 'Empty': ...
    @property
    def req_field(self) -> 'Empty': ...


_List__RecursiveStructT = _typing.TypeVar('_List__RecursiveStructT', bound=_typing.Sequence['RecursiveStruct'])


class List__RecursiveStruct(_typing.Sequence['RecursiveStruct']):
    def __init__(self, items: _typing.Sequence['RecursiveStruct']=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: 'RecursiveStruct') -> int: ...
    def __add__(self, other: _typing.Sequence['RecursiveStruct']) -> 'List__RecursiveStruct': ...
    def __radd__(self, other: _List__RecursiveStructT) -> _List__RecursiveStructT: ...
    def __reversed__(self) -> _typing.Iterator['RecursiveStruct']: ...
    def __iter__(self) -> _typing.Iterator['RecursiveStruct']: ...


_List__i32T = _typing.TypeVar('_List__i32T', bound=_typing.Sequence[int])


class List__i32(_typing.Sequence[int]):
    def __init__(self, items: _typing.Sequence[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: int) -> int: ...
    def __add__(self, other: _typing.Sequence[int]) -> 'List__i32': ...
    def __radd__(self, other: _List__i32T) -> _List__i32T: ...
    def __reversed__(self) -> _typing.Iterator[int]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


class Set__i32(_typing.AbstractSet[int]):
    def __init__(self, items: _typing.AbstractSet[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __lt__(self, other: _typing.AbstractSet[int]) -> bool: ...
    def __add__(self, other: _typing.AbstractSet[int]) -> 'Set__i32': ...
    def isdisjoint(self, other: _typing.AbstractSet[int]) -> bool: ...
    def union(self, other: _typing.AbstractSet[int]) -> 'Set__i32': ...
    def intersection(self, other: _typing.AbstractSet[int]) -> 'Set__i32': ...
    def difference(self, other: _typing.AbstractSet[int]) -> 'Set__i32': ...
    def symmetric_difference(self, other: _typing.AbstractSet[int]) -> 'Set__i32': ...
    def issubset(self, other: _typing.AbstractSet[int]) -> bool: ...
    def issuperset(self, other: _typing.AbstractSet[int]) -> bool: ...


class Map__i32_i32(_typing.Mapping[int, int]):
    def __init__(self, items: _typing.Mapping[int, int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __getitem__(self, key: int) -> int: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


