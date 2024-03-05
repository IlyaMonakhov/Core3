package task.test;

public class BankAccount {
    private int wallet;

    public BankAccount(int wallet) {
        this.wallet = wallet;
    }

    public int withdrawalOfMoney(int withdrawal){
        int remains = wallet - withdrawal;
        if (remains < 0) {
            throw new IllegalArgumentException("Столько денег на карте нет");
        }

        wallet = remains;
        return remains;
    }
}
