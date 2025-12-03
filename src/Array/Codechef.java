package Array;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc = new Scanner(System.in);
      int t = 1;
      while(t-->0){
      int n = 5;
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
          list.add(5);
          list.add(3);
          list.add(4);
          list.add(2);

//      for(int i =0; i<n; i++){
//          list.add(sc.nextInt());
//      }
      int sum =0;

        
        while(!list.isEmpty()){
            int maxIndex = 0;
            int max  =0;
        for(int i=0; i<list.size(); i++){
           if(list.get(i) > max){
               max = list.get(i);
               maxIndex = i;
             }
            
        }
          if(maxIndex <= list.size()-1/2){
              sum += maxIndex;
              list.remove(maxIndex);
          }else{
              sum += list.size()-maxIndex-1;
              list.remove(maxIndex);
          }
        }
        System.out.println(sum);
      }
	}
}
