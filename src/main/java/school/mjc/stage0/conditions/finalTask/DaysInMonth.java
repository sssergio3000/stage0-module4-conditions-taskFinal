package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month < 1 ||month > 12){
            System.out.println("invalid date");
        }
        if (month == 2) {
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(29);
            } else System.out.println(28);
            return;
        }
        switch (month) {
            case 1 -> System.out.println(31);
            case 3 -> System.out.println(31);
            case 5 -> System.out.println(31);
            case 7 -> System.out.println(31);
            case 8 -> System.out.println(31);
            case 10 -> System.out.println(31);
            case 12 -> System.out.println(31);
            case 4 -> System.out.println(30);
            case 6 -> System.out.println(30);
            case 9 -> System.out.println(30);
            case 11 -> System.out.println(30);
        }


    }
}
