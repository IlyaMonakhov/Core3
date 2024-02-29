package task.io;

import java.util.Scanner;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void makePurchase() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Текущий баланс: " + balance);
            System.out.print("Введите сумму для вывода: ");
            int withdrawalAmount = scanner.nextInt();

            try {
                if (withdrawalAmount > balance) {
                    throw new IllegalAccessException("Недостаточно средств на карте");
                }
                balance -= withdrawalAmount;
                System.out.println("Покупка прошла успешно. Остаток: " + balance);
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Вы хотите совершить еще одну покупку? (да/нет): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("да")) {
                break;
            }
        }
    }
}
// TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.