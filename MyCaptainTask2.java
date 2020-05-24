import java.util.*;
class MyCaptainTask2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Pick one:\n1.hi\n2.Hello\n3.Hey");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("You Chose Hi");
                    break;
            case 2:System.out.println("You Chose Hello");
                    break;
            case 3:System.out.println("You Chose Hey");
                    break;
            default:System.out.println("Hey!!You Chose wrong option");
            
        }
    }
}