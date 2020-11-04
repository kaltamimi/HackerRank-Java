package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();

        BigInteger number = new BigInteger(n);

        System.out.println(number.isProbablePrime(100) ? "prime" : "not prime");

    }

}
