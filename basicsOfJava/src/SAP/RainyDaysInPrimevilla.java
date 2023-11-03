package SAP;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class RainyDaysInPrimevilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.next();
        String dayOfWeekStr = sc.next();
        int n = sc.nextInt();
        sc.close();

        LocalDate date = LocalDate.parse(dateStr, java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(dayOfWeekStr.toUpperCase());

        int r = findNextRainyDay(date, dayOfWeek, n);
        System.out.println(r > 0 ? "Yes " + r : "No " + n);
    }

    public static int findNextRainyDay(LocalDate date, DayOfWeek dayOfWeek, int n) {
        int days = 0;
        while (days < n) {
            date = date.plusDays(1);
            if (isPrime(date.getDayOfMonth()) && isPrimeMonth(date.getMonthValue())) {
                if (date.getDayOfWeek() == dayOfWeek) {
                    return days + 1;
                }
            }
            days++;
        }
        return 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMonth(int month) {
        return month == 2 || month == 3 || month == 5 || month == 7 || month == 11;
    }
}
