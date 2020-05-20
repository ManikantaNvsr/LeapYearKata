package org.leapyearkata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTests {

    // test case for checking whether the given input year is divisible by 400
    @Test
    public void checkDivisibilityByFourHundred() {
        LeapYear leapYear = new LeapYear();
        boolean flag = leapYear.isItDivisibleByFourHundred(1200);
        assertTrue(flag);
    }
}
