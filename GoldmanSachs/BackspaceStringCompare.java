package GoldmanSachs;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backSpaceCompare(String s, String t)  {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i: s.toCharArray()) {
            if(i != '#') {
                stack.push(i);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        BackspaceStringCompare  obj = new BackspaceStringCompare();

        System.out.println(obj.backSpaceCompare(s, t));

    }
}
