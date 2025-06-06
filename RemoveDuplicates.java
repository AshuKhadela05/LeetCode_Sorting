import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Step 2: Input sorted array elements
        System.out.println("Enter sorted elements (e.g., 1 1 2 2 3):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Call the removeDuplicates method
        Solution12 sol = new Solution12();
        int length = sol.removeDuplicates(nums);

        // Step 4: Print the updated array
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

// Class that removes duplicates from a sorted array
class Solution12 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        // Traverse from second element onwards
        for (int j = 1; j < nums.length; j++) {
            // If current element is different from last unique one
            if (nums[j] != nums[i]) {
                i++;               // Move pointer for unique element
                nums[i] = nums[j]; // Replace with new unique element
            }
        }

        return i + 1; // Number of unique elements
    }
}

// OUTPUT:
// Enter number of elements: 5
// Enter sorted elements (e.g., 1 1 2 2 3):
// 1 1 2 2 3
// Array after removing duplicates:
// 1 2 3
