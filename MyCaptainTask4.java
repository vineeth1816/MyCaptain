class Employee
{
    String name;
    int YOJ;
    String address;
    Employee(String name,int YOJ,String address)
    {
        this.name=name;
        this.YOJ=YOJ;
        this.address=address;
    }
    public void setYOJ(int YOJ)
    {
        this.YOJ=YOJ;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public int getYOJ()
    {
        return YOJ;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
}
class MyCaptainTask4
{
    public static void main(String[] args)
    {
        Employee e1=new Employee("Robert",1994,"64C-WallsStreet");
        Employee e2=new Employee("Sam",2000,"68D-WallsStreet");
        Employee e3=new Employee("John",1999,"26B-WallsStreet");
        System.out.println("Name\tYear of Joining\tAddress");
        System.out.println(e1.getName()+"\t"+e1.getYOJ()+"\t\t"+e1.getAddress());
        System.out.println(e2.getName()+"\t"+e2.getYOJ()+"\t\t"+e2.getAddress());
        System.out.println(e3.getName()+"\t"+e3.getYOJ()+"\t\t"+e3.getAddress());
    }
}