package com.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrossCalculatorTest {

    GrossCalculator grossCalculator;

    @BeforeEach
    void setUp() {

        System.out.println("I'm running!");
        grossCalculator = new GrossCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void classProperlyInitializedTest() {

        assertNotNull(grossCalculator);
    }

    @Test
    void calculateGrossPayFor40StraightHoursText() {

        int hoursWorked = 40;

        double hourlyRate = 10.00;

        double grossPay = hoursWorked * hourlyRate;

        assertEquals(400.00, grossPay);
    }

    @Test
    void whenCalculateGrossFunctionIsCalled_ReturnGrossAmount() {

        int hoursWorked = 40;

        double hourlyRate = 20.00;

        assertEquals(800.00, grossCalculator.calculateGrossPay(hoursWorked, hourlyRate));
    }

    @Test
    void whenCalculateGrossPayIsCalled_ReturnGrossAmountForHoursInExcess() {

        int hoursWorked = 43;

        double hourlyRate = 20.00;

        double excessHours = hoursWorked - 40;

        double grossAmountForExcessHours = ((excessHours * hourlyRate) + ((excessHours / 2) * hourlyRate));

        assertEquals(90.00, grossAmountForExcessHours);

        double totalGrossAmount = ((hoursWorked - excessHours) * hourlyRate) + grossAmountForExcessHours;

        assertEquals(890, totalGrossAmount);

        assertEquals(890, grossCalculator.calculateGrossPay(hoursWorked, hourlyRate));
    }
}
