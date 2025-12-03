package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_II {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
     List<List<Integer>> ans= subsetsWithDup(nums);
       // List<List<Integer>> res = new ArrayList<>();
        System.out.println(ans);
    }



    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        subsets(0, nums, new ArrayList<>() , n,  res);
        return res;
    }

    public static void subsets(int i, int[] nums, List<Integer> temp, int n, List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int j =i ; j<n; j++){
            if(j>i && nums[j] == nums[j-1]){
                continue;
            }

            temp.add(nums[j]);
            subsets(j+1, nums,  temp , n,  res);
            temp.remove(temp.size()-1);
        }

    }


}
