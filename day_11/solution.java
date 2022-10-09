class solution
{
    void printPat(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=1; j--)
            {
                for(int k=n; k>=i; k--)
              
                System.out.print(j+" ");
            }
                  System.out.print("$");
        }  
     }
}

