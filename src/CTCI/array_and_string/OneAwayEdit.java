package CTCI.array_and_string;

import java.util.Arrays;

public class OneAwayEdit {
    public static void main(String args[]) {
        OneAwayEdit obj = new OneAwayEdit();
        System.out.println(obj.check("pale", "bale"));
    }

    private boolean check(String a, String b) {

        int l1 = a.length();
        int l2 = b.length();

        int matchCount = 0;

        if (Math.abs(l1 - l2) > 1) {
            return false;
        }else {
            char[] c1 = a.toCharArray(); Arrays.sort(c1);
            char[] c2 = b.toCharArray(); Arrays.sort(c2);

            System.out.println(new String(c1));
            System.out.println(new String(c2));

            for(int i=0; i<l1 && i<l2; i++){
                if(c1[i] != c2[i]){
                    matchCount++;
                    if(matchCount>1){
                        return false;
                    }
                }
            }
        }
        return false;
    }

}
