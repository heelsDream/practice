package testCode.ch9.employee;

/**
 * @author: Created by pingjiex on 1/5/17.
 * @reference: book#544
 */
public abstract class Employee {
    private String name;

    public void setName(String employeeName){
        this.name = employeeName;
    }

    // this is a comment
    public String getName(){
        return this.name;
    }

    public abstract double weeklyPay(int hour);
}
