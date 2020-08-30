package com.leetcode;

import java.util.HashSet;

public class RemoveDuplicate {
    public RemoveDuplicate() {
    }

    public int solution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int i = 0;

            for(int j = 1; j < nums.length; ++j) {
                if (nums[i] != nums[j]) {
                    ++i;
                    nums[i] = nums[j];
                }
            }

            return i + 1;
        }
    }

    public static void main(String[] args) {
        int[] var10000 = new int[]{1, 1, 2};
    }

    public int solution2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            HashSet set = new HashSet();
            int[] var3 = nums;
            int var4 = nums.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Integer i = var3[var5];
                set.add(i);
            }

            return set.size();
        }
    }
}