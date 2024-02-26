package task.test;

public class Main {
    public static void main(String[] args) {
        // задача 1
        try {
            BankAccount bankAccount = new BankAccount(122);
            System.out.println(bankAccount.withdrawalOfMoney(90));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
