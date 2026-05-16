class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
    public static void main(String []args){
        Solution sc=new Solution();
        sc.getConcatenation(new int[]{1,2,3});
    }
}