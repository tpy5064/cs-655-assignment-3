package edu.bu.met.cs665.factory;

public class BusinessEmail implements Email {
    @Override
    public String greeting() {
        return "Dear Valued Business Customer,\n\n";
    }

    @Override
    public String body() {
        return "Thank you for choosing Patterns & Design, we value you very much " +
                "as a business partner, and hope that we can continue our partnership " +
                "in the coming years. \n\nSincerely,\nPatterns & Design";
    }
}
