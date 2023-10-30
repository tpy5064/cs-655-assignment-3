/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: Main.java
 * Description: The entry point for the program. Sample outputs are presented here.
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.factory.EmailGenerator;

/**
 * This is the Main class.
 */
public class Main {

  public static void main(String[] args) {
    EmailGenerator emailGenerator = new EmailGenerator();
    String[] emailTypes = {"Business", "Frequent", "New", "Returning", "VIP"};
    for (String type : emailTypes) {
      String output = emailGenerator.generateEmail(type);
      //Ensure correct type is expected and do not print null values.
      if (output != null) {
        System.out.println(output);
      }
    }
  }

}
