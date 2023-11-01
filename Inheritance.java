
class Employee
{
    String name,mail;
    float basic,gross;
    void salary()
    {
        float da,hra,pf,cf;
        da=basic*97/100;
        hra=basic*10/100;
        pf=basic*12/100;
        cf=basic*0.1f/100;
        gross=basic+da+hra-pf-cf;

        System.out.println("Name of Employee - "+name);
        System.out.println("Basic Salary of Employee - "+basic);
        System.out.println("Mail of Employee - "+mail);
        System.out.println("Gross sal of Employee - "+gross);
        System.out.println("\n");
    }
};
class Programmer extends Employee
{
    Programmer(String name1,int sal,String mail1)
    {
        System.out.println("Programmer Salary Details");
        name=name1;
        mail=mail1;
        basic = sal;
        System.out.println("\n");
    }
}
class TeamLead extends Employee
{
    TeamLead(String name1,int sal,String mail1)
    {
        System.out.println("TeamLead Salary Details");
        name=name1;
        mail=mail1;
        basic = sal;
        System.out.println("\n");
    }
}
class APM extends Employee
{
    APM(String name1,int sal,String mail1)
    {
        System.out.println("APM Salary Details");
        name=name1;
        mail=mail1;
        basic = sal;
        System.out.println("\n");
    }
}
class ProjectManager extends Employee
{
    ProjectManager(String name1,int sal,String mail1)
    {
        System.out.println("ProjectManager Salary Details");
        name=name1;
        mail=mail1;
        basic = sal;
        System.out.println("\n");
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        Programmer p = new Programmer("Ashutosh Waghire",70000,"ashutoshw@gmail.com");
        p.salary();

        TeamLead t =new TeamLead("Sahil Gupta",50000,"sahilg@gmail.com");
        t.salary();

        APM a = new APM("Rohit Sharma",25000,"rohits@gamil.com");
        a.salary();

        ProjectManager m = new ProjectManager("Archit Yadav",40000,"archity@gmail.com");
        m.salary();

    }
}
