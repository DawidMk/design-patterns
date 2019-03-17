package pl.sda.patterns.creational.factory.abstractfactory;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

class FactoryProviderTest {

    @Test
    @DisplayName("Check if factory is instance of created factory")
    void saveData() {
        //given
        FactoryProvider factoryProvider = new FactoryProvider();

        //when
        AbstractFactory factory = factoryProvider.getFactory(DataType.PDF);

        //then
        assertThat(factory, instanceOf(PdfFactory.class));
        Assert.assertTrue(factory instanceof PdfFactory);

        //when
        Object input = factory.save("jakiskontent", "plik.pdf");

        //then
        Assert.assertTrue(input instanceof PdfHolder);
    }
}