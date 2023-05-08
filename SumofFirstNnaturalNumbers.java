class  SumofFirstNnaturalNumbers {
  public static void printSum(int i,int sum,int n)

  { if (i==n)
  {
    sum =sum+i;
    System.out.println(sum);
    return;
  }
  sum =sum+i;
  printSum(i+1, sum, n);
  }
  
  public static void main(String args[])
  {
    int n=5;
    int sum=0, i=1;

    printSum(i,sum,n);
  }
}
