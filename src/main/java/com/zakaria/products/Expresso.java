package com.zakaria.products;

public class Expresso extends Drink{

    public Expresso() {
        this.description = "Expresso";
    }
    @Override
    public double cost() {
        return 6.5;
    }
}
