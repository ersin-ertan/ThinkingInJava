package com.nullcognition.android.thinkinginjava.pack;

import android.support.annotation.Nullable;
import com.nullcognition.android.thinkinginjava.MyO;
import com.nullcognition.android.thinkinginjava.newpack.Myclass;

/**
 * Created by mms on 10/16/16.
 */

public class Comments extends Com {

  /*
  * This is a multi line description of what this this is should do
   * Good job.
  */

  // this is a single line comment

  /**
   * @docRoot provides relative path to doc root
   * @inheritDoc inherits documentation from nearest base class into current doc comment
   * @version 4.4 if used with cmd line
   * @author ersin ertan eersin@somedomain.com
   * @see Comments
   * @see Comments#meth()
   * @see Comments#meth(int)
   * @see Comments#meth(int, String) returns a String
   * @see Comments#meth(MyO)
   * {@link #meth(int, String) someMoreWords} is inlined
   * {@link Myclass#meth(int, String)}
   * {@link com.nullcognition.android.thinkinginjava.pack.Comments#meth(int, String)}
   * {@linkplain #meth(MyO)}
   * {@link #m() }.
   * @since 3.8 started using this code
   */

  public void meth() {
  }

  /**
   *  @param nonexistant this is the description
   * @param myParam this is the description
   * @return nothing to state here
   */
  public void meth(int myParam) {
  }

  /**
   * // remember to have double ** for the start of the comments
   *
   * @param s is a string
   * @return the string which you put in
   */
  public String meth(int i, String s) {
    return s;
  }

  /**
   * @throws NullPointerException if the user inputs an empty string
   */

  void throwsM(@Nullable String s) throws NullPointerException {
    String ss = s.toUpperCase();
  }

  public void meth(MyO mo) {
  }

  public MyO m() {
    return new MyO();
  }

  @Override Integer mm(int i) {
    return i;
  }
}

abstract class Com {

  /*
  * @see isnotworking
  *
  *
  *
  */

  /*
  * @param myInt
  * @return the int wrapped in its object wrapper
  * */
  abstract Integer mm(int myInt);
}