// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1865721807
// Problem number - 1295

import java.util.Scanner;

class EvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int answer = nums[i];

            while (answer > 0) {
                count++;
                answer = answer / 10;
            }

            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenNumberOfDigits obj = new EvenNumberOfDigits();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = obj.findNumbers(nums);
        System.out.println("Count of numbers with even number of digits: " + result);

        sc.close();
    }
}
