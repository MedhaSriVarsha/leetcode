import java.util.Arrays;

class Solution {

    public boolean isGood(int[] nums) {

        int max = 0;

        for(int i=0;i<nums.length;i++){

            if(max < nums[i]){
                max = nums[i];
            }
        }

        if(nums.length != max + 1){
            return false;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){

            if(nums[i] != i+1){
                return false;
            }
        }

        return nums[nums.length-1] == max;
    }

    public static void main(String[]args){
        Solution sc=new Solution();
        sc.isGood(new int[]{2,1,4,3});
    }
}