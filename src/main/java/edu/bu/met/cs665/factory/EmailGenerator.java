/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: EmailGenerator.java
 * Description: The factory that generates the email by determining the type passed in via the generateEmail method.
 */


package edu.bu.met.cs665.factory;


public class EmailGenerator{

    public String generateEmail(String type) {
        switch (type) {
            case "Business":
                BusinessEmail businessEmail = new BusinessEmail();
                return businessEmail.greeting() + businessEmail.body();
            case "Frequent":
                FrequentEmail frequentEmail = new FrequentEmail();
                return frequentEmail.greeting() + frequentEmail.body();
            case "New":
                NewEmail newEmail = new NewEmail();
                return newEmail.greeting() + newEmail.body();
            case "Returning":
                ReturningEmail returningEmail = new ReturningEmail();
                return returningEmail.greeting() + returningEmail.body();
            case "VIP":
                VipEmail vipEmail = new VipEmail();
                return vipEmail.greeting() + vipEmail.body();
            default:
                return null;
        }
    }

}
