package pl.sda.patterns.creational.prototype;

import pl.sda.model.Calibra;
import pl.sda.model.Car;
import pl.sda.model.CarType;
import pl.sda.model.Civic;
import pl.sda.model.Passat;

import java.util.HashMap;
import java.util.Map;

import static java.time.Year.now;
import static pl.sda.model.CarType.*;

//TODO let's imagine that taking cars from the DB is costly
//TODO we should implement simple defaultCarCache here to store existing
//TODO cars taken from db in memory and retrieve them almost immediately
//TODO please think how to implement defaultCarCache that it can be thread safe
public class CarCache {

    //In real life defaultCarCache contains the whole object as a key
    //to check if the whole object exixst.
    //We could even save data here as a multimap
    //Under one key we could store another collection of data
    private Map<CarType, Car> defaultCarCache = new HashMap<>();

    //DEFAULT implementation
    public CarCache() {
        this.defaultCarCache.put(CALIBRA, new Calibra(2, "pink", now()));
        this.defaultCarCache.put(CIVIC, new Civic(2, "pink", now()));
        this.defaultCarCache.put(PASSAT, new Passat(2, "pink", now()));
    }

    //TODO change to use elvis operator here
    public Car getClonedCar(CarType carType) {
        if (defaultCarCache.containsKey(carType)) {
            return (Car) defaultCarCache.get(carType).clone();
        } else {
            return null;
        }
    }

    public Car getCar(CarType type) {
        return defaultCarCache.getOrDefault(type, null);
    }

    //TODO add car to the cache
    //TODO if exists in the cache take it from there
    //TODO if not just swap the data
    public <T extends Car> T addToCache(T car) {

        return null;

    }

    public int getSize() {
        return 3; //TODO fixme hardcoded value
    }
}
