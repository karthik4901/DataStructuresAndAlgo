package com.ds.algo.com;
public class ReverseArray {
    public static void main(String[] args) {

        System.out.println("Hello Main");
        int arr[] = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
    }

    public static void reverse(int[] arr){
        int left = 0,right = arr.length-1;
        while (left<right){
           swap(arr,left,right);
                left++;
                right--;
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}