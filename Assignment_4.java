import java.util.*;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        double a;
        System.out.println(0.10000000000+0.20000000001);
        System.out.println("Enter \n1 to calculate area of triangle\n2 to calculate area of rectangle");
        i=s.nextInt();
        while(i!=1 && i!=2){
            System.out.println("Enter valid number ");
            i = s.nextInt();
        }
        if(i==1){
            Triangle t = new Triangle();
            boolean b = t.decide();
            t.input(b);
            if(b){
                a = t.compute_area(t.gets1(), t.gets2());
            }else{
                a= t.compute_area(t.gets1(),t.gets3(),t.gets2());
            }
            System.out.println("Area of triangle is -> "+a);
        }else{
            Rectangle r = new Rectangle();
            r.input();
            a = r.compute_area(r.gets1(),r.gets2());
            System.out.println("Area of rectangle is -> "+a);
        }
    }
}
