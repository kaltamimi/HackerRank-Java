package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numberOfArraylist = scan.nextInt();

        List<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>(numberOfArraylist);

        for (int i = 0; i <  numberOfArraylist; i++){
            int numberOfElemInEachArray  = scan.nextInt();
            listOfLists.add(new ArrayList<Integer>(numberOfElemInEachArray));

            for (int j = 0; j < numberOfElemInEachArray; j++){
                int value = scan.nextInt();
                listOfLists.get(i).add(j,value);
            }

        }

        int quires = scan.nextInt();
        for (int i = 0; i <  quires; i++){
            int index = scan.nextInt();
            int value = scan.nextInt();

            if(listOfLists.get(index - 1).size() >= value  && listOfLists.get(index - 1).get(value - 1) != null){
                System.out.println(listOfLists.get(index - 1).get(value - 1));
            } else {
                System.out.println("ERROR!");
            }

        }

    }
}
