import java.util.Scanner;
class Factorial {

    public static int printFact(int n)
    {
        if ((n==1)||(n==0))
        {
            return 1;
        }
        int fact_1= printFact(n-1);
        int fact= n* fact_1;
        return fact;
    }

    public static void main(String args[])
    {   Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int ans= printFact(n);
        System.out.println("Factorial is "+ ans);
    }
    
}
