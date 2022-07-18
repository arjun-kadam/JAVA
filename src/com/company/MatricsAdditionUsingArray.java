package com.company;

public class MatricsAdditionUsingArray {
    public static void main(String[] args) {
        int [][]matrix1={{2,5,6},{3,4,7}}; // Matrix 1
        int [][]matrix2={{1,8,9},{5,4,0}};// Matrix 2
        int [][]addition={{0,0,0},{0,0,0}}; // Addition initialized with '0' value
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                addition[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                System.out.print(addition[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
