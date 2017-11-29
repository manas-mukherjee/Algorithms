package hackerrank.datastructures.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int sumline1=0,sumline2=0,sumline3=0;
        int sum=0, max=0;
        for(int outer_c=0; outer_c<=3; outer_c++){
            for(int i=0; i<=3; i++){
                //System.out.print(arr[outer_c][i]+ " ");
                sumline1=arr[outer_c][i] + arr[outer_c][i+1] +arr[outer_c][i+2];
                sumline2=arr[outer_c+1][i+1];
                sumline3=arr[outer_c+2][i] + arr[outer_c+2][i+1] + arr[outer_c+2][i+2];
                sum = sumline1+sumline2+sumline3;
                if(outer_c==0&&i==0){
                    max=sum;
                }else if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        map.put(1, true);

    }
}
