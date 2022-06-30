package secondMethod;

import java.util.Scanner;
public class Array {
    public static String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String arg[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please, enter the month number:");
        int month = num.nextInt();
        String name = monthName(month);
        System.out.println("Month name is " + name);
    }

    public static String monthName(int month) {
        if (month >= 1 && month <= 12)
            return Array.months[month - 1];
        else
            return ("invalid!\nPlease enter a number from 1 to 12");
    }
}
