package lr2;

public class Task7 {

    interface BankAccountOperations {
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    static class BankAccount implements BankAccountOperations {
        private double balance;

        BankAccount(double startBalance) {
            this.balance = startBalance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Недостаточно средств");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        System.out.println("Баланс: " + account.getBalance());
    }
}
