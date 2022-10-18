import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello world!");
        int n,d,ph,idd;
        String nm,add,mai;
        System.out.println("How many employees' details do you want to enter ?");
        n = s.nextInt();
        last emp[] = new last[n];
        for(int i=0;i<n;i++){
            emp[i] = new last();
            System.out.println("Enter\n1 to enter details if employee is programmer");
            System.out.println("2 to enter details if employee is teamlead");
            System.out.println("3 to enter details if employee is assistant project manager");
            System.out.println("4 to enter details if employee is project manager");
            d =s.nextInt();
            while(d<1 || d>4){
                System.out.println("Enter valid number");
                d = s.nextInt();
            }
            if(d==1){
                System.out.println("Enter name of employee");
                nm = s.next();
                System.out.println("Enter address of employee");
                add = s.next();
                System.out.println("Enter mail id of employee");
                mai = s.next();
                System.out.println("Enter employee id of employee");
                idd = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].empid==idd){
                        System.out.println("Enter valid id");
                        idd=s.nextInt();
                        break;
                    }
                }
                System.out.println("Enter phone number of employee");
                ph = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].mono==ph){
                        System.out.println("Enter valid phone number");
                        ph=s.nextInt();
                        break;
                    }
                }
                emp[i].setmem(nm,add,mai,idd,ph);
                emp[i].setprog();
                emp[i].display();
                System.out.println("Salary of employee -> "+emp[i].pprsetsalary());
            }
            else if(d==2){
                System.out.println("Enter name of employee");
                nm = s.next();
                System.out.println("Enter address of employee");
                add = s.next();
                System.out.println("Enter mail id of employee");
                mai = s.next();
                System.out.println("Enter employee id of employee");
                idd = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].empid==idd){
                        System.out.println("Enter valid id");
                        idd=s.nextInt();
                        break;
                    }
                }
                System.out.println("Enter phone number of employee");
                ph = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].mono==ph){
                        System.out.println("Enter valid phone number");
                        ph=s.nextInt();
                        break;
                    }
                }
                emp[i].setmem(nm,add,mai,idd,ph);
                emp[i].setpm();
                emp[i].display();
                System.out.println("Salary of employee -> "+emp[i].tlsetsalary());
            }else if(d==3){
                System.out.println("Enter name of employee");
                nm = s.next();
                System.out.println("Enter address of employee");
                add = s.next();
                System.out.println("Enter mail id of employee");
                mai = s.next();
                System.out.println("Enter employee id of employee");
                idd = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].empid==idd){
                        System.out.println("Enter valid id");
                        idd=s.nextInt();
                        break;
                    }
                }
                System.out.println("Enter phone number of employee");
                ph = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].mono==ph){
                        System.out.println("Enter valid phone number");
                        ph=s.nextInt();
                        break;
                    }
                }
                emp[i].setmem(nm,add,mai,idd,ph);
                emp[i].setaspm();
                emp[i].display();
                System.out.println("Salary of employee -> "+emp[i].apmsetsalary());
            }else{
                System.out.println("Enter name of employee");
                nm = s.next();
                System.out.println("Enter address of employee");
                add = s.next();
                System.out.println("Enter mail id of employee");
                mai = s.next();
                System.out.println("Enter employee id of employee");
                idd = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].empid==idd){
                        System.out.println("Enter valid id");
                        idd=s.nextInt();
                        break;
                    }
                }
                System.out.println("Enter phone number of employee");
                ph = s.nextInt();
                for(int j=0;j<i;j++){
                    if(emp[j].mono==ph){
                        System.out.println("Enter valid phone number");
                        ph=s.nextInt();
                        break;
                    }
                }
                emp[i].setmem(nm,add,mai,idd,ph);
                emp[i].setpm();
                emp[i].display();
                System.out.println("Salary of employee -> "+emp[i].pmsetsalary());
            }
        }
//        for(int i=0;i<n;i++){
//            emp[i].display();
//            System.out.println("Salary of employee -> "+emp[i].pmgetSalary());
//
//        }
    }
}
class Employee{
    String empname, address, mailid,desig;
    int empid,mono;
    double bp,salary;
//    void input(){
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter name of employee");
//        empname = s.nextLine();
//        System.out.println("Enter address of employee");
//        address = s.nextLine();
//        System.out.println("Enter mail id of employee");
//        mailid = s.nextLine();
//        System.out.println("Enter employee id of employee");
//        empid = s.nextInt();
//        System.out.println("Enter phone number of employee");
//        mono = s.nextInt();
//    }
    void setmem(String nm,String add,String mai,int emid,int phno){
        empname = nm;
        address = add;
        mailid = mai;
        empid = emid;
        mono = phno;
    }
    void display(){
        System.out.println("_______________________________________________");
        System.out.println("Name of employee -> "+empname);
        System.out.println("Address of employee -> "+address);
        System.out.println("Mail id of employee -> "+mailid);
        System.out.println("Id of employee -> "+empid);
        System.out.println("Mobile number of employee -> "+mono);
        System.out.println("Designation of employee -> "+desig);

    }

    public double getBp() {
        return bp;
    }

    public double getSalary() {
        return salary;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }
}
class  programmer extends Employee{

    void setprog(){
        setDesig("Programmer");
        //prsetsalary();
    }
    public double pprsetsalary(){
        setBp(1000000);
        double b = getBp();
        b=1000000;
        double s=0;
        s=0.97*b + 0.1*b - 0.12*b - 0.001*b;
        s = (0.97+0.1-0.12-0.001)*1000000;
        return s;
    }


    public double prgetSalary() {
        //return pprgetSalary();
        return 0;
    }
}
class teamlead extends programmer{
    void setteaml(){
        setDesig("Teamlead");
        tlsetsalary();
    }
    public double tlsetsalary(){
        setBp(1200000);
        double b = getBp();
        b=1200000;
        double s=0;
        s=0.97*b + 0.1*b - 0.12*b - 0.001*b;
        s = (0.97+0.1-0.12-0.001)*1200000;
        return s;
    }

    public double tlgetSalary() {
        return tlgetSalary();
    }
}
class assiprojmana extends teamlead{
    void setaspm(){
        setDesig("Assistant Project Manager");
        apmsetsalary();
    }
    public double apmsetsalary(){
        setBp(1500000);
        double b = getBp();
        b=150000000;
        double s=0;
        s=0.97*b + 0.1*b - 0.12*b - 0.001*b;
        s = (0.97+0.1-0.12-0.001)*150000000;
        return s;
    }

    public double asgetSalary() {
        return apmsetsalary();
    }
}
class projmana extends assiprojmana{
    void setpm(){
        setDesig("Project Manager");
        pmsetsalary();
    }
    public double pmsetsalary(){
        setBp(2000000);
        double b = getBp();
        b=2000000;
        double s=0;
        s=0.97*b + 0.1*b - 0.12*b - 0.001*b;
        s = (0.97+0.1-0.12-0.001)*2000000;
        return s;
    }
    public double pmgetSalary() {
        return pmsetsalary();
    }
}
class last extends projmana{
    Scanner s = new Scanner(System.in);
//    last(){
//        int d;
//        System.out.println("Enter\n1 to enter details if employee is programmer");
//        System.out.println("2 to enter details if employee is teamlead");
//        System.out.println("3 to enter details if employee is assistant project manager");
//        System.out.println("4 to enter details if employee is project manager");
//        d =s.nextInt();
//        while(d<1 || d>4){
//            System.out.println("Enter valid number");
//            d = s.nextInt();
//        }
//        if(d==1){
//
//        }
//    }
}
