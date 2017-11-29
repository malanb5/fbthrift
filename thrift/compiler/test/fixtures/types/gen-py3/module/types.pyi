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
import include.types as _include_types


class has_bitwise_ops(Enum):
    none = ...
    zero = ...
    one = ...
    two = ...
    three = ...
    value: int


class is_unscoped(Enum):
    hello = ...
    world = ...
    value: int


class decorated_struct(thrift.py3.types.Struct):
    def __init__(
        self, *,
        field: str=None
    ) -> None: ...

    def __call__(
        self, *,
        field: _typing.Union[str, NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['decorated_struct'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'decorated_struct') -> bool: ...

    @property
    def field(self) -> str: ...


class ContainerStruct(thrift.py3.types.Struct):
    def __init__(
        self, *,
        fieldA: _typing.Sequence[int]=None,
        fieldB: _typing.Sequence[int]=None,
        fieldC: _typing.Sequence[int]=None,
        fieldD: _typing.Sequence[int]=None,
        fieldE: _typing.Sequence[int]=None,
        fieldF: _typing.AbstractSet[int]=None,
        fieldG: _typing.Mapping[int, str]=None,
        fieldH: _typing.Mapping[int, str]=None
    ) -> None: ...

    def __call__(
        self, *,
        fieldA: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        fieldB: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        fieldC: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        fieldD: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        fieldE: _typing.Union[_typing.Sequence[int], NOTSETTYPE, None]=NOTSET,
        fieldF: _typing.Union[_typing.AbstractSet[int], NOTSETTYPE, None]=NOTSET,
        fieldG: _typing.Union[_typing.Mapping[int, str], NOTSETTYPE, None]=NOTSET,
        fieldH: _typing.Union[_typing.Mapping[int, str], NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['ContainerStruct'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'ContainerStruct') -> bool: ...

    @property
    def fieldA(self) -> _typing.Sequence[int]: ...
    @property
    def fieldB(self) -> _typing.Sequence[int]: ...
    @property
    def fieldC(self) -> _typing.Sequence[int]: ...
    @property
    def fieldD(self) -> _typing.Sequence[int]: ...
    @property
    def fieldE(self) -> _typing.Sequence[int]: ...
    @property
    def fieldF(self) -> _typing.AbstractSet[int]: ...
    @property
    def fieldG(self) -> _typing.Mapping[int, str]: ...
    @property
    def fieldH(self) -> _typing.Mapping[int, str]: ...


class VirtualStruct(thrift.py3.types.Struct):
    def __init__(
        self, *,
        MyIntField: int=None
    ) -> None: ...

    def __call__(
        self, *,
        MyIntField: _typing.Union[int, NOTSETTYPE, None]=NOTSET
    ): ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['VirtualStruct'], bytes]]: ...
    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...
    def __bool__(self) -> bool: ...
    def __hash__(self) -> int: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'VirtualStruct') -> bool: ...

    @property
    def MyIntField(self) -> int: ...


class std_unordered_map__Map__i32_string(_typing.Mapping[int, str]):
    def __init__(self, items: _typing.Mapping[int, str]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __getitem__(self, key: int) -> str: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


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


_std_list__List__i32T = _typing.TypeVar('_std_list__List__i32T', bound=_typing.Sequence[int])


class std_list__List__i32(_typing.Sequence[int]):
    def __init__(self, items: _typing.Sequence[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: int) -> int: ...
    def __add__(self, other: _typing.Sequence[int]) -> 'std_list__List__i32': ...
    def __radd__(self, other: _std_list__List__i32T) -> _std_list__List__i32T: ...
    def __reversed__(self) -> _typing.Iterator[int]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


_std_deque__List__i32T = _typing.TypeVar('_std_deque__List__i32T', bound=_typing.Sequence[int])


class std_deque__List__i32(_typing.Sequence[int]):
    def __init__(self, items: _typing.Sequence[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: int) -> int: ...
    def __add__(self, other: _typing.Sequence[int]) -> 'std_deque__List__i32': ...
    def __radd__(self, other: _std_deque__List__i32T) -> _std_deque__List__i32T: ...
    def __reversed__(self) -> _typing.Iterator[int]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


_folly_fbvector__List__i32T = _typing.TypeVar('_folly_fbvector__List__i32T', bound=_typing.Sequence[int])


class folly_fbvector__List__i32(_typing.Sequence[int]):
    def __init__(self, items: _typing.Sequence[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: int) -> int: ...
    def __add__(self, other: _typing.Sequence[int]) -> 'folly_fbvector__List__i32': ...
    def __radd__(self, other: _folly_fbvector__List__i32T) -> _folly_fbvector__List__i32T: ...
    def __reversed__(self) -> _typing.Iterator[int]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


_folly_small_vector__List__i32T = _typing.TypeVar('_folly_small_vector__List__i32T', bound=_typing.Sequence[int])


class folly_small_vector__List__i32(_typing.Sequence[int]):
    def __init__(self, items: _typing.Sequence[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: int) -> int: ...
    def __add__(self, other: _typing.Sequence[int]) -> 'folly_small_vector__List__i32': ...
    def __radd__(self, other: _folly_small_vector__List__i32T) -> _folly_small_vector__List__i32T: ...
    def __reversed__(self) -> _typing.Iterator[int]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


class folly_sorted_vector_set__Set__i32(_typing.AbstractSet[int]):
    def __init__(self, items: _typing.AbstractSet[int]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __lt__(self, other: _typing.AbstractSet[int]) -> bool: ...
    def __add__(self, other: _typing.AbstractSet[int]) -> 'folly_sorted_vector_set__Set__i32': ...
    def isdisjoint(self, other: _typing.AbstractSet[int]) -> bool: ...
    def union(self, other: _typing.AbstractSet[int]) -> 'folly_sorted_vector_set__Set__i32': ...
    def intersection(self, other: _typing.AbstractSet[int]) -> 'folly_sorted_vector_set__Set__i32': ...
    def difference(self, other: _typing.AbstractSet[int]) -> 'folly_sorted_vector_set__Set__i32': ...
    def symmetric_difference(self, other: _typing.AbstractSet[int]) -> 'folly_sorted_vector_set__Set__i32': ...
    def issubset(self, other: _typing.AbstractSet[int]) -> bool: ...
    def issuperset(self, other: _typing.AbstractSet[int]) -> bool: ...


class folly_sorted_vector_map__Map__i32_string(_typing.Mapping[int, str]):
    def __init__(self, items: _typing.Mapping[int, str]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __getitem__(self, key: int) -> str: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


