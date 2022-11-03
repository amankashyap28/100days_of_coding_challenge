class Solution
{
    int doUnion(int a[], int n, int b[], int m)  
    {
        //code here
        Set<Integer> set = new HashSet<Integer>();
       for(int i=0;i<n;i++){
             set.add(a[i]);
         }
         for(int j=0;j<m;j++){

             set.add(b[j]);
         }
           return set.size();
    }
}
