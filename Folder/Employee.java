public class Employee extends Person{
    private String dept;
    static int count=0;
    int employeeCount;
    Employee(String name,int id,String dept){
        super(name, id);
         this.dept=dept;
         this.employeeCount=count++;
    }
    public static int showEmployeeCount() {
        return count;
    }

    public void showDetails(){
        System.out.println("Enter name:"+getname());
        System.out.println("Enter id:"+getid());
        System.out.println("Enter dept:"+dept);
        System.out.println("Enter employeeCount:"+employeeCount);
    }

}
