package pl.sda.patterns.creational.builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

//TODO implement builder instead of using constructor here
public class Student {
    //Required Parameters
    private String firstName;
    private String lastName;
    private String pesel;
    private Year birthYear;

    //Optional Parameters
    private Month birthMonth;
    private DayOfWeek birthDayOfWeek;
    private Boolean scholarship;

    //TODO remove
    public Student(String firstName) {
    }

    public Student(String firstName,
                   String lastName,
                   String pesel,
                   Year birthYear,
                   Month birthMonth,
                   DayOfWeek birthDayOfWeek,
                   Boolean scholarship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDayOfWeek = birthDayOfWeek;
        this.scholarship = scholarship;
    }

    public static class Builder {
        private String firstName;

        public Builder withFirstName(String name) {
            this.firstName = name;
            return this;
        }

        public Student build() {
            return new Student(firstName);
        }
    }
}
