package Java.Strings;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

//Write your code here
 class MyRegex {

    /*
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
*/
    String number ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = number + "." + number + "." + number + "." + number;

}


// NOTE: this website help in Regex (https://regexr.com)