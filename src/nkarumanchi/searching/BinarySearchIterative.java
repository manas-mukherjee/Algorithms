package nkarumanchi.searching;

public class BinarySearchIterative {

    public static void main(String args[]){
        BinarySearchIterative obj = new BinarySearchIterative();
        int arr[] = {1,3,4,5,6,7};
        //System.out.println(obj.btIterativeSearch(arr, 5));
        System.out.println(obj.btRecursiveSearch(arr, 0, 5, 11));
    }

    private int btRecursiveSearch(int[] arr, int low, int high, int data) {
        int mid = low + (high-low)/2;

        System.out.println(low + " - " + high + " - " + mid);
        if(low>high){
            return -1;
        }
        if(arr[mid] == data){
            return mid;
        }else if(arr[mid] < data){
            return btRecursiveSearch(arr, mid+1, high, data);
        }else {
            return btRecursiveSearch(arr, low, mid-1, data);
        }

    }

    private int btIterativeSearch(int[] arr, int data) {
        int low=0, high=arr.length-1;
        int mid =0;

        while(low<=high){
            mid = low + (high-low)/2;

            if(arr[mid]==data){
                return mid;
            }else if(arr[mid] < data){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }
}
