package org.leapyearkata;

import static java.lang.Integer.parseInt;

public class LeapYear {

    // These are the import criteria which help us to decide whether a input year is leap year or not
    static boolean divisibilityCheckByFourHundred = false;
    static boolean divisibilityCheckByHundred = false;
    static boolean divisibilityCheckByFour = false;

    public static void main(String[] args) {

        if (args != null && args.length > 0) {
            // We receive input year/years from the Program Arguments delimited by space
            for (String yearAsString : args) {
                int year = parseInt(yearAsString);
                if (year <= 0) {
                    System.out.println(year + " is not a proper year value to check the Leap Year Property.");
                    continue; // skipping this year from processing the Leap Year checks since it is not proper year value.
                }
                boolean leapYearFlag = isItLeapYear(year);
                if (leapYearFlag) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            }
        } else {
            System.out.println("Please provide a input year/years as program arguments to check the Leap Year Property.");
        }
    }

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
        return checkLeapYearCriteria();
    }

    private static boolean checkLeapYearCriteria() {
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
