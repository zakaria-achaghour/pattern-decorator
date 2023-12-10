package com.zakaria.Decorator;

import com.zakaria.products.Drink;

public abstract class DrinkDecorator extends Drink {

    protected Drink drink;
    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
