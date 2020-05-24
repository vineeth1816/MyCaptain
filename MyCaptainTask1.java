import java.util.*;
class MyCaptainTask1
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        int time=sc.nextInt();
        int y=time/525600;
        time=time-(y*525600);
        int d=time/1440;
        time=time-(d*1440);
        System.out.println(y+" Years "+d+" Days");

    }
}