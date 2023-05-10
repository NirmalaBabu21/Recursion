class duplicateRemoval {
    public static boolean[] map=new boolean[26];

    public static void duplicateRemoval(String str, int idx, String newstr)
    {  if(idx ==str.length())
        {
            System.out.println(newstr);
            return;
        }
        if(map[str.charAt(idx)-'a']==false)
        {
            newstr=newstr+str.charAt(idx);
            map[str.charAt(idx)-'a']=true;
            duplicateRemoval(str, idx+1, newstr);
        }
        else
        {
            duplicateRemoval(str, idx+1, newstr);
        }
    }
    public static void main(String args[])
    {
        duplicateRemoval("abbcddaefff", 0, "");
    }
}
