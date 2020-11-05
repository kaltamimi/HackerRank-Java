package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        scanner.close();

        System.out.println(b.add(a));
        System.out.println(b.multiply(a));
    }

}
