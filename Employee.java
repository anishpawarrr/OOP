import java.util.*;

public class Employee extends Salary_calculator {
    public
    String name,add,id,mailid,desi;
    double salary;
    double dsala;
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

        System.out.println("Enter 1 if employee is Team lead ");
        System.out.println("Enter 2 if employee is Asst. manager ");
        System.out.println("Enter 3 if employee is Programmer ");
        dsala = s.nextInt();
        dsala = givebp(givedsala());
        salary = setsalary(givedsala());

//        System.out.println("Enter basic pay of employee -> ");
//        salary=s.nextDouble();
//        salary =  setsalary(salary);

    }
    double givedsala(){return dsala;}
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
    boolean checkid(String s){
        return false;
    }
    double givebp(double n){
        if(n==1){
            return 3000000;
        }else if (n==2){
            return 2000000;
        }else if(n==3){
            return 1000000;
        }else{return 0;}
    }

}
