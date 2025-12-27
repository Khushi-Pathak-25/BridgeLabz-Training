// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1866155392
// Problem no.- 448
import java.util.*;

class NumberDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
	
	 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        NumberDisappearedInArray  obj = new NumberDisappearedInArray ();
        List<Integer> result = obj.findDisappearedNumbers(nums);

        // Output
        System.out.println("Missing numbers are:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
