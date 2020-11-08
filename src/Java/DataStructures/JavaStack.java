package Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            checkParentheses(input);
        }

    }

    static void checkParentheses(String input) {

        if ( input.length() % 2 != 0 ){ // odd length Strings are not balanced
            System.out.println("false");
            return;
        }
        // ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation
        ArrayDeque<Character> deque = new ArrayDeque(); // use deque as a stack
        char[] ch = input.toCharArray();
        boolean flag = true;

        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            } else {
                if ( deque.isEmpty() ){
                    System.out.println("false");
                    return;
                }
                switch (c) {
                    case '}':
                        if (!deque.peek().equals('{'))
                            flag = false;
                        break;
                    case ')':
                        if (!deque.peek().equals('('))
                            flag = false;
                        break;
                    case ']':
                        if (!deque.peek().equals('['))
                            flag = false;
                        break;
                }//switch
                deque.pop();
                if (!flag) {
                    System.out.println("false");
                    return;
                }//if
            }//else


        }//for
        if (deque.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");

    }//func

}
