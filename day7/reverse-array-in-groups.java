// Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

// Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size).

// Example 1:

// Input:
// N = 5, K = 3
// arr[] = {1,2,3,4,5}
// Output: 3 2 1 5 4
// Explanation: First group consists of elements
// 1, 2, 3. Second group consists of 4,5.

 

// Example 2:

// Input:
// N = 4, K = 3
// arr[] = {5,6,8,9}
// Output: 8 6 5 9

 

// Your Task:
// You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 
// code:-
class Solution 
{
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
       for(int i=0;i<n;i+=k)
       {
           int left=i;
           int right=Math.min(n-1,i+k-1);
           while(left<right)
           {
               int temp=arr.get(left);
               arr.set(left,arr.get(right));
               arr.set(right,temp);
               left++;
               right--;

           }

       }

    }

}
