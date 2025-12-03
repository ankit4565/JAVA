package Array;

import java.util.Arrays;

class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        heightChecker(arr);

    }
    public static void heightChecker(int[] arr) {
        int largest = arr[0];
        for(int i : arr){
                 if(i>largest){
                    largest = i;

                 }
        }
         int[] temp  = new int[largest+1];

        for(int j = 0; j<arr.length; j++){
            temp[arr[j]] = temp[arr[j]] +1;
        }
      //  System.out.println(Arrays.toString(temp));
        int[] ex = new int[arr.length];
         int index =0;
        for(int i =0; i<temp.length; i++){
            while(temp[i]>0){
                ex[index] = i;
                temp[i]--;
                index++;
            }
        }
       System.out.println(Arrays.toString(ex));
         int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!= temp[i]){
                count++;
            }
        }

    }
}