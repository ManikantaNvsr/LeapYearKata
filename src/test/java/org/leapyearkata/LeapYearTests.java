package org.leapyearkata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTests {

    // test case for checking whether the given input year is divisible by 400
    @Test
    public void checkDivisibilityByFourHundred() {
        LeapYear leapYear = new LeapYear();
        boolean flag = leapYear.isItDivisibleByFourHundred(1600);
        assertTrue(flag);
    }

    // test case for checking whether the given input year is divisible by 100
    @Test
    public void checkDivisibilityByHundred() {
        LeapYear leapYear = new LeapYear();
        boolean flag = leapYear.isItDivisibleByHundred(1600);
        assertTrue(flag);
    }

    // test case for checking whether the given input year is divisible by 4
    @Test
    public void checkDivisibilityByFour() {
        LeapYear leapYear = new LeapYear();
        boolean flag = leapYear.isItDivisibleByFour(1600);
        assertTrue(flag);
    }

    // test case for checking whether the given input year is Leap Year or not
    @Test
    public void checkLeapYearCriteria() {
        LeapYear leapYear = new LeapYear();
        boolean flag = leapYear.isItLeapYear(1600);
        assertTrue(flag);
    }
}
