class guestCalling {
    public static int callingGuest(int n)
    {   if(n<=1)
        return 1;

        int single = callingGuest(n-1);
        int pair  = (n-1)* callingGuest(n-2);

        return single+pair;
    }

    public static void main(String args[])
    { 
        System.out.println(callingGuest(4));
    }
    
}
