package pl.sda.patterns.creational.factory;

import com.google.common.collect.ImmutableMap;
import pl.sda.model.Calibra;
import pl.sda.model.Car;
import pl.sda.model.CarType;
import pl.sda.model.Civic;
import pl.sda.model.Passat;

import java.time.Year;
import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;
import static pl.sda.model.CarType.*;

//TODO 1. Refactor to use factory here
//TODO 2. Use polymorphism
//TODO 3. Try to implement 3 versions of factory:
//TODO 3.1 With simple ifs
//TODO 3.2 With enum
//TODO 3.3 With map instead of ifs
//TODO 4. For all implementations please add junit tests.
public class TheBestCarmaker {

    Map<CarType, Car> carMap = of(
            CALIBRA, new Calibra(),
            PASSAT, new Passat(),
            CIVIC, new Civic()
    );

    //TODO refleksja
    Map<CarType, Object> carMap2 = ImmutableMap.of(
            CALIBRA, Calibra.class,
            PASSAT, Passat.class,
            CIVIC, Civic.class
    );

    public Calibra makeCalibra(int door, String color, Year productionYear) {
        return new Calibra(door, color, productionYear);
    }

    public Civic makeCivic(int door, String color, Year productionYear) {
        return new Civic(door, color, productionYear);
    }

    public Passat makePassat(int door, String color, Year productionYear) {
        return new Passat(door, color, productionYear);
    }

    public Car makeCar(String car, int door, String color, Year productionYear) {
        if (car.equals(Calibra.class.getSimpleName())) {
            return new Calibra(door, color, productionYear);
        } else if (car.equals(Passat.class.getSimpleName())) {
            return new Passat(door, color, productionYear);
        } else if (car.equals(Civic.class.getSimpleName())) {
            return new Civic(door, color, productionYear);
        } else {
            throw new RuntimeException("Nieprawidłowy model");
        }
    }

    public Car makeCar2(CarType car, int door, String color, Year productionYear) {
        if (CALIBRA == car) {
            return new Calibra(door, color, productionYear);
        } else if (PASSAT == car) {
            return new Passat(door, color, productionYear);
        } else if (CIVIC == car) {
            return new Civic(door, color, productionYear);
        } else {
            throw new RuntimeException("Nieprawidłowy model");
        }
    }

    public Car makeCar3(CarType carType) {
        return carMap.get(carType);
    }

    public Car makeCar4(CarType car, int door, String color, Year productionYear) {
        Car emptyCar = makeCar3(car);
        emptyCar.setColor(color);
        emptyCar.setDoor(door);
        emptyCar.setProductionYear(productionYear);
        return emptyCar;
    }

}
