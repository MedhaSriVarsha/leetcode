
class Solution {
    public int[] runningSum(int[] nums) {
        int[] runSum=new int[nums.length]; int prev=0;
      for(int i=0;i<nums.length;i++){
           runSum[i] =prev+nums[i];
           prev=runSum[i];
           System.out.println(runSum[i]);
      }
     return runSum;
    }


    public static void main(String[]args){
        Solution sc=new Solution();
       sc.runningSum(new int[]{2,3,4,5});
    }
}