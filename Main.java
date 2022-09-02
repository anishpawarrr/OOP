import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Complex z0 = new Complex();
        z0.input(1);
        z0.output();

        Complex z1 = new Complex();
        z1.input(2);
        z1.output();

        Complex z2 = new Complex();

        int r = 1;
        while(r==1){
            System.out.println("Enter");
            System.out.println("1 For Addition");
            System.out.println("2 For Subtraction");
            System.out.println("3 For Multiplication ");
            System.out.println("4 For Division");
            System.out.println("5 For New Input");
            int a = s.nextInt();
            if(a==1){
                z2 = z2.add(z1,z0);
                System.out.print("Addition of ");
                z2.output();
            }else if(a==2){
                z2 = z2.sub(z0,z1);
                System.out.print("Subtraction of ");
                z2.output();
            }else if (a==3){
                z2 = z2.multiply(z0,z1);
                System.out.print("Multiplication  of ");
                z2.output();
            }else if (a==4) {
                z2 = z2.divide(z0,z1);
                System.out.print("Division  of ");
                z2.output();
            }else if(a==5){
                z1 = z1.newinp();
                z1.output();
                z0 = z0.newinp();
                z0.output();
            }else{
                System.out.println("You entered wrong number :) ");
            }
            System.out.println("Enter 1 for further operations or enter any other number to exit");
            r = s.nextInt();
        }
    }
}
