class MyCaptainTask3
{
    public static void main(String[] args)
    {
        int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] m2={{9,8,7},{6,5,4},{3,2,1}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int sum=m1[i][j]+m2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}