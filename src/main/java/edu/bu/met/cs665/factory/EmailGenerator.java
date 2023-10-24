package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.factory.Email;

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
