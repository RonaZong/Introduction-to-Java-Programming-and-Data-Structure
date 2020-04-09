package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise7 {

    // Not Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double rate = input.nextDouble();

        System.out.println("Years" + "      " + "Future Value");

        for (int years = 1; years <= 30; years++) {
            System.out.println(years + "        " + futureInvestmentValue(investAmount, rate / 100 / 12, years) * 10 / 10);
        }

        input.close();
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * (Math.pow((1+ monthlyInterestRate), years * 12));

        return futureValue;
    }
}
