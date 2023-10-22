package ru.netology.services.VacationCalculator.months;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationCalculator.months.CalculationOfTheNumberOfMonths;
public class CalculationOfTheNumberOfMonthsTest {
    @Test
            public void trueVacationMonths (){
    CalculationOfTheNumberOfMonths service = new CalculationOfTheNumberOfMonths();
    int income = 100_000;
    int expenses = 60_000;
    int threshold = 150_000;
    int vacationMonths = service.calculate(100_000, 60_000, 150_000 );
        //System.out.println("Количество месяцев отдыха: " + vacationMonths);

        Assertions.assertEquals(vacationMonths,threshold);
    }
    @Test
    public void falseVacationMonths () {
        CalculationOfTheNumberOfMonths service = new CalculationOfTheNumberOfMonths();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 50_000;
        int vacationMonths = service.calculate(100_000, 60_000, 50_000 );
        //System.out.println("Количество месяцев отдыха: " + vacationMonths);

        Assertions.assertEquals(vacationMonths,threshold);
    }
}
