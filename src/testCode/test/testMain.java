package testCode.test;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by pingjiex on 1/5/17.
 */
public class testMain {
    public static void main(String[] args) {
        System.out.println(System.out instanceof PrintStream);
        System.out.println(System.out instanceof OutputStream);
        System.out.println(System.out instanceof Object);
    }
}
