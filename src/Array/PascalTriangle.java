package Array;

import java.util.ArrayList;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> finals = new ArrayList<>();
        finals = generate(5);
        int b =2;
        System.out.println(finals);

    }
        public static  List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList();

            pascal(0,numRows, res);

            return res;
        }

        public static void pascal(int i, int numRows, List<List<Integer>> res){

          if(i==numRows) {
             return;
          }
            List<Integer> temp = new ArrayList();
            for (int j = 0; j <=i ; j++) {
                if(j==0 || j==i) {
                    temp.add(1);
                }else {
                    int gettingSumofPreviousvalue = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    temp.add(gettingSumofPreviousvalue);
                }
            }

              res.add(temp);
              pascal(i+1,numRows,res);

            }

        }


