package pl.sda.patterns.creational.prototype

import pl.sda.model.Calibra
import pl.sda.model.CarType
import pl.sda.model.Civic
import pl.sda.model.Passat
import spock.lang.Specification

import java.time.Year

class CarCacheTest extends Specification {

    def "Should return #car for #type"() {
        given:
            CarCache cache = new CarCache()

        expect:
            car == cache.getCar(type)

        where:
            car                                || type
            new Calibra(2, "pink", Year.now()) || CarType.CALIBRA
            new Civic(2, "pink", Year.now())   || CarType.CIVIC
            new Passat(2, "pink", Year.now())  || CarType.PASSAT

    }

    def "Should return correct size of cache"() {
        given:
            CarCache cache = new CarCache()

        when:
            def size = cache.getSize()
        then:
            size == 3
    }
}
