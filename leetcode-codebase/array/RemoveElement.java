// https://leetcode.com/problems/remove-element/submissions/1865698887
// Problem Number - 27 
import java.util.Scanner;

class RemoveElement {
	
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RemoveElement obj = new RemoveElement();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = obj.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
