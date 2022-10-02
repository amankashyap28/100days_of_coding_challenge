import java.util.Scanner;
public class array1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        int p;
        p = a;
        for (int i = a / 2; i >= 1; i--) 
        {
            System.out.print(i + " ");
        }
        for (int j = 0; j <= p / 2; j++) 
        {
            System.out.print(-j + " ");
        }
      sc.close(); 
    }
}
