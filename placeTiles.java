class placeTiles {
    public static int tilePlace(int n, int m)
    { if (n==m)
        return 2;
      if (n<m)
        return 1;
      
      int verticalPlaced = tilePlace(n-m, m);
      int horizontalPlaced = tilePlace(n-1, m);

      return verticalPlaced+horizontalPlaced;
    }

    public static void main(String args[])
    {   
      System.out.println(tilePlace(3, 3));
    }
    
}
