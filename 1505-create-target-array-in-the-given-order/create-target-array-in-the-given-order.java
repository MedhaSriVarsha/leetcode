class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            // shift elements to right
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // insert element

            
            target[index[i]] = nums[i];
        }

        return target;
    }

    public static void main(String[] args) {

        Solution sc = new Solution();

        int[] result = sc.createTargetArray(
                new int[]{0,1,2,3,4},
                new int[]{0,1,2,2,1}
        );

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}