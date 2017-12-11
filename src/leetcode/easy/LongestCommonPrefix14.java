package leetcode.easy;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] input) {
        if(input==null || input.length==0){
            return "";
        }

        for (int i=0; i<input[0].length(); i++){
            int c = input[0].charAt(i);

            for (int j=0; j<input.length; j++){
                if(i==input[j].length() || c!=input[j].charAt(i)){
                    return input[0].substring(0, i);
                }
            }
        }
        return input[0];
    }

    public static void main(String args[]){
        String[] input = {"leetcode", "leet", "lee", "leeto"};
        String prefix = longestCommonPrefix(input);
        System.out.println(prefix);
    }
}
