import java.util.*;

public class Complex {
    double a,b;

    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real part of complex number : ");
        a = s.nextInt();
        System.out.println("Enter imaginary part of complex number : ");
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
        y.b = -1*y.b;
        z = z.multiply(x,y);
        z.a = z.a/(y.a*y.a + y.b*y.b);
        z.b = z.b/(y.a*y.a + y.b*y.b);
        return z;
    }
}
