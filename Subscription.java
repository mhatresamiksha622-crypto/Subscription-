package com.streamora.app;

public class Subscription {

    private String name;
    private double price;
    private String features;

    public Subscription() {
    }

    public Subscription(String name, double price,
                        String features) {
        this.name = name;
        this.price = price;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFeatures() {
        return features;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
