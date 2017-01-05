package testCode.ch9.employee;

/**
 * Created by pingjiex on 1/5/17.
 */
public class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, double hourlyPay){
        super.setName(name);
        this.hourlyRate = hourlyPay;
    }

    public void updateRate(double newHourlyPay){
        this.hourlyRate = newHourlyPay;
    }

    public double weeklyPay(int hour){
        return hourlyRate * hour;
    }
}
