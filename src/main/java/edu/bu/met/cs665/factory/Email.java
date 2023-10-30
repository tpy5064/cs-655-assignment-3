/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: Email.java
 * Description: The interface that is to be implemented by the different types of Emails. Contains 2 methods
 * that returns the greeting and body of the email.
 */


package edu.bu.met.cs665.factory;

interface Email {
    public String greeting();
    public String body();

}
