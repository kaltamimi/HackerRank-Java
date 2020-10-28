package Java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

        Scanner scan = new Scanner(System.in);
        int numberOfArraylist = scan.nextInt();

        for (int i = 0; i <  numberOfArraylist; i++){
            int numberOfColumnInEachArray  = scan.nextInt();
            for (int j = 0; j < numberOfColumnInEachArray; j++){
                int value = scan.nextInt();
                a.get(i).add(j,value);
            }
        }

        System.out.println("----------------------------------");
      //  System.out.println(a.toString());
    }
}