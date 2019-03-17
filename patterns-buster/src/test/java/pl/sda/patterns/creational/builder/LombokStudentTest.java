package pl.sda.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.Year;

class LombokStudentTest {

    @Test
    void builder() {
        LombokStudent build = LombokStudent
                .builder()
                .firstName("")
                .lastName("")
                .pesel("")
                .birthYear(Year.now())
                .build();

        Student.Builder builder = new Student.Builder();
        Student build1 = builder
                .withFirstName("name")
                .build();
    }
}