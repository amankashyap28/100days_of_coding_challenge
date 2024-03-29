//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    } 

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            for(int i = 0; i < N; i++) A[i] = sc.nextInt();
            int Q = sc.nextInt();
            ArrayList<Integer> Queries[] = new ArrayList[Q];
            for(int i = 0; i < Q; i++){
                Queries[i] = new ArrayList<>();
                int x = sc.nextInt(), y = sc.nextInt();
                Queries[i].add(x);
                Queries[i].add(y);
                for(int j = 0; j < Queries[i].get(1); j++){
                    x = sc.nextInt();
                    Queries[i].add(x);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.maximumToys(N, A, Q, Queries);
            for(int x : ans)
                out.print(x + " ");
            out.print("\n");
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {

    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]){

         int[][] a = new int[N][2];

        for(int i=0;i<N;i++) {

            a[i][0]=A[i];

            a[i][1]=i;

        }

        Arrays.sort(a,(b,c) -> b[0]-c[0]);

        

        long[] prefix_sum = new long[N];

        long s=0;

        for(int i=0;i<N;i++) {

            A[a[i][1]]=i;

            s+=(long)(a[i][0]);

            prefix_sum[i]=s;

        }

        

        ArrayList<Integer> ans = new ArrayList<>();

        for(ArrayList<Integer> querie : Queries) {

            ans.add(find(querie,prefix_sum,A,a));

        }

        return ans;

    }

    // TC :- O(k.log(n))

    int find(ArrayList<Integer> q,long[] prefix_sum,int[] A,int[][] a) {

        int lo=0,hi=prefix_sum.length-1,ans=0,c=q.get(0),k=q.get(1);

        int mid,count_of_excluded;

        long actualSum;

        while(lo<=hi) {

            mid = lo+(hi-lo)/2;

            actualSum=prefix_sum[mid];

            count_of_excluded=0;

            

            for(int i=0;i<k;i++) {

                if(mid>=A[q.get(i+2)-1]) {

                    actualSum-=(long)a[A[q.get(i+2)-1]][0];

                    count_of_excluded++;

                }

            }

            

            if(actualSum<=c) {

                lo=mid+1;

                ans = Math.max(ans,mid-count_of_excluded+1);

            } else {

                hi=mid-1;

            }

        }

        return ans;

    }

}
