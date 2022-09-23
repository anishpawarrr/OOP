import java.util.*;
public class Rectangle extends Shape {
    Scanner s =new Scanner(System.in);
    double compute_area(double x, double y){
        return x*y;
    }
    void input(){
        System.out.println("Enter breadth of rectangle ");
        s1=s.nextDouble();
        System.out.println("Enter length of rectangle ");
        s2=s.nextDouble();
    }
}
