import java.util.Scanner;
public class sum_of_two 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1st number");
       int num1 = sc.nextInt();
       System.out.println("1st number are "+num1); 
       System.out.println("enter 2nd number");
       int num2 = sc.nextInt();
       System.out.println("1st number are "+num2);
       int result = num1+num2;
       System.out.println("result of sum of two"+result);
       sc.close();
    }
}
