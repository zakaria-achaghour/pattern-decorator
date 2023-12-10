package com.zakaria;

import com.zakaria.Decorator.Chocolat;
import com.zakaria.Decorator.Milk;
import com.zakaria.Decorator.Noisette;
import com.zakaria.products.Drink;
import com.zakaria.products.Sumatra;


public class Main {
    public static void main(String[] args) {
         Drink drink ;
         drink = new Sumatra();
         System.out.println(drink.cost());
         System.out.println(drink.getDescription());
        System.out.println("---------------- ------------------- ------------");
        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());
        System.out.println("---------------- ------------------- ------------");

        drink = new Chocolat(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());
        System.out.println("---------------- ------------------- ------------");

        System.out.println("*************");

        Drink d = new Milk(new Chocolat(new Noisette(new Chocolat(new Sumatra()))));
        System.out.println(d.getDescription());
        System.out.println(d.cost());

    }
}