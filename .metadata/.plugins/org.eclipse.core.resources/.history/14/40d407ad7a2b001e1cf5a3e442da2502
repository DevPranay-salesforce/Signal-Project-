package javaprogramms1;

import java.util.ArrayList;

public class LeapYearClass {

    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};
        int[] years = { 2000, 2004, 2008, 2010, 2012, 2016, 2020, 2021, 2024, 2030};

        ArrayList<Integer> leapYears = new ArrayList<Integer>();
        ArrayList<Integer> normalYears = new ArrayList<Integer>();
        ArrayList<String> monthsList = new ArrayList<String>();

        for (int item : years) {
            if (isLeapYear(item)) {
                leapYears.add(item);
            } else {
                if (item >= 1 && item <= 12) {
                    monthsList.add(months[item - 1]);
                } else {
                    normalYears.add(item);
                }
            }
        }

        System.out.println("Normal Years: " + normalYears);
        System.out.println("Months: " + monthsList);
        System.out.println("Leap Years: " + leapYears);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
} 
