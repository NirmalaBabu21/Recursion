class sortorNot {

    public static boolean SortorNot(int idx, int arr[])
    {
        if (idx==arr.length-1)
        return true;

        if (arr[idx]>=arr[idx+1])
        return false;
        else
        return SortorNot(idx+1,arr);

    }

    public static void main(String args[])
    {

        int arr[] = {1,1,6,4,5};
        System.out.println(SortorNot(0,arr));
        

    }
    
}
