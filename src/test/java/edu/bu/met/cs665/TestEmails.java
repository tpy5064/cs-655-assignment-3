/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: TestEmails.java
 * Description: Test class that tests the functionality of the program.
 */


package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNull;

import edu.bu.met.cs665.factory.EmailGenerator;
import org.junit.Test;

public class TestEmails {

    public TestEmails() {
    }

    //These first 5 tests essentially tests if the values produced are as expected.
    @Test
    public void testBusinessEmailOutput() {
        EmailGenerator emailGenerator = new EmailGenerator();
        String desiredOutput = "Dear Valued Business Customer,\n\n" + "Thank you for choosing Patterns & Design, " +
                "we value you very much " +
                "as a business partner, and hope that we can continue our partnership " +
                "in the coming years. \n\nSincerely,\nPatterns & Design";
        assertEquals(desiredOutput, emailGenerator.generateEmail("Business"));
    }

    @Test
    public void testFrequentEmailOutput() {
        EmailGenerator emailGenerator = new EmailGenerator();
        String desiredOutput = "Dear Frequent Customer,\n\n" + "Thank you for choosing Patterns & Design, " +
                "we aim to keep providing " +
                "high quality services for you in the future.\n\nSincerely,\nPatterns & Design";
        assertEquals(desiredOutput, emailGenerator.generateEmail("Frequent"));
    }

    @Test
    public void testNewEmailOutput() {
        EmailGenerator emailGenerator = new EmailGenerator();
        String desiredOuptut = "Dear Customer,\n\n" + "Thank you for choosing Patterns & Design, we are a business " +
                "oriented around providing educational insights regarding programming " +
                "design patterns. We hope that we will be able to aid you in your " +
                "journey to understanding the topic better! \n\nSincerely,\nPatterns & Design";
        assertEquals(desiredOuptut, emailGenerator.generateEmail("New"));
    }

    @Test
    public void testReturningEmailOutput() {
        EmailGenerator emailGenerator = new EmailGenerator();
        String desiredOuptut = "Dear Returning Customer,\n\n" + "As always, thank you for choosing " +
                "Patterns & Design. We are glad to see " +
                "that you are enjoying our services and we hope to see you in our future " +
                "endeavours. \n\nSincerely,\nPatterns & Design";
        assertEquals(desiredOuptut, emailGenerator.generateEmail("Returning"));
    }

    @Test
    public void testVipEmailOutput() {
        EmailGenerator emailGenerator = new EmailGenerator();
        String desiredOuptut = "Dear VIP,\n\n" + "Our thanks goes to you for your tremendous " +
                "support for Patterns & Design. " +
                "Our success is owed to each VIP user like you and we would like to " +
                "keep our high-quality services for as long as we are around. " +
                "\n\nSincerely,\nPatterns & Design";
        assertEquals(desiredOuptut, emailGenerator.generateEmail("VIP"));
    }

    //This tests if a null output is correctly created by the EmailGenerator class if an invalid type is inputted.
    @Test
    public void testInvalidEmailType() {
        EmailGenerator emailGenerator = new EmailGenerator();
        assertNull(emailGenerator.generateEmail("Invalid"));
    }
}
