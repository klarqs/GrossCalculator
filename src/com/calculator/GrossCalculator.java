package com.calculator;

public class GrossCalculator {


    private int straightHours = 40;

    public double calculateGrossPay(int hoursWorked, double hourlyRate) {

        double grossPay = 0.0;

        if (hoursWorked == straightHours) {

            grossPay = hoursWorked * hourlyRate;

        } else if (hoursWorked > straightHours) {

            double excessHours = hoursWorked - straightHours;

            double grossAmountForExcessHours = ((excessHours * hourlyRate) + ((excessHours / 2) * hourlyRate));

            grossPay = ((hoursWorked - excessHours) * hourlyRate) + grossAmountForExcessHours;
        }

        return grossPay;
    }
}
