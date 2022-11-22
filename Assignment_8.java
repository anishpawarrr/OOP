import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        File mf = new File("Data.csv");
        int i, d = 1;
        do {
            System.out.println("Enter:");
            System.out.println("1 to display records");
            System.out.println("2 to add record");
            System.out.println("3 to update a record");
            System.out.println("4 to search a record");
            System.out.println("5 to delete a record");
            i = s.nextInt();
            while(i<1 || i>5){
                System.out.println("Enter valid number");
                i = s.nextInt();
            }
            if(i==1){
                display(mf);
            }else if(i==2){
                add(mf);
            }else if(i==3){
                update(mf);
            }else if(i==4){
                int q = search(mf);
                if(q>0){
                    System.out.println("Record exists at position number "+q);
                }else{
                    System.out.println("Record not found");
                }
            }else{
                delete(mf);
            }
            System.out.println("Enter 1 to continue or any number to exit");
            d = s.nextInt();
        }while(d==1);
        

    }
    public static int delete(File db) throws IOException {
        int j=0,i = search(db);
        System.out.println(i);
        String s = "";
        Scanner sc = new Scanner(db);
        if(i>0){
            while (sc.hasNextLine()){
                s = s + sc.nextLine() + "\n";
            }
            String[] list = s.split("\n");
            sc.close();
            String nstr = "";
            for(int k=0;k<list.length;k++){
                if(k==i){
                    continue;
                }else{
                    nstr = nstr + list[k] + "\n";
                }
            }
            FileWriter fw = new FileWriter(db);
            fw.write(nstr);
            fw.close();
            return 1;
        }
        return -1;
    }
    public static String getid(){
        String st;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id");
        st = s.nextLine();
        return st;
    }
    public static int deci(){
        Scanner s = new Scanner(System.in);
        int d;
        System.out.println("Enter:");
        System.out.println("1 to update id");
        System.out.println("2 to update name");
        System.out.println("3 to update roll number");
        System.out.println("4 to update class");
        System.out.println("5 to update marks");
        System.out.println("6 to update address");
        d=s.nextInt();
        while(d<1 || d>6){
            System.out.println("Enter valid number");
            d = s.nextInt();
        }
        return d-1;
    }
    public static int search(File db) throws FileNotFoundException {
        String id = getid();
        ArrayList<String> dbase = new ArrayList<>();
        Scanner s = new Scanner(db);
        while (s.hasNextLine()){
            dbase.add(s.nextLine());
        }
        for(int i=0;i<dbase.size();i++){
            String[] l= dbase.get(i).split(",");
            if(l[0].equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static void update(File db) throws IOException {
//        String id = getid();
        int d = deci();
        Scanner s = new Scanner(System.in);
        int j=0,i = search(db);
        if(i<0){
            System.out.println("No such record exists");
            return;
        }
        String upval;
        System.out.println("Enter updated value");
        upval = s.nextLine();
        Scanner fs = new Scanner(db);
        String temp, nstr = "";

        while(fs.hasNextLine()){
            if(i==j){
                temp = fs.nextLine();
                String st[] = temp.split(",");
                st[d] = upval;
                temp = "";
                for(String str : st){
                    temp = temp + str + ",";
                }
                nstr = nstr + temp + "\n";
                j++;
            }else{
                nstr = nstr + fs.nextLine() + "\n";
                j++;
            }
        }
        fs.close();
        FileWriter fw = new FileWriter(db);
        fw.write(nstr);
        fw.close();
        System.out.println("Data updated successfully");
    }
    static void add(File db) throws IOException {
        String s = "";
        Scanner reader = new Scanner(db);
        while(reader.hasNextLine()){
            s = s + reader.nextLine() + "\n";
        }
        s = s + getstr();
        reader.close();
        FileWriter fw = new FileWriter(db);
        fw.write(s);
        fw.close();
    }
    public static void display(File db) throws FileNotFoundException {
        Scanner rd = new Scanner(db);
        String s;
        while (rd.hasNextLine()){
            s = rd.nextLine();
            System.out.println(s);
        }
        rd.close();
    }
    public static String getstr(){
        String id,name,add,cls,s = "";
        String rn;
        String marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        id = sc.nextLine();
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter address");
        add = sc.nextLine();
        System.out.println("Enter Class");
        cls = sc.nextLine();
        System.out.println("Enter Roll no.");
        rn = sc.nextLine();
        System.out.println("Enter marks");
        marks = sc.nextLine();
        s = id + "," + name + "," + rn + "," + cls + "," + marks + "," + add;
        return  s;
    }
}
