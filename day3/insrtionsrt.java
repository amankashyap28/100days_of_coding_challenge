import java.util.Scanner;
public class insrtionsrt
 {
    public static void Insertion_sort(int []A)
    {
        for(int j=1;j<A.length;j++)
        { int key=A[j];
          int i=j-1;
          while(i>=0 && A[i]>key)
          {
            A[i+1]=A[i];
            i=i-1;
          }
          A[i+1]=key;
        }
    }
    public static void main(String[] args) {
      long start_time = System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  how many Elements:");
        int n=sc.nextInt();
        int[]A=new int[n];
        System.out.println("Enter Digits");
        for(int i=0;i<A.length;i++)
        A[i]=sc.nextInt();
        Insertion_sort(A);
        for(int i=0;i<A.length;i++)
        System.out.print(A[i]+"\t");
        System.out.println("    ");
        long end_time = System.currentTimeMillis();
        long difference = end_time-start_time;
          System.out.println("total time taken = " +difference);
          sc.close();
        }
    }


    

