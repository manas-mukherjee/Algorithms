package leetcode;

public class RotateMatrix {
    public static void main(String args[]){
        int n=5;
        int a[][] = new int[][]{
            {1,2,3,10,13},
            {4,5,6,11,14},
            {7,8,9,12,15},
            {16,18,19,112,115},
            {17,20,32,34,115},
        };

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

        int temp = 0;

        for(int i=0 ; i<n; i++){
            for(int j=i ; j<n; j++){
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i=0; i<n; i++){
            for (int j=0; j<n/2; j++){
                    int t = a[i][j];
                    a[i][j] = a[i][n-1-j];
                    a[i][n-1-j] = t;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
