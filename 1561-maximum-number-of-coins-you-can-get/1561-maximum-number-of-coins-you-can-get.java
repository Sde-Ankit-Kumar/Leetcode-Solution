class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int not = piles.length/3;
        int sum = 0;
        for(int i=piles.length-2;i>=not;i-=2)
        {
            sum = sum+piles[i];
        }
        return sum;
     }
}