package task19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task19 {
    public static void main(String[] args) {
        int startingYear = 1901;
        int endYear = 2000;
        int counter = 0;
        for(int i = startingYear; i <= endYear; i++) {
            for(int j = 1; j <= 12; j++) {
                if (LocalDate.of(i, j, 1).getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
