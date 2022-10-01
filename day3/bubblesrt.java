import java.util.Scanner;
public class bubblesrt{
        public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int list [] = new int[6];
        for (int i = 1; i <= 5; i++) 
        {
          System.out.print(" enter the array element"+"\t");
           list[i] = sc.nextInt();
        }
         System.out.print(" array before sort"+"\t");
         for (int i = 1; i <= 5; i++) 
             {
            System.out.print(list[i]);
             }
             System.out.println("");
             System.out.println("bubble sort"+bubbsrt(list));
             System.out.print(" array after sort"+"\t");
         for (int i = 1; i<= 5; i++) 
             {
            System.out.print(list[i]);
             }
             sc.close();
    }
       public static int bubbsrt(int arr[])
        {  
          int n =arr.length;
           for(int i=1;i<n-1;i++)
            {
                for(int j=1;j<n-i;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                         int temp = arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }    
                }
            }
            return   1;
        }
       
 }
