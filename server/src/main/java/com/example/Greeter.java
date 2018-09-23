package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet someone
   * @param someone - the one to greet
   * @return formatted greeting
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
