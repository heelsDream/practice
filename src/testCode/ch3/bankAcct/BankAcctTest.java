package testCode.ch3.bankAcct;

import common.exceptions.PjDefinedException1;

/**
 * Created by pingjiex on 12/27/16.
 */
public class BankAcctTest {
    public static void main(String[] args) {
        BankAcct pjAcct = new BankAcct(1000.0);
        try {
            pjAcct.withdraw(2100);
            System.out.println("The remaining fund in your account: " + pjAcct.getBalance());
        } catch(PjDefinedException1 e){
            e.printStackTrace();
        }
    }
}
