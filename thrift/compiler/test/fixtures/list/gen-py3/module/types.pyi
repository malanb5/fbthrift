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


_List__stringT = _typing.TypeVar('_List__stringT', bound=_typing.Sequence[str])


class List__string(_typing.Sequence[str]):
    def __init__(self, items: _typing.Sequence[str]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def count(self, item: str) -> int: ...
    def __add__(self, other: _typing.Sequence[str]) -> 'List__string': ...
    def __radd__(self, other: _List__stringT) -> _List__stringT: ...
    def __reversed__(self) -> _typing.Iterator[str]: ...
    def __iter__(self) -> _typing.Iterator[str]: ...


class Map__i64_List__string(_typing.Mapping[int, _typing.Sequence[str]]):
    def __init__(self, items: _typing.Mapping[int, _typing.Sequence[str]]=None) -> None: ...
    def __repr__(self) -> str: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __getitem__(self, key: int) -> _typing.Sequence[str]: ...
    def __iter__(self) -> _typing.Iterator[int]: ...


