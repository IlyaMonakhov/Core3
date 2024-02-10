package task.io;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        // TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
        //  счета. Обработайте исключение, если на счете недостаточно средств.
        int wallet = 10000;
        Scanner console = new Scanner(System.in);
        int withdrawal = console.nextInt();
        withdrawalOfMoney(wallet,withdrawal);


    }
    public static int withdrawalOfMoney(int wallet, int withdrawal){
        try {
            int remains = wallet - withdrawal;
            if (withdrawal<wallet){
                System.out.println("Остаток" + remains);
            }
        } catch (Exception e) {
           throw new RuntimeException(e);
        }return -1;
    }

}
