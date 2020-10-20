package Java.Strings;

import java.util.Scanner;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();

        if(s.length() == 0 ){
            System.out.println(0);
            return;
        }

        String [] words = s.split("[^a-zA-Z]+");

        System.out.println(words.length);

        for(String word : words){
            if (word.isEmpty())
                continue;
            System.out.println(word);
        }

    }
}
