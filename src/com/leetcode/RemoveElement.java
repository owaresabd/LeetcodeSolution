/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode;

/**
 *
 * @author USER
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int countK = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[countK++] = nums[i];
            }
        }
        return countK;
    }
    

}
