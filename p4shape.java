import java.util.Scanner;

public abstract class p4shape{
    Scanner s = new Scanner(System.in);
    double s1,s2;
    double compute__area(){
        return 0;
    }
    public void inputdata(double b, double h){
        s1 = b;
        s2 = h;
    }
    // public shape(double b, double h){
    //     inputdata(b, h);
    // }
    // public shape(){
    //     s1 = s2 = 0;
    // }
}