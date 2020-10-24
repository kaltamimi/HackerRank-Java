package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {


    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        /* Add elements to List */
        int numberOfElement = scan.nextInt();
        while (numberOfElement-- != 0) {
            int element = scan.nextInt();
            list.add(element);
        }

        /* Perform queries on List */
        int numberOfQuery = scan.nextInt();
        while (numberOfQuery-- != 0) {
            String query = scan.next();

            if (query.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
             } else {
                 int index = scan.nextInt();
                 list.remove(index);
             }
        }
        scan.close();

        /* Print our updated List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }


    }

}
