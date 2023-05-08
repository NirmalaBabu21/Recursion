import java.util.Scanner;

class ReverseString {
    public static void printReverse(String str, int idx)
    {
        if (idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String args[])
    {   Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int idx =str.length()-1;
        printReverse(str, idx);
    }
}
