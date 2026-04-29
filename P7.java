import java.util.Scanner;

class LoanCalculator {

    // Home Loan EMI
    void calculateEMI(int principal, int time, float rate) {
        float r = rate / (12 * 100);   // monthly interest rate
        int n = time * 12;             // total months

        double emi = (principal * r * Math.pow(1 + r, n)) / 
                     (Math.pow(1 + r, n) - 1);

        System.out.println("Home Loan EMI: ₹" + emi);
    }

    // Vehicle Loan EMI
    void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) / 
                     (Math.pow(1 + r, n) - 1);

        System.out.println("Vehicle Loan EMI: ₹" + emi);
    }

    // Personal Loan EMI (fixed 10% interest)
    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double r = rate / (12 * 100);
        int n = time * 12;

        double emi = (principal * r * Math.pow(1 + r, n)) / 
                     (Math.pow(1 + r, n) - 1);

        System.out.println("Personal Loan EMI (10%): ₹" + emi);
    }
}

public
