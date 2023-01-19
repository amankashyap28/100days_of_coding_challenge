//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends

class Solution{
    int carpetBox(int a, int b, int x, int y) {
        if(Math.max(a,b)<=Math.max(x,y)&&Math.min(a,b)<=Math.min(x,y))return 0;
        int m1 = (a>b)?a:b;
        int m2 = (x>y)?x:y;
        int mi1 = (a<b)?a:b;
        if(m1>m2) return 1 + carpetBox(m1/2, (a>b)?b:a, x, y);
        else  return 1 + carpetBox(mi1/2, (a<b)?b:a, x, y);
    }
   
}
