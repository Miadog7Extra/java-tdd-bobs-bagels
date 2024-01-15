package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    Integer capacity = 5;
    public Basket(){
        this.basket = new ArrayList<>(capacity);
    }

    public boolean addBagel(String bagel) {
        if (this.basket.contains(bagel)){
            return false;
        }
        return this.basket.add(bagel);
    }

    public String removeBagel(String bagel) {
        if (this.basket.contains(bagel)){
            this.basket.remove(bagel);
            return "Bagel removed";
        }
        return "Bagel not in basket";
    }

    public String checkBasketSize(){
        if (this.basket.size() <= this.capacity){
        return "Basket is not full";}
        return "Basket is full";
    }

}
