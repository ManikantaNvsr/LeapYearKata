package org.leapyearkata;

public class LeapYear {

    // These are the import criteria which help us to decide whether a input year is leap year or not
    static boolean divisibilityCheckByFourHundred = false;
    static boolean divisibilityCheckByHundred = false;
    static boolean divisibilityCheckByFour = false;

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

    // Finding whether the input matches with the Leap Year Criteria or not
    public static boolean isItLeapYear(int year) {
        divisibilityCheckByFour = isItDivisibleByFour(year);
        divisibilityCheckByFourHundred = isItDivisibleByFourHundred(year);
        divisibilityCheckByHundred = isItDivisibleByHundred(year);
        // If the given year is divisible by 400 then it's surely a Leap Year
        if (divisibilityCheckByFourHundred) {
            return true;
            // If the given year is divisible by 4 and not divisible by 100 then it's a Leap Year
        } else if (divisibilityCheckByFour && !divisibilityCheckByHundred) {
            return true;
            // Apart from the any other case than the mentioned comments above, it's not a Leap Year
        } else {
            return false;
        }
    }
}
