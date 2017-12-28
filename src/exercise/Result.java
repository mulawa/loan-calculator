package exercise;

import java.text.DecimalFormat;
import java.util.List;


public class Result {

    Double total;

    List<Installment> installments;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }


    @Override
    public String toString() {
        String printString = "Number" + " " + "Payment" + "     " + "Interest" + "     " + "Principal\n";
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        int counter = 1;
        for (Installment installment : this.installments) {
            printString += counter + "\t\t" + decimalFormat.format(installment.getPayment()) + "\t\t" +
                    decimalFormat.format(installment.getPrincipal()) + "\t\t" + decimalFormat.format(installment.getInterest()) + "\n";
            counter++;
        }
        printString += "\n" +
                "TotalPayment: " + decimalFormat.format(this.total);
        return printString;
    }
}

