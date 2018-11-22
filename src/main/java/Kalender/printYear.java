package Kalender;

import java.time.LocalDate;
import java.time.Month;

public class printYear {
    static void printYear(int year) {
        for (int i=0;i<12;i++) {
            LocalDate month = (LocalDate) LocalDate.of(year, Month.of(i+1), 1);
            printMonth.printMonth(month);
        }

    }
}
