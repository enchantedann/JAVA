package ch1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  /**      Scanner in = new Scanner(System.in);
        //int a = in.nextInt();

        final int LIMIT = 3;
        int count = 1;

        while (count <= LIMIT)
        {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
            count++;
        } while (count <= LIMIT);*/


     /**   switch (a) {
            case 1:
                System.out.println("a is one");
                break;
            case 2:
                System.out.println("a is two");
                break;
            default:
                System.out.println("a is not one and two");

        }*/


        /**
        int[] nums1 = new int[a];
        int[] nums2 = new int[a];
        for (int i = 0; i < a; i++) {
            nums1[i] = in.nextInt();
            nums2[i] = nums1[i];
         }
        Sort bubbleSort = new BubbleSort();
        Sort selectSort = new SelectSort();
        bubbleSort.sort(nums1);
        selectSort.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));**/

        //int x = 5;
        //0000 0101
        //x<<1;
        //0000 1010

        //x>>>1   0000 0010 ===> 2
        //x>>1    0000 0010    2


        //int x = 5; 0000 0101
        //int y = 7; 0000 0111

        //&, x&y     0000 0101
        // |, x|y    0000 0111
        // ^, x^y    0000 0010
/**
        Apple apple = new Apple();
        if (apple instanceof  Apple) {
            System.out.println("This is an apple");
        } else {
            System.out.println("This is an orange");
        }*/

        int[] nums = new int[] {
                2, 3, 4, 6, 7, 1
        };

        for (int index=0; index < nums.length; index++){
            System.out.print(nums[index]+" ");
        }
        System.out.println();
        int end = delete(nums, nums.length - 1, 2);
        for (int index=0; index <= end; index++){
            System.out.print(nums[index]+" ");
        }
        end = insert(nums, end, 1, 10);
        System.out.println();
        for (int index=0; index <= end; index++){
            System.out.print(nums[index]+" ");
        }

    }

    //nums=[2, 3, 4, 6, 7, 1],end=5,pos=1
    //nums=[2, 4, 6, 7, 1, 1], return end = 4
    public static int delete(int[] nums, int end, int pos) {
        if (pos < 0 || pos > end) {
            return end;
        }
        for (int i = pos; i < end; i++) {
            nums[i] = nums[i + 1];
        }

        return end - 1;
    }

    //nums=[2, 4, 6, 7, 1, 1], end = 4, pos 1, value = 9
    //nums=[2, 9, 4, 6, 7, 1], end = 5
    public static int insert(int[] nums, int end, int pos, int value) {
        if (pos < 0 || end >= nums.length || pos > (end + 1)) {
            return end;
        }

        for (int i = end; i >= pos; i--) {
            nums[i + 1] = nums[i];
        }
        nums[pos]=value;
        return end+1;
    }



    static class Apple {}

    static class Orange{}
}
