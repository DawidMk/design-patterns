package pl.sda.patterns.structural.facade;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.fail;

class WashingFacadeTest {

    @Test
    void shouldThrowExceptionIfTempNotSet() {
        //given
        WashingFacade facade = new WashingFacade();
        //when
        try {
            facade.start();
            fail();
        }catch (RuntimeException r){
            r.printStackTrace();
        }
    }

    //todo Dawid: dopisać drugi sposób testu (lambda)

    @Test
    void shouldStartTheLaundryIfAllConditionsAreOk() {
        //given
        WashingFacade facade = new WashingFacade();
        //when
        facade.start();
        //then

        //TODO
    }

    @Test
    void shouldThrowExceptionIfDryingRackIsFull() {
        //given
        //when
        //then
    }
}