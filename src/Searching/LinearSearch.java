package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,12,23,45,56,67,78,98,99,121};
        int target = 5;
        for(int i =0; i< arr.length; i++){
            if(arr[i]==target) System.out.println(i);
        }
    }
}
