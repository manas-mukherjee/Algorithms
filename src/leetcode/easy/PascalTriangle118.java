package leetcode.easy;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle118 {

    // my approach - didn't work
    public List<List<Integer>> generate1(int n) {
        List<List<Integer>> listOfList = new ArrayList<>();

        List<Integer> list = null;
        for (int i = 1; i <= n; i++) {
            list = getPascalLine(i, list);
            listOfList.add(list);
        }
        return listOfList;
    }

    private List<Integer> getPascalLine(int n, List<Integer> list) {
        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new ArrayList<>(Arrays.asList(1));
        } else if (n == 2) {
            return new ArrayList<>(Arrays.asList(1, 1));
        } else {
            System.out.println("n=3");
            int a=0, b;
            List<Integer> genList = new ArrayList<>();

            genList.add(0,1);

            for (int i=0; i<list.size()-1; i++) {
                genList.add(i+1, list.get(i) + list.get(i+1));
            }
            return genList;
        }
    }
    // my approach - didn't work

    // I didn't do this
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    public static void main(String args[]) {
        PascalTriangle118 obj = new PascalTriangle118();
        List<List<Integer>> output = obj.generate(4);

        for (List<Integer> e : output) {
            for (Integer i : e) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
