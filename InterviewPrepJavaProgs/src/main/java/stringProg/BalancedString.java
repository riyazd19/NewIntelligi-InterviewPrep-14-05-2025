package stringProg;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        System.out.print("enter the string");
        Scanner scan= new Scanner(System.in);
        String str= scan.nextLine();
        System.out.println(str+ " is balanced :- "+isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Stack<Character> st= new Stack<>();
        for(char ch: str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']')
            {
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(!isMatchingPair(top,ch)){
                    return false;
                }

            }
        }
        return st.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open=='(' && close==')')||
                (open=='{'&& close=='}')||
                (open=='['&& close==']');
    }
}
