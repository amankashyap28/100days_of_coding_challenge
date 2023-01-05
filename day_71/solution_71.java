//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
public static String longestString(int n, String[] arr) {
       // Sort the array lexicographically
        Arrays.sort(arr); 
        
        String longest = ""; // initialize the longest string to be an empty string
        
        // Iterate through each string in the array
        for (String s : arr) {
            boolean valid = true; // assume that the current string is a valid candidate for the longest string
            
            // Check if all prefixes of the current string are present in the array
            for (int i = 1; i <= s.length(); i++) {
                String prefix = s.substring(0, i); // get the prefix of the current string
                if (!Arrays.asList(arr).contains(prefix)) { // if the prefix is not present in the array
                    valid = false; // the current string is not a valid candidate
                    break; // stop checking
                }
            }
            
            // If the current string is a valid candidate and is longer than the current longest string
            if (valid && s.length() > longest.length()) {
                longest = s; // update the longest string
            }
        }
        
        // Return the longest string
        return longest;
    }    
}
        
