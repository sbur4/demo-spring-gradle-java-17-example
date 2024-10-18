package j17.day_period_support;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter timeOfDayFomatter = DateTimeFormatter.ofPattern("B");
        System.out.println(timeOfDayFomatter.format(LocalTime.of(8, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(13, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(20, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(23, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(0, 0)));
    }
}
