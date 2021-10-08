package com.bishal;

public class BS {

    public static void main(String[] args) {
	int[] arr = {-18, -12, 0, 3, 5, 9, 99, 100};
	int target = 98;
	int ans = binarySearch(arr, target);
	System.out.println(ans);

    }
    //returns the index if the element is found
    // returns -1 if the element is not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //better way of finding mid as it won't exceed the limit of int in java
            if (target > mid) {
                start = mid + 1;
            } else if (target < mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
