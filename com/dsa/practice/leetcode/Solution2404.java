package com.dsa.practice.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Solution2404 {
    public static void main(String[] args) {
        int[] a = {29,47,21,41,13,37,25,7};
        int result = mostFrequentEven(a);
        System.out.println(result);
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
        }
        int result = -1;
        int valuecount = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int  tempValue = entry.getValue();
            if (tempValue > valuecount) {
                valuecount = tempValue;
                result = entry.getKey();
            }
        }

        return result;
    }
}