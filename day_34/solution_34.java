//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
          s = s.toLowerCase();

        int [] ch = new int[26];

        int ans = 0;

        for(int i=0; i< s.length(); i++){

            for(int j=i; j< s.length(); j++){

                char c= s.charAt(j);

                ch[c- 'a']++;

                int Max = Integer.MIN_VALUE;

                int Min = Integer.MAX_VALUE;

                for(int k=0; k< ch.length; k++){

                    if(ch[k] > Max) Max = ch[k];

                    if(ch[k] < Min && ch[k] != 0) Min = ch[k];

                }

                ans += (Max - Min);

            }

            for(int k =0; k< ch.length; k++) ch[k] = 0;

        }

        return ans;
    }
}
        
