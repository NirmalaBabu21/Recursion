class permutation {
    public static void printPermutation(String str, String permut)
    {
        if (str.length()==0)
        {
            System.out.println(permut);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            // System.out.println("newstr: "+newstr);
            // System.out.println("permut: "+ permut+", curr :" +curr);
            printPermutation(newstr, permut+curr);
        }
    }
    public static void main(String args[])
    {  printPermutation("abc", "");
    }
    
}
