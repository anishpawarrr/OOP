import java.util.*;

public class Employee extends Salary_calculator {
    public
    String name,add,id,mailid,desi;
    double salary;
    long mono;
    Employee(){
        name="";
        add="";
        id="";
        mailid="";
        desi="";
        salary=0;
        mono=0;


    }
    Scanner s = new Scanner(System.in);

    void getdata(){
        System.out.println("Enter name of employee -> ");
        name = s.next();
        //name = checkname(name,nmar);
        //nmar.add(name);
        System.out.println("Enter address of employee -> ");
        add = s.next();
        System.out.println("Enter mail id of employee -> ");
        mailid = s.next();
        System.out.println("Enter id of employee -> ");
        id = s.next();
        System.out.println("Enter mobile number of employee -> ");
        mono = s.nextLong();
        System.out.println("Enter basic pay of employee -> ");
        salary=s.nextDouble();
        salary =  setsalary(salary);
        System.out.println("Enter designation of employee -> ");
        desi = s.next();

    }
    String givedesi(){
        return desi;
    }
    void display(){
        System.out.println("Name of employee -> "+name);
        System.out.println("Address of employee -> "+add);
        System.out.println("Mail id of employee -> "+mailid);
        System.out.println("Id of employee -> "+id);
        System.out.println("Mobile number of employee -> "+mono);
    }
    void dipsalary(){
        System.out.println("salary -> "+salary);
    }


}
