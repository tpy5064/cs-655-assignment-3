/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.factory.EmailGenerator;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    EmailGenerator emailGenerator = new EmailGenerator();
    System.out.println(emailGenerator.generateEmail("Business"));
    System.out.println(emailGenerator.generateEmail("Frequent"));
    System.out.println(emailGenerator.generateEmail("New"));
    System.out.println(emailGenerator.generateEmail("Returning"));
    System.out.println(emailGenerator.generateEmail("VIP"));
  }

}
