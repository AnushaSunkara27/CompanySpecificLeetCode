package GoldmanSachs;

import java.util.Stack;

public class ValidParantheses {

    public boolean isValid(String s) {
        if(s.length() <= 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char i: s.toCharArray()) {
            if(i == '(' || i == '{' || i == '[') {
                stack.push(i);
            } else if(i == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(i == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(i == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "()[]{";
        ValidParantheses obj = new ValidParantheses();
        System.out.println(obj.isValid(str));
    }
}