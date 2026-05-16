class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
       for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
           sum+=accounts[i][j];
        }
          if(sum>max){
            max=sum;
          }else{
            max=max;
          }
       } 
       return max;
    }
    public static void main(String []args){
        Solution sc=new Solution();
        sc.maximumWealth(new int[][]{{1,2,3},{3,2,1}});
    }
}