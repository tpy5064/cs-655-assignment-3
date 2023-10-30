/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: ReturningEmail.java
 * Description: The concrete implementation of an email for returning customers. Contains the greeting and body
 * required for an email targeting returning customers.
 */


package edu.bu.met.cs665.factory;

public class ReturningEmail implements Email {
    @Override
    public String greeting() {
        return "Dear Returning Customer,\n\n";
    }

    @Override
    public String body() {
        return "As always, thank you for choosing Patterns & Design. We are glad to see " +
                "that you are enjoying our services and we hope to see you in our future " +
                "endeavours. \n\nSincerely,\nPatterns & Design";
    }
}
