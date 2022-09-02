import java.util.*;

public class Complex {
    double a,b;
    Scanner s = new Scanner(System.in);
    void input(int i){

        System.out.println("Enter real part of complex number "+i+" : ");
        a = s.nextInt();
        System.out.println("Enter imaginary part of complex number "+i+": ");
        b = s.nextInt();
    }
    void output(){
        System.out.println("Complex number is -> " + a + "+i" + b);
    }
    Complex add(Complex x, Complex y){
        Complex z = new Complex();
        z.a = x.a + y.a;
        z.b = x.b + y.b;
        return z;
    }
    Complex sub(Complex x, Complex y) {
        Complex z = new Complex();
        z.a = x.a - y.a;
        z.b = x.b - y.b;
        return z;
    }
    Complex multiply(Complex x, Complex y){
        Complex z = new Complex();
        z.a = (x.a*y.a) - (x.b*y.b);
        z.b = (x.b*y.a) + (x.a*y.b);
        return z;
    }
    Complex divide(Complex x, Complex y){
        Complex z = new Complex();
        double t = y.b;
        y.b = -1*y.b;
        z = z.multiply(x,y);
        z.a = z.a/(y.a*y.a + y.b*y.b);
        z.b = z.b/(y.a*y.a + y.b*y.b);
        y.b = t;
        return z;
    }
    Complex newinp(){
        Complex c = new Complex();
        System.out.println("Enter real part of the new number ");
        c.a = s.nextInt();
        System.out.println("Enter imaginary part of the new number ");
        c.b = s.nextInt();
        return c;
    }
}
