package Array;

import java.util.Arrays;

class SetmatrixZeroes {
    static void main() {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(mat);
        for (int[] num: mat){
            System.out.println(Arrays.toString(num));
        }

    }
    public static  void matRow(int[][] mat, int i){
        for(int j =0; j<mat[i].length; j++){
             if(mat[i][j] != 0){
                mat[i][j] = -1;
             }
        }

    }
    public static void matCol(int[][] mat, int j){
        for(int i =0; i<mat.length; i++){
             if(mat[i][j] != 0){
                mat[i][j] = -1;
             }
        }

    }

    public static void setZeroes(int[][] mat) {
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[i].length; j++){
                if(mat[i][j] == 0){
                    matRow(mat,i);
                    matCol(mat,j);
                }
            }
        }

        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[i].length; j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }
    }
}