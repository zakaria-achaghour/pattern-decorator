package com.zakaria.Decorator;

import com.zakaria.products.Drink;

public class Chocolat extends DrinkDecorator{

    public Chocolat(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " & Chocolat";
    }

    @Override
    public double cost() {
        return 6.5 + this.drink.cost();
    }
}
