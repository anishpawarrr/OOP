import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner s = new Scanner(System.in);
        double area;
        while(true){
            try{
                int d;
                System.out.println("Enter\n1 to compute area of rectangle\n2 to compute area of triangle");
                d = s.nextInt();
                // while(d!=1 && d!=2){
                //     System.out.println("Enter valid number");
                //     d = s.nextInt();
                // }
                if(d==1){
                    p4rectangle r = new p4rectangle();
                    r.inputdata();
                    area = r.compute__area();
                    System.out.println("Area of rectangle is -> "+area);
                }else if(d==2){
                    p4triangle r = new p4triangle();
                    r.inputdata();
                    area = r.compute__area();
                    System.out.println("Area of triangle is -> "+area);
                }else{
                    System.exit(0);
                }
            }catch(Exception e){
                System.out.println(e);
                break;
                // System.exit(0);
            }
        }
    }
}

