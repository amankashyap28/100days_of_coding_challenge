import java.util.Scanner;
/*Write a program to calculate overtime pay of 10 employees. Overtime is paid at the 
rate of Rs. 12.00 per hour for every hour worked above 40 hours. Assume that 
employees do not work for fractional part of an hour. */
public class employees_overtime {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        int over = 0;
        int t = 0;

        for(int i=1;i<=10;i++)

        {
            int hr = sc.nextInt();
            if(hr>40)
            {
              t = hr - 40;
              over = 12*t;
              System.out.println("");
              System.out.println(" over time work by employee  total money  =" + over);

            }
            else
            {
                System.out.println("no over time work by employee");
            }
        }

     sc.close();
    }
    
}
