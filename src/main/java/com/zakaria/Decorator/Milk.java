package com.zakaria.Decorator;

import com.zakaria.products.Drink;

public class Milk extends DrinkDecorator{

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " & Milk";
    }

    @Override
    public double cost() {
        return 2 + this.drink.cost();
    }
}
