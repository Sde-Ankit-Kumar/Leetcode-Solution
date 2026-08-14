class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> List = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            List.add(i);
        }
        int i = 0;
        while(List.size() > 1)
        {
            i = (i + k - 1)  % List.size();
            List.remove(i);
        }
        return List.get(0);
        
    }
}