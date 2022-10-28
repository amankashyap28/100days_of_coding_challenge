class Solution
{
    public int NthTerm(int n)
    {
        long a=2,mod=1000000000+7;
        for(int i=2;i<=n;i++)
              a=(a*i+1)%mod;
              return(int)a;
        // code here
    }
}
