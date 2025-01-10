package com.amex.arrays;

import java.util.Arrays;

public class Traverse2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        traverse2DArray(arr);
        System.out.println("Traversing columns");
        traverse2DArrayColumns(arr);
        System.out.println("Sum of rows "+"################");
        sumOfRows(arr);
        System.out.println("Sum of columns "+"****$@!");
        sumOfColumns(arr);
        System.out.println("Transpose of the matrix");
        transpose(arr);
        System.out.println("Printing 2D array row");
        print2DArrayRow(arr);
        System.out.println("Printing 2D array column");
        print2DArrayColumn(arr);
    }

    private static void traverse2DArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }

    private static void traverse2DArrayColumns(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int[] ints : arr) {
                System.out.println(ints[j]);
            }
        }
    }

    private static void sumOfRows(int [][] arr){
        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += ints[j];
            }
        }
        System.out.println(sum);
    }

    private static void sumOfColumns(int [][]arr){
        int sum = 0;
        for(int j=0; j<arr[0].length-1;j++){
            for(int i=0;i<arr.length;i++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

  private static void transpose(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr[0].length; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    System.out.println(Arrays.deepToString(arr));
}


    public static void print2DArrayRow(int[][] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void print2DArrayColumn(int[][] arr) {
        for(int i =0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

}
