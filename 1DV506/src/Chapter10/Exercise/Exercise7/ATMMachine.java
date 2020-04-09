package Chapter10.Exercise.Exercise7;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i ++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner input = new Scanner(System.in);
        int choice = 4;

        while (choice == 4) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            while (!(0 <= id && id <= 9)) {
                System.out.print("Please enter a correct id: ");
                id = input.nextInt();
            }

            choice = 0;
            while (choice != 4) {
                System.out.print("\nMain menu" + "\n1: Check Balance" + "\n2: Withdraw" +
                        "\n3: Deposit" + "\n4: Exit" + "\nEnter a choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        int withdraw = input.nextInt();
                        accounts[id].withdraw(withdraw);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        int deposit = input.nextInt();
                        accounts[id].deposit(deposit);
                        break;
                    case 4:
                        System.out.println();
                }
            }
        }
        input.close();
    }
}
