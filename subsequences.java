 class subsequences {
    public static void subsequence(String str, int idx, String newstr)
    { 
        if (idx==str.length())
        {
            System.out.println(newstr);
            return;
        }

        subsequence(str, idx+1, newstr+str.charAt(idx));
        subsequence(str, idx+1, newstr);
    }

    public static void main(String args[])
    {
        subsequence("abc", 0, "");

    }
    
}
