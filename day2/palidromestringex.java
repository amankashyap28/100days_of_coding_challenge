import java.util.Scanner;
public class palidromestringex
 {
    public static void main(String[] args)
    {   
        Scanner sc =new Scanner(System.in);  
        System.out.println("enter the string data");
        String str=sc.next();
        int n = str.length();
        sc.close();
        for(int i=0;i<=str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(n-i-1))
            {
                System.out.println("palindrome string");
            }
            else
            {
                System.out.println(" not a palindrome string");
            }
        }
    }
}
