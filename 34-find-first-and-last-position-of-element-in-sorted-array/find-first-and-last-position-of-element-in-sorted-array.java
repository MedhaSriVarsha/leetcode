class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {

                ans = mid;
                end = mid - 1; // search left
            }
        }

        return ans;
    }

    public int findLast(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {

                ans = mid;
                start = mid + 1; // search right
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution sc = new Solution();

        int[] ans = sc.searchRange(
                new int[]{5,7,7,8,8,10}, 8);

        System.out.println(ans[0] + " " + ans[1]);
    }
}