class Solution {

    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < mat.length; i++) {

            for(int j = 0; j < mat[i].length; j++) {

                // Primary diagonal or secondary diagonal
                if(i == j || i + j == n - 1) {

                    sum = sum + mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Solution sc = new Solution();

        System.out.println(
            sc.diagonalSum(
                new int[][]{
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                }
            )
        );
    }
}