package Kalender;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class printMonth {
    static void printMonth(LocalDate month){
        System.out.println(month.getMonth() + " " + month.getYear());
        System.out.println("S   M   T   W   T   F   S");
        DayOfWeek dayOfWeek = month.getDayOfWeek();
        int lengteMaand = month.getMonth().length(false);

// determine on what index/day to start the month in the calender
        int index=0;
        switch (dayOfWeek) {
            case MONDAY:
                index=1;
                break;
            case TUESDAY:
                index = 2;
                break;
            case WEDNESDAY:
                index = 3;
                break;
            case THURSDAY:
                index = 4;
                break;
            case FRIDAY:
                index = 5;
                break;
            case SATURDAY:
                index = 6;
                break;
            case SUNDAY:
                index = 0;
                break;
        }

        // add days of month to calender
        int[][] monthKalender = new int[6][7];
        int dag = 1;
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                if (dag==1){y=index;}
                if (dag <= lengteMaand) {
                    monthKalender[x][y] = dag++;
                }
            }
        }

        // method to print
        for (int[] row :monthKalender) {
            printRow(row);
        }
        System.out.println();
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
}
