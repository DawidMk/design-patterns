package pl.sda.patterns.structural.bridge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pl.sda.patterns.structural.bridge.color.BlueColor;
import pl.sda.patterns.structural.bridge.color.Color;
import pl.sda.patterns.structural.bridge.color.ColorType;

class ShapeTest {

    @Test
    void shouldCorrectlyFillTheColor() {
        new Diamond(new BlueColor()).applyColor();
    }

    @Test
    void shouldCorrectlyFillTheColor2() {
        Diamond diamond = new Diamond(new BlueColor());
        Color color = diamond.getColor();
        Assert.assertEquals(ColorType.BLUE, color.getMyColor());

    }

}