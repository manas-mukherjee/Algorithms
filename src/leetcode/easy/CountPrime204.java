package leetcode.easy;

public class CountPrime204 {

    public int countPrimes(int n) {
        int countPrime = 0;
        boolean[] notPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                countPrime++;
            }
            for (int j = 2; i * j < n; j++) {
                notPrime[i * j] = true;
            }
        }
        return countPrime;
    }

    public static void main(String args[]) {
        CountPrime204 obj = new CountPrime204();
        int count = obj.countPrimes(9);
        System.out.println(count);
    }
}
