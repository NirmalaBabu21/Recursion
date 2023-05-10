import java.util.HashSet;

class uniqueSubsequences {

    public static void printUniqueSub(String str, int idx, String newstr, HashSet<String> sub)
    {
        if (idx==str.length())
        {   if(sub.contains(newstr)) {
            return;
            }
            sub.add(newstr);
            System.out.println(newstr);
            return;
        }
        printUniqueSub(str, idx+1, newstr+str.charAt(idx),sub);
        printUniqueSub(str, idx+1, newstr, sub);
    }

    public static void main(String args[])
    {   HashSet<String> sub = new HashSet<>();
        printUniqueSub("aaa", 0, "",sub);
    }
    
}
