package pl.sda.patterns.creational.prototype;

import pl.sda.model.Calibra;
import pl.sda.model.Car;

import java.util.HashMap;
import java.util.Map;

//TODO let's imagine that taking cars from the DB is costly
//TODO we should implement simple cache here to store existing
//TODO cars taken from db in memory and retrieve them almost immediately
//TODO please think how to implement cache that it can be thread safe
public class CarCache {

    private Map<String, Car> carCacheMap = new HashMap<>();

    public void init() {
    }

    public Car getCar(String type) {
        if (carCacheMap.containsKey(type)) {
            return carCacheMap.get(type);
        } else {
           return carCacheMap.put(type, new Calibra());
        }
//        return null;
    }

    public int getSize() {
        return 3; //TODO fixme hardcoded value
    }
}
