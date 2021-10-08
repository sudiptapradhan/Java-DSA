package com.bishal;

// it is used when you don't know it the array is sorted in asc or desc order
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 3, 5, 9, 99, 100};
        int[] arr2 = {99, 88, 77, 66, 11, -1};
        int target = 99;
        int ans = orderAgnosticBS(arr2, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target) {
        boolean isAsc;
        int start = 0;
        int end = arr.length - 1;
        isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target > mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
