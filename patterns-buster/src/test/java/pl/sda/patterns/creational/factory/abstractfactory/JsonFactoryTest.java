package pl.sda.patterns.creational.factory.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonFactoryTest {

    @Test
    void save() {
        JsonFactory jsonFactory = new JsonFactory();
        jsonFactory.save("{}",null);
    }
}