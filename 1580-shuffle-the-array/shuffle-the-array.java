class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans=new int[nums.length];
        for(int i =0;i<n;i++){
             ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
    public static void main(String[]args){
        Solution sc=new Solution();
        sc.shuffle(new int[]{2,5,1,3,4,7},3);
    }
}