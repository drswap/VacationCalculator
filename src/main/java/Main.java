import ru.netology.services.VacationCalculator.months.CalculationOfTheNumberOfMonths;

public class Main {
    public static void main(String[] args) {
        CalculationOfTheNumberOfMonths service = new CalculationOfTheNumberOfMonths();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int vacationMonths = service.calculate(income, expenses, threshold );
        System.out.println("Количество месяцев отдыха: " + vacationMonths);

    }
}
