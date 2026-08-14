class Solution {
    public String truncateSentence(String s, int k) {
        int pos = -1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                k--;
            }
            if(k==0)
            {
                pos=i;
                break;
            }
        }
        if(k>0)
        {
            pos=s.length();
            return s.substring(0,pos);
        }
        return s.substring(0,pos);
        
    }
}