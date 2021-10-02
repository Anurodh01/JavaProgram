package com.demo;

public class TargetSearchWithoutKnowingLength {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 10, 200, 400, 600, 901, 1000, 1020,3000, 6000, 10000,100000 };
    // suppose we don't know the array size
        System.out.println(getTheNumberRange(arr, 200));
        
    }
    static int getTheNumberRange(int[] arr,int target){
    int start = 0;
    int end = 1; // 1
    while(target > arr[end]){
        start = end +1;
        end = start * 2 + 1;
    }
    return binarySearch(start, end, arr, target);
}
    static int binarySearch(int start, int end, int[] arr, int target){
        while(start <= end){
            int middle = start + (end - start) / 2 ;
            if (arr[middle] == target){
               // System.out.println("Found At Index: " + middle);
                return middle;
            }else if(arr[middle] < target){
                start = middle + 1;
            }else if(arr[middle] > target){
                end = middle - 1;
            }
    }return -1;
    }
}
