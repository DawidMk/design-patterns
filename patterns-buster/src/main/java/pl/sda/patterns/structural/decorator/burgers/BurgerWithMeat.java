package pl.sda.patterns.structural.decorator.burgers;

import lombok.NonNull;

import java.math.BigDecimal;

public class BurgerWithMeat extends Burger {

    public BurgerWithMeat(@NonNull String bread, @NonNull BigDecimal price) {
        super(bread, price);
    }

}
