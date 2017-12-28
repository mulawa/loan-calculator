
package exercise;

import java.util.Scanner;

public class Loan {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Payment type [CONSTANT, DECREASING] :");
        InstallmentType installmentType = InstallmentType.valueOf(input.nextLine());
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Annual Interest Rate as a decimal: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Loan term: ");
        int numberOfYears = input.nextInt();
        System.out.print("Payments per year: ");
        int numberOfInstallmentsInAYear = input.nextInt();
        input.close();
        Calculator calculator = new Calculator();
        Result result;
        if (installmentType == InstallmentType.CONSTANT) {
            result = calculator.calcConstantPayment(loanAmount, annualInterestRate, numberOfYears, numberOfInstallmentsInAYear);
        } else {
            result = calculator.calcDecreasingPayment(loanAmount, annualInterestRate, numberOfYears, numberOfInstallmentsInAYear);
        }
        System.out.println(result);
    }
}
















