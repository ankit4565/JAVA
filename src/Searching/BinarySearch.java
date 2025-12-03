package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,12,23,45,56,67,78,98,99,121};
        int target = 5;
        int i = 0;
        int j = arr.length - 1;
        int ans = binarySearch(arr,target,i,j);
        System.out.println(ans);
    }



    // binary Search
    public static int binarySearch(int[] arr, int target, int i , int j) {


          int mid = i + (j - i) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                      return binarySearch(arr,target,i,mid-1);
            }else {
                return  binarySearch(arr,target,mid+1, j);
            }
        }


}
