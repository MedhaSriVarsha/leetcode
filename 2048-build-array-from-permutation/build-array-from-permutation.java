class Solution {
    public int[] buildArray(int[] nums) {
        int []ans =new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return  ans;
    }
    public static void main(String[]args){
        Solution sc=new Solution();
        sc.buildArray(new int[]{0,2,3,4,1});
    }
}