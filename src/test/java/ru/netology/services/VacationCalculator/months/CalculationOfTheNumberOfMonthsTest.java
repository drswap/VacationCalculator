package ru.netology.services.VacationCalculator.months;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import ru.netology.services.VacationCalculator.months.CalculationOfTheNumberOfMonths;
public class CalculationOfTheNumberOfMonthsTest {
    @ParameterizedTest
    @CsvSource({
            "2,100000,60000,150000",

    })
    public void calculate(int expected, int income, int expenses, int threshould) {
        CalculationOfTheNumberOfMonths service = new CalculationOfTheNumberOfMonths();
        //int income = 100_000;
        // int expenses = 60_000;
        //int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshould);
        //System.out.println("Количество месяцев отдыха: " + vacationMonths);

        assertEquals(expected, actual);
    }
    //@Test
    //public void falseVacationMonths () {
    //  CalculationOfTheNumberOfMonths service = new CalculationOfTheNumberOfMonths();
    //int income = 100_000;
    //int expenses = 90_000;
    //int threshold = 20_000;
    //int vacationMonths = service.calculate(100_000, 60_000, 50_000 );
    //System.out.println("Количество месяцев отдыха: " + vacationMonths);

    // Assertions.assertEquals(vacationMonths,threshold);
}

