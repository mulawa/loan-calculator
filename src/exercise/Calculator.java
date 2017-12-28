package exercise;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Calculator {
    public Result calcConstantPayment(double loanAmount, double annualInterestRate, int numberOfYears,
                                      int numberOfInstallmentsInAYear) {
        Result result = new Result();
        List<Installment> installmentList = new ArrayList<>();
        int numberOfAllRates = numberOfYears * numberOfInstallmentsInAYear;
        double decreasingInterest = loanAmount / numberOfAllRates;
        double total = 0;
        for (double x = 0; x <= loanAmount; x = x + decreasingInterest) {

            double principalLoan = ((loanAmount - x) * annualInterestRate * 30) / 365;
            double q = (1 + (annualInterestRate / numberOfInstallmentsInAYear));
            double paymentLoan = (loanAmount * (pow(q, numberOfAllRates)) * (q - 1)) / ((pow(q, numberOfAllRates) - 1));
            double interestLoan = paymentLoan - principalLoan;

            Installment installment = new Installment();
            installment.setInterest(principalLoan);
            installment.setPayment(paymentLoan);
            installment.setPrincipal(interestLoan);
            installmentList.add(installment);
            total += installment.getPayment();
        }
        result.setInstallments(installmentList);
        result.setTotal(total);
        return result;
    }


    public Result calcDecreasingPayment(double loanAmount, double annualInterestRate, int numberOfYears,
                                        int numberOfInstallmentsInAYear) {
        Result result = new Result();
        List<Installment> installmentList = new ArrayList<>();
        int numberOfAllRates = numberOfYears * numberOfInstallmentsInAYear;
        double decreasingInterest = loanAmount / numberOfAllRates;
        double total = 0;
        for (double x = 0; x <= loanAmount; x = x + decreasingInterest) {

            double principalLoan= ((loanAmount - x) * annualInterestRate * 30) / 365;
            double paymentLoan = decreasingInterest + principalLoan;

            Installment installment = new Installment();
            installment.setInterest(principalLoan);
            installment.setPayment(paymentLoan);
            installment.setPrincipal(decreasingInterest);
            installmentList.add(installment);
            total += installment.getPayment();
        }
        result.setInstallments(installmentList);
        result.setTotal(total);
        return result;
    }

}