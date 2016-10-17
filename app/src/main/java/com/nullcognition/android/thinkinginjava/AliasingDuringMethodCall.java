package com.nullcognition.android.thinkinginjava;

/**
 * Created by mms on 10/16/16.
 */

public class AliasingDuringMethodCall {

  class Letter {
    char c;
  }

  void change(Letter l) {
    l.c = 'z';
  }

  void changeChar(char c) {
    if (c == 'b') {
      c = 'c';
    } else {
      c = 'z';
    }
  }

  void main() {
    Letter l = new Letter();
    l.c = 'a'; // equals a
    change(l);
    // l.c should now equal z

    changeChar(l.c = 'b');
  }
}
