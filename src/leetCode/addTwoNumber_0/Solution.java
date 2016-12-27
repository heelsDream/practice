package leetCode.addTwoNumber_0;

/**
 * Created by pingjiex on 12/23/16.
 */

public class Solution {
    /**
     * Get the sum of two input numbers
     * @param a: string representation of input number
     * @param b: string representation of input number
     * @return a string representation of the sum of two numbers
     */
    public String addTwoNum1(String a, String b){
        /* ArrayList res = new ArrayList(); */
        StringBuilder res = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0){
            int ia = i>=0 ? a.charAt(i) - '0' : 0;
            int ib = j>=0 ? b.charAt(j) - '0' : 0;
            i--;
            j--;
            res.insert(0, (ia+ib+carry)%10);
            carry = (ia+ib+carry)/10;
        }
        if (carry > 0){
            res.insert(0, carry);
        }
        return res.toString();
    }
}

/*
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry = 0;
        while (i>=0 || j>=0) {
            int ia = i >=0 ? a.charAt(i) - '0' : 0;
            int ib = j >=0 ? b.charAt(j) -'0' : 0;
            i--;
            j--;
            sb.insert(0, (ia+ib +carry)%2);
            carry = (ia+ib+carry)/2;
        }
        if (carry > 0) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
*/