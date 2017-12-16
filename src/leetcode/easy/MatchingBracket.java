package leetcode.easy;

import java.util.Stack;

public class MatchingBracket {
    public static void main(String args[]){
        MatchingBracket obj = new MatchingBracket();
        String ret = obj.balance("((((((()");
        System.out.println(ret);
    }

    private String balance(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || Character.isAlphabetic(c)){
                stack.push(c);
            }else if(c==')'){
                sb.append(c);
                while (!stack.empty()){
                    char ch = stack.pop();

                    if(ch=='('){
                        sb.append(ch);
                        break;
                    }
                    sb.append(ch);
                }
            }
        }
        return new StringBuilder(sb).reverse().toString();
    }
}
