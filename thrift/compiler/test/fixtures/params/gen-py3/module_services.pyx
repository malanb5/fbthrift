#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap
from cython.operator cimport dereference as deref
from cpython.ref cimport PyObject
from thrift.lib.py3.thrift_server cimport (
  ServiceInterface,
  cTApplicationException
)
from folly_futures cimport cFollyPromise, cFollyUnit, c_unit
cimport py3.module_types
import py3.module_types

import asyncio
import functools
import sys
import traceback

from py3.module_services_wrapper cimport cNestedContainersInterface


cdef extern from "<utility>" namespace "std":
    cdef cFollyPromise[cFollyUnit] move(cFollyPromise[cFollyUnit])

cdef class Promise_void:
    cdef cFollyPromise[cFollyUnit] cPromise

    @staticmethod
    cdef create(cFollyPromise[cFollyUnit] cPromise):
        inst = <Promise_void>Promise_void.__new__(Promise_void)
        inst.cPromise = move(cPromise)
        return inst

cdef public void call_cy_NestedContainers_mapList(
    object self,
    cFollyPromise[cFollyUnit] cPromise,
    unique_ptr[cmap[int32_t,]] foo
) with gil:
    promise = Promise_void.create(move(cPromise))
    arg_foo = .module_types.Map__i32_List__i32.create(.module_types.move(foo))
    asyncio.run_coroutine_threadsafe(
        NestedContainers_mapList_coro(
            self,
            promise,
            arg_foo),
        loop=self.loop)

async def NestedContainers_mapList_coro(
    object self,
    Promise_void promise,
    foo
):
    try:
      result = await self.mapList(
          foo)
    except Exception as ex:
        print(
            "Unexpected error in service handler mapList:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

cdef public void call_cy_NestedContainers_mapSet(
    object self,
    cFollyPromise[cFollyUnit] cPromise,
    unique_ptr[cmap[int32_t,]] foo
) with gil:
    promise = Promise_void.create(move(cPromise))
    arg_foo = .module_types.Map__i32_Set__i32.create(.module_types.move(foo))
    asyncio.run_coroutine_threadsafe(
        NestedContainers_mapSet_coro(
            self,
            promise,
            arg_foo),
        loop=self.loop)

async def NestedContainers_mapSet_coro(
    object self,
    Promise_void promise,
    foo
):
    try:
      result = await self.mapSet(
          foo)
    except Exception as ex:
        print(
            "Unexpected error in service handler mapSet:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

cdef public void call_cy_NestedContainers_listMap(
    object self,
    cFollyPromise[cFollyUnit] cPromise,
    unique_ptr[vector[]] foo
) with gil:
    promise = Promise_void.create(move(cPromise))
    arg_foo = .module_types.List__Map__i32_i32.create(.module_types.move(foo))
    asyncio.run_coroutine_threadsafe(
        NestedContainers_listMap_coro(
            self,
            promise,
            arg_foo),
        loop=self.loop)

async def NestedContainers_listMap_coro(
    object self,
    Promise_void promise,
    foo
):
    try:
      result = await self.listMap(
          foo)
    except Exception as ex:
        print(
            "Unexpected error in service handler listMap:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

cdef public void call_cy_NestedContainers_listSet(
    object self,
    cFollyPromise[cFollyUnit] cPromise,
    unique_ptr[vector[]] foo
) with gil:
    promise = Promise_void.create(move(cPromise))
    arg_foo = .module_types.List__Set__i32.create(.module_types.move(foo))
    asyncio.run_coroutine_threadsafe(
        NestedContainers_listSet_coro(
            self,
            promise,
            arg_foo),
        loop=self.loop)

async def NestedContainers_listSet_coro(
    object self,
    Promise_void promise,
    foo
):
    try:
      result = await self.listSet(
          foo)
    except Exception as ex:
        print(
            "Unexpected error in service handler listSet:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

cdef public void call_cy_NestedContainers_turtles(
    object self,
    cFollyPromise[cFollyUnit] cPromise,
    unique_ptr[vector[]] foo
) with gil:
    promise = Promise_void.create(move(cPromise))
    arg_foo = .module_types.List__List__Map__i32_Map__i32_Set__i32.create(.module_types.move(foo))
    asyncio.run_coroutine_threadsafe(
        NestedContainers_turtles_coro(
            self,
            promise,
            arg_foo),
        loop=self.loop)

async def NestedContainers_turtles_coro(
    object self,
    Promise_void promise,
    foo
):
    try:
      result = await self.turtles(
          foo)
    except Exception as ex:
        print(
            "Unexpected error in service handler turtles:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)


cdef class NestedContainersInterface(
    ServiceInterface
):
    def __cinit__(self):
        self.interface_wrapper = cNestedContainersInterface(<PyObject *> self)

    def __init__(self, loop=None):
        self.loop = loop or asyncio.get_event_loop()

    async def mapList(
            self,
            foo):
        raise NotImplementedError("async def mapList is not implemented")


    async def mapSet(
            self,
            foo):
        raise NotImplementedError("async def mapSet is not implemented")


    async def listMap(
            self,
            foo):
        raise NotImplementedError("async def listMap is not implemented")


    async def listSet(
            self,
            foo):
        raise NotImplementedError("async def listSet is not implemented")


    async def turtles(
            self,
            foo):
        raise NotImplementedError("async def turtles is not implemented")


