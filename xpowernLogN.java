import java.util.Scanner;

class xpowernLogN {

    public static int printPower(int x, int n)
    {
        if (n==0)
        return 1;
        if (x==0)
        return 0;
        if (n%2==0)
        return printPower(x, n/2)*printPower(x, n/2);
        else
        return printPower(x, n/2)* printPower(x, n/2)* x;
    }
    public static void main( String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x= sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int ans = printPower(x, n);
        System.out.print("Output is : "+ans);

    }
}
