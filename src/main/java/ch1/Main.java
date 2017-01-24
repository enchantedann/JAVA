package ch1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
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
        System.out.println(Arrays.toString(nums2));
    }
}
