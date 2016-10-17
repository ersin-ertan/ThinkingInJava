package com.nullcognition.android.thinkinginjava;

/**
 * Created by mms on 10/16/16.
 */

public class Eiao {

  void m() {
    MyO mo = new MyO();
    mo.i = 2;
    moChanger(mo);
    // mo.i should now equal 3 after teh method call

  }

  private static void moChanger(MyO m) {
    m.i = 3;
  }
}

