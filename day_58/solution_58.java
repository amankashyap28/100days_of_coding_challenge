//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends

//User function Template for Java
class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int ans=Integer.MIN_VALUE,row=-1;
       
       for(int i=0;i<N;i++){
           if(Mat[i][M-1]==0){
               continue;
           }else if(Mat[i][0]==1){
              if(ans<M){
                  ans=M;
                  row=i;
              }
           }else if(Mat[i][M-1]==1){
               int a=binarySearch(Mat,0,M-1,i);
               if(ans<a){
                   ans=a;
                   row=i;
               }
           }
       }
       return row;
    }
    private static int binarySearch(int[][] matrix,int start,int end,int row){
        int a=1;
        // taken part because we want the number of elements
        // if we update end then we will not get accurate number of elements
        int part=end;
        while(start<end){
            int mid=start+(part-start)/2; // to avoid the integer overflow
            
            if(matrix[row][mid]==1){
                if(matrix[row][mid-1]==1){
                    part=mid-1;
                }else{
                    a=Math.abs(mid-end)+1;
                    return a;
                }
            }else{
                start=mid+1;
            }
        }
        return a;
    }
}
