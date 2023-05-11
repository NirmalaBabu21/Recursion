class totalpathInMaze {
    public static int countMaze(int i, int j, int n, int m)
    {
        if(i==n || j== m)
        return 0;
        if ((i==n-1) && (j==m-1))
        return 1;

        int downpaths=countMaze(i+1, j, n, m);// moving down
        int rightpaths= countMaze(i, j+1, n, m);// moving right

        return downpaths+rightpaths;
    }
    public static void main(String args[])
    {
        System.out.println(countMaze(0, 0, 3, 4));
    }
}
