package com.bishal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class ArrayFormOfIntegers {
    public static void main(String[] args) {
        int [] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> result = new ArrayList<Integer>();
        List <Integer> fresult = new ArrayList<Integer>();

        int n = 0;
        for (int i = 0; i < num.length; i++) {
         n = (n * 10) + num[i];
        }
        n += k;
        int condition = len(n);
        for (int i = 0; i > condition; i--) {
            int rem = n % 10;
            result.add(rem);
        }
        int index = result.size() - 1;
        while(index >= 0) {
            fresult.add(result.get(index));
            index --;
            System.out.println(index);
        }
        //System.out.println(n);
        return result;
    }

    private static int len(int no) {
        int count = 0;
        while(no > 0) {
            count ++;
            no = no /10;
            //System.out.println(count);
        }
        return count;
    }


}
