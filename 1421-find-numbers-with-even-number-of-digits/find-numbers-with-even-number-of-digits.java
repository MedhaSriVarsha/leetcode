class Solution {
    public int findNumbers(int[] nums) {
        int[] even; int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]>0){
                while(nums[i]!=0){
                    int digit=nums[i]%2;
                    count++;
                    nums[i]=nums[i]/10;
                }
                if(count%2==0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    public static void main(String []args){
        Solution sc=new Solution();
        sc.findNumbers(new int[]{12,345,2,6,7896});
    }
}