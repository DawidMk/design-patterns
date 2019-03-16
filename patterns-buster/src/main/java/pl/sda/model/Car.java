package pl.sda.model;

import com.google.common.base.Objects;

import java.time.Year;

public abstract class Car implements Driveable, Cloneable {

    private int door;
    private String color;
    private Year productionYear;

    protected Car() {
    }

    public Car(int door, String color, Year productionYear) {
        this.door = door;
        this.color = color;
        this.productionYear = productionYear;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    public Year getProductionYear() {
        return productionYear;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(Year productionYear) {
        this.productionYear = productionYear;
    }

    //TODO note that using .clone is not the best way to copy objects in Java
    //TODO we should think about just copying all existing values to the new object
    //TODO and use simply new keyword.
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return door == car.door &&
                Objects.equal(color, car.color) &&
                Objects.equal(productionYear, car.productionYear);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(door, color, productionYear);
    }
}
