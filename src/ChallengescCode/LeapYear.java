package ChallengescCode;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the new year calender");
        System.out.print("please enter the year which you want: ");

        int year = input.nextInt();
        if(year % 400==0 || (year % 4==0 && year %100 !=0)){
            System.out.println("This year is leap year.");
        }else {
            System.out.println("This is not leap year");
        }

    }
}
