// QUESTION:-
//Find the sum of all the numbers between the range l and r. Here each number is represented by the sum of its prime factors. 
//Note : For example, 6 is represented by 5 because 6 has two prime factors 2 and 3 and 2 + 3 = 5.


// Example 1:
// Input: l = 1, r = 2
// Output: 3
// Explanation: 1->1, 2->2 and 1+2=3.  


// Example 2:
// Input: l = 1, r = 6
// Output: 18
// Explanation: 1->1, 2->2, 3->3, 4->2
// 5->5, 6->2+3=5, 1+2+3+2+5+5 = 18. 


// Your Task:  
// You dont need to read input or print anything. Complete the function sumOfAll()
//  which takes l and r as input parameter and returns sum all the numbers 
// ( as represented ) in the given range both L and R included.

// CODE::::::-----
class modified_number_and_queries 
{
    public int sumOfAll(int l, int r)
    {
     int sum =0;
      for(int i=l;i<=r;i++)
      {
       int temp=sum;
       for(int j =i-1;j>1;j--)
       {
           if( i%j==0)
           {
               if(isprime(j))
               {
                   sum+=j;
               }
           }
       }
       if(sum==temp)
       sum +=i;
      }
      return sum;
    }
    public static boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
          return true;
    }
}





