//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// /User function Template for Java
class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
      while(l<=h)
      {
          int mid= l+(h-l)/2;
          if(A[mid] == key)return mid;
          if(A[l]<=A[mid])//abhi jo mid mila h vo phle sorted array mn h
          {
              //yahan hm  dekhenge agar is array mn key present h ki nahi 
              if(key>=A[l] && key<A[mid])
              {
    //agar key is array mn h to hm apni searh ko chota kar lenge range ab ho jaegi-(l to mid) to hm high ko mid-1 kr deti;
                h=mid-1;
              }
              else
              {
                  l=mid+1;
           }
          }
          else{
              //ab jo hm hn vo doosre array mn hn iska matlab ab hm yahan check karenge ki yahan key present h ki nahi 
              if(key > A[mid] && key<=A[h]){
                  //ab hmen pata h ki key yahan present h 
                  // ab hm apni search ko fir se shrink kr denge mid se lekar high tk iska matlab ab hm apna low h use - (mid+1) kr denge;
                  l=mid+1;
              }
              else{
                  h=mid-1;
              }
          }
      }
            return -1;
        //complete the function here
    }
}
