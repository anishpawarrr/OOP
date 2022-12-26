import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//createdatabase..
//display..
//deleterec..
//updaterec..
//searchrec..
public class prac8 {
    public static void main(String[] args) throws IOException {
        File f = new File("Database.csv");
        // createdatabase(f);
        // addrec(f);
        // addrec(f);
        // String s = displayy(f);
        // System.out.println(s);
        // int i = search("22", f);
        // System.out.println(i);
        delrec("33", f);
        updaterec("69",f);
        String s = displayy(f);
        System.out.println(s);;
    }
    static void createdatabase(File f) throws IOException{
        FileWriter fw = new FileWriter(f);
        fw.write("Id,Name,Marks");
        fw.close();
    }
    static String displayy(File f) throws FileNotFoundException{
        Scanner s = new Scanner(f);
        String st = "", prv = "";
        while(s.hasNextLine()){
            prv = s.nextLine();
            st = st + prv + "\n";
        }
        s.close();
        return st;

    }
    static String getline(){
        String st="", id, nm, mrk;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Id of student");
        id = s.nextLine();
        System.out.println("Enter Name of student");
        nm = s.nextLine();
        System.out.println("Enter Marks of student");
        mrk = s.nextLine();
        st = id + "," + nm + "," + mrk;
        return st;
    }

    static void addrec(File f) throws IOException{
        String con= displayy(f), add = getline();
        FileWriter s = new FileWriter(f);
        Scanner fw = new Scanner(f);
        con = con + add;
        // System.out.println(con);
        s.write(con);
        s.close();
    }
    static int search(String id, File f) throws IOException{
        Scanner s = new Scanner(f);
        String temp="";
        int i = 0;
        while(s.hasNextLine()){
            temp = s.nextLine();
            String []list = temp.split(",");
            if(id.equals(list[0])){
                return i;
            }
            i++; 
        }
        return -1;
    }
    static int delrec(String id, File f) throws IOException{
        int p = search(id, f);
        if(p>0){
            int i=0;
            String con = "";
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                if(i==p){
                    String t = s.nextLine();
                    i++;
                    continue;
                }
                con = con + s.nextLine() + "\n";
                i++;
            }
            FileWriter fw = new FileWriter(f);
            fw.write(con);
            fw.close();
            return 1;
        }
        return -1;
    }
    static void updaterec(String id, File f) throws IOException{
        int p = search(id, f);
        if(p>0){
            String line = getline();
            int i=0;
            Scanner s = new Scanner(f);
            String con="";
            while(s.hasNextLine()){
                if(i==p){
                    String t = s.nextLine();
                    con = con + line + "\n";
                    i++;
                    continue;
                }
                con = con + s.nextLine() + "\n";
                i++;
            }
            FileWriter fw = new FileWriter(f);
            fw.write(con);
            fw.close();
        }
    }
}
