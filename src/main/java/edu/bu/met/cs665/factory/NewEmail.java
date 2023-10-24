package edu.bu.met.cs665.factory;

public class NewEmail implements Email {
    @Override
    public String greeting() {
        return "Dear Customer,\n\n";
    }

    @Override
    public String body() {
        return "Thank you for choosing Patterns & Design, we are a business " +
                "oriented around providing educational insights regarding programming " +
                "design patterns. We hope that we will be able to aid you in your " +
                "journey to understanding the topic better! \n\nSincerely,\nPatterns & Design";
    }
}
