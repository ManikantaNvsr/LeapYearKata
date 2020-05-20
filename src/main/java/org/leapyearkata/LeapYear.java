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

    public boolean isItDivisibleByHundred(int i) {
        return false;
    }
}
