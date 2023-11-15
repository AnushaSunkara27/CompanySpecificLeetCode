package GoldmanSachs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubstringBetweenParanthesis {
    public String reverseSubstring(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                Queue<Character> queue = new ArrayDeque<>();
                
                while(stack.peek() != '(') {
                    queue.add(stack.pop());
                }
                stack.pop();

                while(!queue.isEmpty()) {
                    stack.push(queue.remove());
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        char[] result = new char[stack.size()];
        int i = result.length -1;
        while(stack.size() > 0) {
            result[i--]=stack.pop();
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "(ed(et(oc))el)";
        ReverseSubstringBetweenParanthesis obj = new ReverseSubstringBetweenParanthesis();

        System.out.println(obj.reverseSubstring(input));
    }
}
