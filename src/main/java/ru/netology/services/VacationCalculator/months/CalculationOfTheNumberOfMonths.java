package ru.netology.services.VacationCalculator.months;

public class CalculationOfTheNumberOfMonths {
    public int calculate(int income, int expenses, int threshold) {
        int currentMoney = 0;
        int vacationMonths = 0;
        int remainingMoney = 0;

        for (int i = 1; i <= 12; i++) {
            if (currentMoney >= threshold) {
                vacationMonths++;
                remainingMoney = currentMoney - expenses;
                currentMoney = remainingMoney;
            } else {
                remainingMoney = currentMoney + income - expenses;
                currentMoney = remainingMoney;
            }
        }

        return vacationMonths;
    }
}
