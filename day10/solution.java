class Solution
{
    public int firstElementKTime(int[] a, int n, int k) 
    { 
          int answer=-1;
        int[] arr=new int[10000];
        for(int i=0;i<n;i++)
        {
            arr[a[i]]++;
            if(arr[a[i]]==k)
            {
                answer=a[i];
                break;
            }
        }
        return answer;
    } 
}
