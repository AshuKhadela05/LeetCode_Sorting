import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Sort the array using Solution class
        Solution10 sol = new Solution10();
        int[] sorted = sol.sortArray(nums);

        // Step 4: Output the sorted array
        System.out.println("Sorted Array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

// Class that contains the sortArray method using built-in sort
class Solution10 {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        return nums;       // Return the sorted array
    }
}

// OUTPUT:
// Enter number of elements: 5
// Enter the elements:
// 1
// 2
// 7
// 12
// 5
// Sorted Array:
// 1 2 5 7 12 
