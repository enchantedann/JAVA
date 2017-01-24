package ch1;

public class SelectSort implements Sort {
    public void sort(int[] nums)
    {
        int min, temp;

        for (int index =0; index < nums.length-1; index++)
        {
            min=index;
            for(int scan = index+1;scan<nums.length; scan++)
                if (nums[scan] < nums[min])
                    min=scan;

            //现在开始换各种value
            temp = nums[min];
            nums[min]=nums[index];
            nums[index]=temp;

///Users/zhangyuxin/IdeaProjects/javaLearn/src/main/java/ch1/SelectSort.java
        }

    }
}
