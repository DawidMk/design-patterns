package pl.sda.patterns.creational.factory;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pl.sda.model.Calibra;
import pl.sda.model.Car;
import pl.sda.patterns.creational.factory.factory.CarModel;
import pl.sda.patterns.structural.flyweight.CarType;

import java.time.Year;

public class TheBestCarmakerTest {
    @Test
    @DisplayName("is care same as green, 5-door calibra")
   public void test() {
        //given
        TheBestCarmaker carmaker = new TheBestCarmaker();
        //when
        Car calibra = carmaker.makeCar4(CarModel.CALIBRA, 5, "green", Year.of(2018));
        //then
        Assert.assertThat(calibra, CoreMatchers.is(
                new Calibra(5, "green", Year.of(2018))));
    }
}