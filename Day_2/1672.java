package Day_2;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int col = 0;
            for(int j = 0; j < accounts[0].length; j++){
                col += accounts[i][j];
            }
            if(col > max){
                max = col;
            }
        }

        return max;
    }
}
