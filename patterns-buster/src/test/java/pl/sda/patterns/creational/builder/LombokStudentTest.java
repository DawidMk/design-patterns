package pl.sda.patterns.creational.builder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class LombokStudentTest {

    @Test
    void builder() {
        LombokStudent student = LombokStudent
                .builder()
                .firstName("Janusz")
                .lastName("Tracz")
                .pesel("123")
                .birthYear(Year.of(1999))
                .build();

        Student.Builder build = new Student.Builder();
        Student build1 = build
                .withFirstName("name")
                .build();
    }
}