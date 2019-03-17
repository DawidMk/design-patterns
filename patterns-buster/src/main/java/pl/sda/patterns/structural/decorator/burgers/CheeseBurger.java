package pl.sda.patterns.structural.decorator.burgers;

import lombok.NonNull;

import java.math.BigDecimal;

public class CheeseBurger extends BurgerWithMeat {


    public CheeseBurger(@NonNull String bread, @NonNull BigDecimal price) {
        super(bread, price);
    }

    public CheeseBurger(BurgerWithMeat burgerWithMeat, BigDecimal price){
        super(burgerWithMeat.getBread(), price);
    }

    public void addIngredient(){
        BigDecimal newPrice = this.getPrice().add(BigDecimal.valueOf(5));
        this.setPrice(newPrice);
    }
}
