package leetcode;
import java.util.*;


class ValidParanthesis {
    private static final Map<Character, Character> myMap;
    static
    {
        myMap = new HashMap<>();
        myMap.put('{', '}');
        myMap.put('(', ')');
        myMap.put('[', ']');
    }

    private Stack<Character> st;

    ValidParanthesis(){
        this.st = new Stack<Character>();
    }

    public boolean isValid(String s) {
        Character c;
        int l = s.length();

        if(l<=1) {
            return false;
        } else{
            for(int i=0; i<l; i++){
                c = s.charAt(i);
                switch(c)
                {
                    case '(':
                    case '{':
                    case '[':
                        st.push(c);
                        break;
                    case ')':
                        if(st.size()==0 || st.pop() != '('){
                            System.out.println(c);
                            return false;
                        }
                        break;
                    case '}':
                        if(st.size()==0 || st.pop() != '{'){
                            return false;
                        }
                        break;
                    case ']':
                        if(st.size()==0 || st.pop() != '['){
                            return false;
                        }
                    default:
                        continue;
                } // end switch
            } // end for
            return st.size() == 0;
        } // end else
    } // end isValid

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.isValid(scanner.next()));
    }
}