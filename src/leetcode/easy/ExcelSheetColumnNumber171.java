package leetcode.easy;

import java.lang.*;


public class ExcelSheetColumnNumber171 {

    public int titleToNumber(String title) {
        int result = 0;
        for (int i = 0; i < title.length(); i++) {
            result = result * 26 + (title.charAt(i) - 'A' + 1);
        }
        return result;
    }


    public static void main(String args[]) {
        ExcelSheetColumnNumber171 obj = new ExcelSheetColumnNumber171();
        int num = obj.titleToNumber("AC");
        System.out.println(num);
    }
}
