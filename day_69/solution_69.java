//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            out.println(ob.removeStudents(H,N));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   public int removeStudents(int[] h, int N) {
        int dp[] = new int[N];
        int max = 0;
        for(int curr = 0; curr < N; curr++){
            dp[curr] = 1;
            for(int prev = 0; prev < curr; prev++){
                if(h[curr] > h[prev] && dp[curr] < dp[prev] +1){
                    dp[curr] = dp[prev]+1;
                }
            }
        max = Math.max(max, dp[curr]);
        }
        return N-max;
    }
};
