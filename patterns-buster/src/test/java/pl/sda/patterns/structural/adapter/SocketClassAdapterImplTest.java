package pl.sda.patterns.structural.adapter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocketClassAdapterImplTest {

    @Test
    void get120Volt() {
        //given
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();
        //when
        int volt = sut.get120Volt().getVolts();
        //then
        Assert.assertEquals(volt, 120);
    }

    @Test
    void get12Volt() {
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();
        //when
        int volt = sut.get12Volt().getVolts();
        //then
        Assert.assertEquals(volt, 12);
    }

    @Test
    void get3Volt() {
        SocketClassAdapterImpl sut = new SocketClassAdapterImpl();
        //when
        int volt = sut.get3Volt().getVolts();
        //then
        Assert.assertEquals(volt, 3);
    }
}