import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earnings = 0;
        int spendings = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать ситему налогооблажения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);


            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String moneyStr2 = scanner.nextLine();
                    int money2 = Integer.parseInt(moneyStr2);
                    spendings += money2;
                    break;
                case 3:
                    int tax1 = incomeMinuseExpenses (earnings, spendings);
                    int tax2 = taxIncome(earnings);
                    if ( tax1 > tax2 ) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + tax2 + " рублей");
                        System.out.println("Налог на другой системе: " + tax1 + " рублей");
                        System.out.println("Экономия: " + (tax1 - tax2) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                        System.out.println("Налог на другой системе: " + tax2 + " рублей");
                        System.out.println("Экономия: " + (tax2 - tax1) + " рублей");
                    }

                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }

    public static int incomeMinuseExpenses (int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxIncome (int earnings) {
        int tax2 = (earnings) * 6 / 100;
        return tax2;
    }


}
