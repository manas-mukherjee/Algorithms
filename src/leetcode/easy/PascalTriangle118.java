package leetcode.easy;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle118 {
    public List<List<Integer>> generate(int n) {

        if(n==0){
            return null;
        }else if(n==1){
            List<Integer> list = new ArrayList<>(Arrays.asList(1));
            List<ArrayList<Integer>> listOfList = new ArrayList<>();


            return null;
        }
        return null;
    }

    public static void main(String args[]){
        PascalTriangle118 obj = new PascalTriangle118();
        obj.generate(5);
    }
}
