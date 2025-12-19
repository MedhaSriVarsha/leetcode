class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        Solution obj = new Solution();
        int j = obj.removeElement(nums, val);

        System.out.println("j = " + j);

        // Print modified array
        System.out.print("Modified nums: ");
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
