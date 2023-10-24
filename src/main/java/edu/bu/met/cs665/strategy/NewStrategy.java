package edu.bu.met.cs665.strategy;

public class NewStrategy implements EmailStrategy{
    public String personalize(String base) {
        return base.replace("{target}", "New");
    }
}
