package leetcodesolutions;

import java.util.Stack;

public class ValidParenthesesLeetCode20 {
    public static void main(String[] args) {
//        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
//        String s = "([])";
        String s = "[";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) return false;
                else if (stack.peek() == '(' && c==')') {
                    stack.pop();
                }
                else if (stack.peek() == '{' && c=='}') {
                    stack.pop();
                }
                else if (stack.peek() == '[' && c==']') {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
