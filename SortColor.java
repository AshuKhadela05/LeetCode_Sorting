import java.util.Scanner;

public class SortColor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter the elements (only 0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Sort using quicksort-based Solution
        Solution11 sol = new Solution11();
        sol.sortColor(nums);  // Sorting the array in-place

        // Step 4: Output the sorted array
        System.out.println("Sorted Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

// Class implementing quicksort to sort colors
class Solution11 {
    public void sortColor(int[] nums) {
        sortColors(nums, 0, nums.length - 1);
    }

    // Recursive quicksort function
    public void sortColors(int[] nums, int low, int high) {
        if (low >= high) {
            return; // Base case: if only one element or invalid range
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid]; // Choose middle element as pivot

        // Partitioning step
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                // Swap elements on wrong side of the pivot
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Recursive calls for left and right subarrays
        sortColors(nums, low, end);
        sortColors(nums, start, high);
    }
}

// OUTPUT:
// Enter number of elements: 6
// Enter the elements (only 0s, 1s, and 2s):
// 1 1 2 1 0 2
// Sorted Array:
// 0 1 1 1 2 2


