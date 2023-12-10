package com.zakaria.Decorator;

import com.zakaria.products.Drink;

public class Noisette extends DrinkDecorator{

    public Noisette(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " & Noisette";
    }

    @Override
    public double cost() {
        return 5 + this.drink.cost();
    }
}
