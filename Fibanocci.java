import java.util.Scanner;

class Fibanocci {

    public static void printFibanocci( int a, int b, int n)
    {   int sum;
        if (n==0)
        {
            return;
        }
        sum=a+b;
        System.out.print(" "+sum);
        printFibanocci(b, sum, n-1);
    }

    public static void main(String args[])
    {
        int a=0, b=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        printFibanocci(a, b, n-2);
    }
    
}
