package sedgewick_algo.course2.week4_substring;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BruteForceStringSearch {

    public static int seachString(String source, String substr){
        int M = source.length();
        int N = substr.length();

        for(int i=0; i<= M-N; i++){
            int j;
            for(j=0; j<N ; j++){
                if(source.charAt(i+j) != substr.charAt(j)){
                    break;
                }
            }
            if(j==N){
                return i;
            }
        }
        return -1; // Not Found
    }

    public static void main(String[] args) {
        String text = StdIn.readString();
        String srchString = StdIn.readString();
        StdOut.print(BruteForceStringSearch.seachString(text, srchString));
    }
}
