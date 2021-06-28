package com.riskified.serviceTest.models;

public class EnrichedOrder {

    String EOrderID;
    String email;
    double totalPrice;

    public String getEOrderID() {
        return EOrderID;
    }

    public void setEOrderID(String EOrderID) {
        this.EOrderID = EOrderID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Object getField(String fieldName){
        switch (fieldName){
            case ("EOrderID"): return EOrderID;
            case("email"): return email;
            case("totalPrice") :return totalPrice;

            default: return null;
        }
    }
}
