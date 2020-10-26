package Java.DataStructures;

import java.util.Scanner;

public class Subareas {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        int count = 0;

        for (int i = 0; i < size; i++) {
            int sum = array[i];
            if (sum < 0) {
                count++;
            }
            for (int j = i + 1; j < size && i + 1 < size; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
