package Chapter9.Exercise.Exercise5;

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account(1122, 23000);
        a.setAnnualInterestRate(4.5 / 100);
        a.withdraw(2500);
        a.deposit(3000);

        System.out.println("Current balance: " + a.getBalance() +
                "\nMonthly Interest Rate: " + a.getMonthlyInterestRate() +
                "\nMonthly interest: " + a.getMonthlyInterest() +
                "\nDate created: " + a.getDataCreated());
    }
}
