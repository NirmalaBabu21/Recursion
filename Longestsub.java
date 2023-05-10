class Longestsub {
    public static int p=0;
    public static String q="";
    public static void subsequence(String str, int idx, String newstr)
    { 
        if (idx==str.length())
        {
            return;
        }
        if ((newstr+str.charAt(idx)).length()>p)
        {p= (newstr+str.charAt(idx)).length();
         q= newstr+str.charAt(idx);
        }
        subsequence(str, idx+1, newstr+str.charAt(idx));
        subsequence(str, idx+1, newstr);
    }

    public static void main(String args[])
    {
        subsequence("abcd", 0, "");
        System.out.println(p+" ");
        System.out.println(q);
    }
    
}
