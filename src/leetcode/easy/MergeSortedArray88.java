package leetcode.easy;

public class MergeSortedArray88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1;

        if(m==1 && n==1){
            if(nums1[0] > nums2[0]){
                nums1[1] = nums1[0];
                nums1[0] = nums2[0];
            }else {
                nums1[1] = nums2[0];
                nums1[0] = nums1[0];
            }
        }else{
            for(int k=m+n-1;k>=0;k--){
                if(i>0 && j>0){
                    if(nums2[j] > nums1[i]){
                        nums1[k]=nums2[j];
                        j--;
                    }else {
                        nums1[k]=nums1[i];
                        i--;
                    }
                }else if(i+1>0){
                    nums1[k] = nums1[i];
                    i--;
                }else if(j+1>0){
                    nums1[k] = nums2[j];
                    j--;
                }
            }
        }

        for(int x : nums1){
            System.out.println(x);
        }
    }

    public static void main(String args[]){
        MergeSortedArray88 obj = new MergeSortedArray88();
        int[] nums1 = new int[14];

        int k=0;
        for (int i: new int[]{2, 3, 5, 7, 10, 12, 14, 15, 16})    {
            nums1[k] = i;
            k++;
        }

        int[] nums2 = new int[5];

        k=0;
        for (int i: new int[]{1, 4, 6, 9, 11}){
            nums2[k] = i;
            k++;
        }
        //obj.merge(nums1,9, nums2,5);

        //TODO: It fails for the following input data. Needs to fixed
        obj.merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);
    }
}
