 class Xtoend {
    public static void moveXEnd(String str, int idx, int count, String newstr)
    {
        if (idx ==str.length())
        {
            for (int i=1;i<=count;i++)
            newstr=newstr+'x';
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx)=='x')
        {count++;
         moveXEnd(str, idx+1, count, newstr);
        }
        else
        {newstr=newstr+str.charAt(idx);
        moveXEnd(str, idx+1, count, newstr);
        }
    }
    public static void main(String args[])
    {
        moveXEnd("abcxxxd", 0, 0, "");
    }
}
