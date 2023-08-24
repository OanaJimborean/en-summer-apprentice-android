package com.example.endavaapplication.mydemoapp.model;

public class Order {
    public String orderName;
    public String orderedAt;
    public String numberOfTickets;
    public String totalPrice;
    public int image;

    public Order(String orderName, String orderedAt, String numberOfTickets, String totalPrice, int image) {
        this.orderName = orderName;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.image = image;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderedAt() {
        return orderedAt;
    }

    public String getNumberOfTickets() {
        return numberOfTickets;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public int getImage() {
        return image;
    }
}
