package Java.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            checkPar(input);
        }

    }

    static void checkPar(String input) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = input.toCharArray();
        boolean flag = true;

        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if ( stack.isEmpty() ){
                    System.out.println("false");
                    return;
                }
                switch (c) {
                    case '}':
                        if (!stack.peek().equals('{'))
                            flag = false;
                        break;
                    case ')':
                        if (!stack.peek().equals('('))
                            flag = false;
                        break;
                    case ']':
                        if (!stack.peek().equals('['))
                            flag = false;
                        break;
                }//switch
                stack.pop();
                if (!flag) {
                    System.out.println("false");
                    return;
                }//if
            }//else


        }//for
        if (stack.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");

    }//func

}
