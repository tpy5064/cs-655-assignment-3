/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: FrequentEmail.java
 * Description: The concrete implementation of a frequent customer email. Contains the greeting and body
 * required for a frequent customer email.
 */


package edu.bu.met.cs665.factory;

public class FrequentEmail implements Email {
    @Override
    public String greeting() {
        return "Dear Frequent Customer,\n\n";
    }

    @Override
    public String body() {
        return "Thank you for choosing Patterns & Design, we aim to keep providing " +
                "high quality services for you in the future.\n\nSincerely,\nPatterns & Design";
    }
}
