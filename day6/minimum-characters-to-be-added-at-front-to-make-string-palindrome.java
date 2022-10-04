class Solution
{
    public static int minChar(String str)
    {
        int cnt=0;
        int n =str.length()-1;
        int i=0;
        int j=n;
        while(j>i)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                cnt++;
                i=0;
                j=--n;
            }
        }
          return cnt;
    }
}
