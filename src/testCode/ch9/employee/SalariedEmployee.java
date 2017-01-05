package testCode.ch9.employee;

/**
 * Created by pingjiex on 1/5/17.
 */
public class SalariedEmployee extends Employee {
    private double annualRate;

    public SalariedEmployee(String name, double annualPay){
        super.setName(name);
        annualRate = annualPay;
    }

    public void setAnnualRate(double annualPay){
        annualRate = annualPay;
    }

    public double weeklyPay(int hour){
        return (annualRate/26.0);
    }
}
