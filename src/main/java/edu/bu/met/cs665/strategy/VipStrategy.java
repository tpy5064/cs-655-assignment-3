package edu.bu.met.cs665.strategy;

public class VipStrategy implements EmailStrategy{
    public String personalize(String base) {
        return base.replace("{target}", "VIP");
    }
}
