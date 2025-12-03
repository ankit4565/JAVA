package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Problem {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//     output should be = [ [], [1], [2], [1,2],[3],[1,3],[2,3],[1,2,3] ]
//
//        int n = nums.length;
//         List<Integer> res = new ArrayList<>();
//
//         subset(0, nums, res, n );
//
//    }
//
//    public static void subset(int i, int[] nums , List<Integer> res, int n ){
//
//        if(i>=n){
//            System.out.print(res + ", ");
//            return;
//        }
//        subset(i+1, nums, res, n );
//        res.add(nums[i]);
//        subset(i+1, nums, res, n );
//
//        res.removeLast();


        int n = nums.length;

       List<Integer> res = new ArrayList<>();


        subset(0, nums ,res,n);

    }

    public static void subset(int i, int[] nums, List<Integer> res, int n){
        if(i==n){
            System.out.println(res);
            return;
        }

        res.add(nums[i]);
        subset(i+1,nums,res,n);

        res.remove(res.size()-1);
        subset(i+1, nums,res,n);
    }
}
