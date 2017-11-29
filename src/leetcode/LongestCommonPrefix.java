package leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for(int c=0; c<strs[0].length(); c++){
            char eachCharOfPivotString = strs[0].charAt(c);

            for(int i=1; i<strs.length; i++){
                if(c==strs[i].length() || strs[i].charAt(c)!=eachCharOfPivotString){
                    return strs[0].substring(0,c);
                }
            }
        }
        return strs[0];
    }

    public static void main(String args[]) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] strs = {"aa", "aaa", "a"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
