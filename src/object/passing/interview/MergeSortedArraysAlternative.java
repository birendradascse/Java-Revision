package object.passing.interview;

import java.util.Arrays;

public class MergeSortedArraysAlternative {
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};

        int[] result = merge(nums1, nums2);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge elements from nums1 and nums2
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}

