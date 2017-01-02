package testCode.ch3.bankAcct;

import common.exceptions.PjDefinedException1;

/**
 * @author: Created by pingjiex on 12/27/16.
 * @use: Used to trace the balance of a personal account
 */
public class BankAcct {
    private double currBalance;
    public BankAcct(){
        this.currBalance = 0.0;
    }
    public BankAcct(double initialBalance){
        this.currBalance = initialBalance;
    }

    /**
     * Account deposit
     * @param amount
     */
    public void deposit(double amount){
        currBalance += amount;
    }
    /**
     * Account withdraw
     * @param amount
     */
    public void withdraw (double amount) throws PjDefinedException1{
        if (currBalance < amount){
            throw new PjDefinedException1("you don't have enough fund to withdraw");
        }else if(amount > 2000.0){
            throw new PjDefinedException1("you can only withdraw $2000 one time at most");
        }
        currBalance -= amount;
    }

    public double getBalance(){
        return currBalance;
    }
}
