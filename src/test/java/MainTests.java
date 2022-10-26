import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTests {

    @BeforeAll
    public static void startAllTests(){
        System.out.println("Стартовали тесты");
    }

    @AfterAll
    public static void endAllTests(){
        System.out.println("Тесты закончены");
    }

    @BeforeEach
    public void startTest(){
        System.out.println("Тест запущен");
    }

    @AfterEach
    public void endTest(){
        System.out.println("Тест окончен");
    }

    @Test
    public void incomeMinuseExpensesTest(){
        int earnings = 200, spendings = 100, expected = 15;
        int result = Main.incomeMinuseExpenses(earnings,spendings);
        assertEquals(expected, result);

    }

    @Test
    public void incomeMinuseExpensesWithNegativeNumberTest(){
        int earnings = -200, spendings = 100, expected = 0;
        int result = Main.incomeMinuseExpenses(earnings,spendings);
        assertEquals(expected, result);

    }

    @Test
    public void taxIncomeTest (){
        int earnings = 100, expected = 6;
        int result = Main.taxIncome(earnings);
        assertEquals(expected,result);
    }
}
