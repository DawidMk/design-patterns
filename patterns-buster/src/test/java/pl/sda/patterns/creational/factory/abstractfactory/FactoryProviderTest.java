package pl.sda.patterns.creational.factory.abstractfactory;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryProviderTest {

    @Test
    void getFactoryTest(){
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory abstractFactory =factoryProvider.getFactory(DataType.PDF, "aaa", "bbb");
        Assert.assertThat(factoryProvider, CoreMatchers.instanceOf(PdfFactory.class));
        Assert.assertTrue(abstractFactory instanceof PdfFactory);

        Object input = abstractFactory.save("content", "aaa.pdf");

        Assert.assertTrue(input instanceof PdfFactory);
    }
}