package org.leapyearkata;

public class LeapYear {

    // Finding whether the input year is divisible by 400 or not
    public static boolean isItDivisibleByFourHundred(int year) {
        if (year > 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Finding whether the input year is divisible by 100 or not
    public static boolean isItDivisibleByHundred(int year) {
        if (year > 0 && year % 100 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Finding whether the input year is divisible by 4 or not
    public static boolean isItDivisibleByFour(int year) {
        if (year > 0 && year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isItLeapYear(int i) {
        return false;
    }
}
