import java.util.Scanner;

class FirstLastOccurence {
    public static int fi=-1;
    public static int li=-1;

    public static void printOccurence (String str, char a, int idx)
    {   if(idx==(str.length()))
        {   System.out.println(fi+" "+ li);
            return;
        }

        if(str.charAt(idx)==a)
        {
            if (fi==-1)
            {
                fi=idx;
            }
            else
            li= idx;
        }
        printOccurence(str, a,idx+1);
    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        printOccurence( str, 'a', 0);


    }
}
