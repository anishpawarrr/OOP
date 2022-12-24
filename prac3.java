import java.util.ArrayList;
import java.util.Scanner;

class prac3{
    public static void main(String []args){
        ArrayList<Integer> emidd = new ArrayList<>();
        ArrayList<Long> phnno = new ArrayList<>();
        int d = 1,c;
        String nm,mailid,add;
        int empid;
        long mono;
        Scanner s= new Scanner(System.in);
        while(d==1){
            System.out.println("Enter ");
            System.out.println("1 to enter details of programmer\n2 to enter details of team lead\n3 to enter details of assistant project manager\n4 to enter details of project manager");
            c = s.nextInt();
            while(c<1 || c>4){
                System.out.println("Enter valid number");
                c = s.nextInt();
            }
            System.out.println();
            nm = s.nextLine();
            System.out.println("Enter name of employee");
            nm = s.nextLine();
            // System.out.println("qwertyuiop");
            System.out.println("Enter mailid of employee");
            mailid = s.nextLine();
            System.out.println("Enter address of employee");
            add = s.nextLine();
            System.out.println("Enter mobile number of employee");
            mono = s.nextLong();
            System.out.println("Enter id of employee");
            empid = s.nextInt();
            for(int i=0;i<emidd.size();i++){
                if(empid == emidd.get(i)){
                    System.out.println("Enter valid id");
                    empid = s.nextInt();
                    break;
                }
            }
            emidd.add(empid);
            for(int i=0;i<phnno.size();i++){
                if(mono == phnno.get(i)){
                    System.out.println("Enter valid mobile number");
                    mono = s.nextLong();
                    break;
                }
            }
            phnno.add(mono);
            if(c==1){
                programmer p = new programmer(nm, add, mailid, mono, empid);
                p.displaydetails();
            }else if(c==2){
                teamlead tl = new teamlead(nm, add, mailid, mono, empid);
                tl.displaydetails();
            }else if(c==3){
                assistantpm apm = new assistantpm(nm, add, mailid, mono, empid);
                apm.displaydetails();
            }else if(c==4){
                projmana pm = new projmana(nm, add, mailid, mono, empid);
                pm.displaydetails();
            }
            System.out.println("Enter 1 to add details of more employees or 0 to exit");
            d = s.nextInt();
        }        
    }
    public static class employee{
        String empname, add, mailid;
        long phno;
        int emid;
        long bp;
        double calsala(){
            return 0;
        }
    }
    public static class programmer extends employee{
        programmer(String emnm, String ad, String maid, long mo, int eid){
            empname = emnm;
            add = ad;
            emid = eid;
            mailid = maid;
            phno = mo;
            bp = 1000000;
        }
        double calsala(){
            double d = 0.97*bp + 0.1*bp - 0.12*bp - 0.01*bp;
            return d;
        }
        void displaydetails(){
            System.out.println("Name -> "+ empname+"\nAddress -> "+add+"\nMail id -> "+mailid+"\nMobile number -> "+phno+"\nEmployee id -> "+emid+"\nSalary -> "+calsala());
        }
    }
    public static class teamlead extends employee{
        teamlead(String emnm, String ad, String maid, long mo, int eid){
            empname = emnm;
            add = ad;
            emid = eid;
            mailid = maid;
            phno = mo;
            bp = 1200000;
        }
        double calsala(){
            double d = 0.97*bp + 0.1*bp - 0.12*bp - 0.01*bp;
            return d;
        }
        void displaydetails(){
            System.out.println("Name -> "+ empname+"\nAddress -> "+add+"\nMail id -> "+mailid+"\nMobile number -> "+phno+"\nEmployee id -> "+emid+"\nSalary -> "+calsala());
        }
    }
    public static class assistantpm extends employee{
        assistantpm(String emnm, String ad, String maid, long mo, int eid){
            empname = emnm;
            add = ad;
            emid = eid;
            mailid = maid;
            phno = mo;
            bp = 1500000;
        }
        double calsala(){
            double d = 0.97*bp + 0.1*bp - 0.12*bp - 0.01*bp;
            return d;
        }
        void displaydetails(){
            System.out.println("Name -> "+ empname+"\nAddress -> "+add+"\nMail id -> "+mailid+"\nMobile number -> "+phno+"\nEmployee id -> "+emid+"\nSalary -> "+calsala());
        }
    }
    public static class projmana extends employee{
        projmana(String emnm, String ad, String maid, long mo, int eid){
            empname = emnm;
            emid = eid;
            add = ad;
            mailid = maid;
            phno = mo;
            bp = 1800000;
        }
        double calsala(){
            double d = 0.97*bp + 0.1*bp - 0.12*bp - 0.01*bp;
            return d;
        }
        void displaydetails(){
            System.out.println("Name -> "+ empname+"\nAddress -> "+add+"\nMail id -> "+mailid+"\nMobile number -> "+phno+"\nEmployee id -> "+emid+"\nSalary -> "+calsala());
        }
    }
}
