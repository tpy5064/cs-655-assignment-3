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
