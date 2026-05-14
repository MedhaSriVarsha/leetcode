class Solution {
    public int search(int[] nums, int target) {
        boolean isTarget=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               isTarget=true;
               return i;
            }
        }
        return -1;
      
    }
    public static void main(String[]args){
        Solution sc=new Solution();
        sc.search( new int[]{2,4,5,6,1,7},  5);
    }
}