package leetcode.easy;

import java.util.Arrays;

public class ReverseString344 {
    public String reverseString(String s) {

        char[] arr = s.toCharArray();
        for(int i=0, j=s.length()-1; i<j; i++, j--){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        return String.copyValueOf(arr);
    }

    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    public static void main(String args[]){
        ReverseString344 obj = new ReverseString344();
        String ret = obj.reverseString("mukherjee");
        obj.reverse("mukherjee");
        System.out.println(ret);
    }
}
