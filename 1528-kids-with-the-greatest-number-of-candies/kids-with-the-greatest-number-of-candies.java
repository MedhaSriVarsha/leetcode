import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
            else{
                max=max;
            }
        }
        for(int i=0;i<candies.length;i++){
            int act=candies[i]+extraCandies;
            if(act >=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String []args){
        Solution sc=new Solution();
        sc.kidsWithCandies(new int[]{2,4,1,6},5);
    }
}