package Java.Strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        char[] arrayOfChar  = a.toCharArray();
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < arrayOfChar.length ; i++){
            int countA = a.length() - a.replaceAll(String.valueOf(arrayOfChar[i]), "").length();
            int countB = b.length() - b.replaceAll(String.valueOf(arrayOfChar[i]), "").length();

            if (countA != countB)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
