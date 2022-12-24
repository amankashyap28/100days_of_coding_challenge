//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            long ans = ob.MissingNo(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long  MissingNo(int[][] matrix)

    {

        int n=matrix.length;

        int m=matrix[0].length;

        long sum=0;

        long ans=-1;

        long actsum=0;

        boolean flag=false;

        for(int i=0;i<2;i++){

            sum=0;

            flag=false;

            for(int j=0;j<m;j++){

                if(matrix[i][j]==0){

                    flag=true;

                    break;

                }

                sum+=(long)matrix[i][j];

            }

            if(!flag){

                actsum=sum;

                break;

            }

        }

        flag=false;

        for(int i=0;i<n;i++){

            flag=false;

            sum=0;

            for(int j=0;j<m;j++){

                if(matrix[i][j]==0) flag=true;

                sum+=(long)matrix[i][j];

            }

            if(!flag){

                if(sum!=actsum) return -1;

            }

            else ans=actsum-sum;

        }

        sum=0;

        long t=0;

        int i=0,j=0;

        while(i<n){

            if(matrix[i][j]==0) sum+=ans;

            sum+=(long)matrix[i][j];

            if(matrix[i][m-j-1]==0) t+=ans;

            t+=(long)matrix[i][m-j-1];

            i+=1;j+=1;

        }

        if(sum!=actsum||t!=actsum||ans<=0) return -1;

        return ans;

    }
}
