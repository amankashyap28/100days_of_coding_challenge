import java.util.Scanner;
class Linearsrch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many Elements:");
        int n=sc.nextInt();
        int[]A=new int[n];
      //    System.out.println("Enter Digits:");
       System.out.println("the array element are");
        for(int i=1;i<=A.length;i++)
        {
        A[i]=sc.nextInt();
        }    
       System.out.println("Enter Target element");
       int target=sc.nextInt();
       
        sc.close();    
      System.out.println(Liner_Searh(A,target));
    }
  public static int Liner_Searh(int[]A,int target)
    {
      int i=1;
      int l=A.length;
      while(i<=l && A[i]!=target)
      {
        i++;
      } 
      if(i<=l)
      {
        System.out.println("found");
        return 1;
      }
      else
      {
        System.out.println("not found");
       return 0;
      }
  
    }
}    

