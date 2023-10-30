/**
 * Name: Tianqi Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/30/2023
 * File Name: ReturningEmail.java
 * Description: The concrete implementation of an email for VIPs. Contains the greeting and body
 * required for an email targeting VIPs.
 */


package edu.bu.met.cs665.factory;

public class VipEmail implements Email {
    @Override
    public String greeting() {
        return "Dear VIP,\n\n";
    }

    @Override
    public String body() {
        return "Our thanks goes to you for your tremendous support for Patterns & Design. " +
                "Our success is owed to each VIP user like you and we would like to " +
                "keep our high-quality services for as long as we are around. " +
                "\n\nSincerely,\nPatterns & Design";
    }
}
