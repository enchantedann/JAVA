package ch1;

import java.util.Arrays;

public class BubbleSort implements Sort {




    public void sort(int[] nums)
    {

        for(int index = 0; index < nums.length - 1; index++) {
            for (int j = 0; j < nums.length - index - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

}
