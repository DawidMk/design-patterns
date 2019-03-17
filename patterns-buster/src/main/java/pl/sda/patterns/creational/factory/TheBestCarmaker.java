package pl.sda.patterns.creational.factory;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;
import org.checkerframework.checker.units.qual.C;
import pl.sda.model.Calibra;
import pl.sda.model.Car;
import pl.sda.model.Civic;
import pl.sda.model.Passat;
import pl.sda.patterns.creational.factory.factory.CarModel;

import java.time.Year;
import java.util.Map;

import static pl.sda.patterns.creational.factory.factory.CarModel.*;

//TODO 1. Refactor to use factory here
//TODO 2. Use polymorphism
//TODO 3. Try to implement 3 versions of factory:
//TODO 3.1 With simple ifs
//TODO 3.2 With enum
//TODO 3.3 With map instead of ifs
//TODO 4. For all implementations please add junit tests.
public class TheBestCarmaker {

    Map<CarModel, Car> carMap = ImmutableMap.of(
            CALIBRA, new Calibra(),
            PASSAT, new Passat(),
            CIVIC, new Civic());

  /*  public Calibra makeCalibra(int door, String color, Year productionYear) {
        return new Calibra(door, color, productionYear);
    }

    public Civic makeCivic(int door, String color, Year productionYear) {
        return new Civic(door, color, productionYear);
    }

    public Passat makePassat(int door, String color, Year productionYear) {
        return new Passat(door, color, productionYear);
    }*/

    public Car makeCar(int door, String color, Year productionYear, String model) {
        if (model.equals(Civic.class.getSimpleName())) {
            return new Civic(door, color, productionYear);
        } else if (model.equals(Calibra.class.getSimpleName())) {
            return new Calibra(door, color, productionYear);
        } else if (model.equals(Passat.class.getSimpleName())) {
            return new Passat(door, color, productionYear);
        } else {
            throw new RuntimeException("fail");
        }
    }

    public Car makeCarMap(CarModel carModel) {
        return carMap.get(carModel);
    }

    //todo
    public Car makeCar4(CarModel carModel, int door, String color, Year productionYear) {
        Car emptyCar = makeCarMap(carModel);
        emptyCar.setColor(color);
        emptyCar.setDoor(door);
        emptyCar.setProductionYear(productionYear);
        return emptyCar;
    }
}
