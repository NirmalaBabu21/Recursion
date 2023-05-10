class keypadCombination {

    public static String keypad[] ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str, int idx, String combination)
    {
        if (idx==str.length())
        {
            System.out.println(combination);
            return;
        }

        String mapping=keypad[str.charAt(idx)-'0'];
        for (int i=0;i<mapping.length();i++)
        printCombination(str, idx+1, combination+mapping.charAt(i));
    }
    public static void main(String args[])
    {
        printCombination("23", 0, "");
    }
}
