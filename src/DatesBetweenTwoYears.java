
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vov
 */
public class DatesBetweenTwoYears {

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        if (fromYear == toYear) {
            System.out.println("Please, choose different years.");
        } else if (fromYear > toYear) {
            int temp = fromYear;
            fromYear = toYear;
            toYear = temp;
        }

        String s = fromYear + "-01-01";
        String e = toYear - 1 + "-12-31";
        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<LocalDate> totalDates = new ArrayList<>();
        while (!start.isAfter(end)) {
            System.out.println(start);
            totalDates.add(start);
            start = start.plusDays(1);
        }
    }

    public static void main(String[] args) {

        printBonusDatesBetween(2012, 2010);

    }
}
