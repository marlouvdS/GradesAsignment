package Kalender;


import java.time.LocalDate;
import java.time.Month;

public class main {
    public static void main(String[] args) {
// print one month
        LocalDate jan = LocalDate.of(2018, Month.JANUARY,1);
        printMonth.printMonth(jan);

// print year of 2018
        printYear.printYear(2018);



    }
}