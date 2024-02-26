package task.io;

public class BankAccount {

    private int withdrawal;

    public BankAccount() {
        this.withdrawal = withdrawal;
    }





    public int withdrawalOfMoney(int wallet, int withdrawal) throws IllegalAccessException {

            int remains = wallet - withdrawal;
            if (withdrawal> wallet) {
                throw new IllegalAccessException("Столько денег нет на карте");
            }

            return remains;
    }

}
// TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.