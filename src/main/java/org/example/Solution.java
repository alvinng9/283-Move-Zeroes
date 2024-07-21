package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                q.offer(nums[i]);
            }
        }
        int index = 0;
        while(!q.isEmpty()) {
            nums[index] = q.remove();
            index++;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
