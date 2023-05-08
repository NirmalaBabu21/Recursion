import java.util.Scanner;

class xtoPowern 
{  public static int CalPower(int x, int n)
    {
        if (n==0)
        return 1;
        if (x==0)
        return 0;
        int cal = CalPower(x, n-1);
        int CalPow = x*cal;
        return CalPow;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the power: ");
        int n= sc.nextInt();
        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();
        int cal = CalPower(x, n);
        System.out.println("The answer is " +cal);
    }
}
