import java.util.*;
import java.lang.Math;
class Triangle extends Shape{
    Scanner s =new Scanner(System.in);
    boolean decide(){
        int d;
        System.out.println("Enter \n1 if you know base and height \n2 if you know sides of triangle");
        d=s.nextInt();
        if(d==1){
            return true;
        } else if (d==2) {
            return false;
        }else{
            while(d!=1 && d!=2){
                System.out.println("Enter valid number ");
                d=s.nextInt();
            }
             return decide();
        }
    }
    void input(boolean b){
        if(b){
            System.out.println("Enter base of triangle ");
            s1=s.nextInt();
            System.out.println("Enter height of triangle ");
            s2=s.nextDouble();
        }else{
            System.out.println("Enter length of 1st side of triangle ");
            s1=s.nextDouble();
            System.out.println("Enter length of 2nd side of triangle ");
            s2=s.nextDouble();
            System.out.println("Enter length of 3rd side of triangle ");
            s3=s.nextDouble();
        }
    }
    double compute_area(double x, double y){
        return x*y/2;
    }
    double compute_area(double x, double y, double z){
        double s = (x+y+z)/2;
        s = s*(s-x)*(s-y)*(s-z);
        s=Math.sqrt(s);
        return s;
    }
}
