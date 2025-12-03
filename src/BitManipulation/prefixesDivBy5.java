package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class prefixesDivBy5 {
    static void main() {
        int[] nums = new int[]{0,1,1,1,1,1};
      List<Boolean> list =  prefixesDivBy5(nums);
      for (boolean num : list){
          System.out.println(num);
      }
    }

        public static List<Boolean> prefixesDivBy5(int[] nums) {
            List<Boolean> list = new ArrayList<>();
            String binary = "";
            for(int i = 0; i<nums.length; i++){

                binary = binary + nums[i];
                int num = Integer.parseInt(binary,2);
                if(num%5 == 0){
                    list.add(true);

                }else{
                    list.add(false);
                }
            }
            return list;
        }
    }

