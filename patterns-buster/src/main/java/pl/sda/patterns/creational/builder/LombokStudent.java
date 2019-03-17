package pl.sda.patterns.creational.builder;

import com.sun.istack.internal.NotNull;
import lombok.Builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

@Builder
public class LombokStudent {
    //Required Parameters
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String pesel;
    @NotNull
    private Year birthYear;

    //Optional Parameters
    private Month birthMonth;
    private DayOfWeek birthDayOfWeek;
    private Boolean scholarship;
}
