package CTCI.array_and_string;

import java.util.HashMap;
import java.util.Map;

public class PermutationIfPanlindrome {
    private HashMap<Character,Integer> map;

    PermutationIfPanlindrome(){
        map = new HashMap<>();
    }

    public static void main(String args[]){
        PermutationIfPanlindrome obj = new PermutationIfPanlindrome();
        System.out.println(obj.check("abcdddecba"));
    }

    private boolean check(String str) {
        int charCount = 0;
        char currChar;

        for(int i=0; i<str.length(); i++){

            currChar = Character.toLowerCase(str.charAt(i));
            if(currChar==' '){
                continue;
            }

            if(this.map.containsKey(currChar)){
                charCount = this.map.get(currChar);
                this.map.put(currChar,charCount+1);
            }else {
                this.map.put(currChar,1);
            }
        }

        boolean found = false;
        
        for( Map.Entry<Character, Integer> entry : this.map.entrySet() ){

            if(entry.getValue()%2==1){
                if(!found){
                    found = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
