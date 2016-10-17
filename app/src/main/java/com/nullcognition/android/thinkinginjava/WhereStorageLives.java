package com.nullcognition.android.thinkinginjava;

/**
 * Created by mms on 10/16/16.
 */

public class WhereStorageLives {

  // in five places

  // registers fastest - inside the processor, limited number, allocated as needed, not available in java

  // the stack - ram, directo support from processor via stack pointers, moved down to create new memory
  // and up to release memory, java system must know the exact lifetime at compile time of all thee items stored here,
  // object references are stored here but not java objects

  // heap general purpose pool of memory in ram areas for all java objects, compiler doesnt need to
  // know what is in here, create objects using new, takes more time to allocate, clean up.

  // constant storage, constant values placed directly n the program code, safe since they never change
  // or rom in embedded systems


  // non ram storage, outside a program, like streamed objects and persistent objects placed on disk to hold their state
  //
}
