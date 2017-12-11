package leetcode.easy;

/*

Complexity Analysis

Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.
In the worst case there will be nn equal strings with length mm and the algorithm performs S = m*nS=m∗n character comparisons.
Even though the worst case is still the same as Approach #1, in the best case there are at most n*minLenn∗minLen comparisons where minLenminLen is the length of the shortest string in the array.

Space complexity : O(1)O(1). We only used constant extra space
*/

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
