import java.util.Scanner;
 class min_max_element_array
 {
           public static void main(String[] args) 
           {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the max value");
            int max=sc.nextInt();
            System.out.println("enter the min value");
            int min=sc.nextInt();
            System.out.println("enter the length of array");
            int l=sc.nextInt();
            int [] arr = new int[l+1];
            System.out.println("the array element are");
            for(int i=0;i<l;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]< min )
                {
                 min=arr[i];
                }
                if(arr[i] < max )
                {
                  max=arr[i];
                }
            }
            System.out.println("the maximum element" + max);
            System.out.println("the minimum element" + min);
            sc.close();
            }
 }  
output:-
 enter the max value
90
enter the min value
10
enter the length of array
5
the array element are
20
30
40
50
60
the maximum element90
the minimum element10
