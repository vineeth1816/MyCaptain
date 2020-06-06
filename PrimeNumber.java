import java.util.Scanner;

class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(int i=2;i*i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not a prime number");
                return;
            }
        }
        System.out.println(num+" is a prime number");
    }
}