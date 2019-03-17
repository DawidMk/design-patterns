package pl.sda.patterns.creational.factory.abstractfactory;

import org.junit.jupiter.api.Test;

class JsonFactoryTest {

    @Test
    void save() {
        JsonFactory jsonFactory = new JsonFactory();
        jsonFactory.save("{}", null);
    }
}