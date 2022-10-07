import java.text.NumberFormat;
import java.util.Scanner;

public class Assingment_6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i;
        try{
            System.out.println("Enter size of array");
            String z;
            z=s.next();
            i=Integer.parseInt(z);
        }catch(Exception e){
            System.out.println("Wrong input size should be in integer");
            i=s.nextInt();
        }
        int arr[] = new int[i];
        for(int j=0;j<i;j++){
            arr[j]=j;
        }
        a o = new a();
        o.decide(arr);

    }
}
class a{
    Scanner s = new Scanner(System.in);
    void decide(int a[]){
        boolean b = true;
        String str;
        int d;
        while(b){
            System.out.println("Enter\n1 to check arithmetic exception\n2 to check array out of bond exception\n3 to check invalid type exception");
            try{
                d=s.nextInt();
            }catch(Exception e){
                System.out.println("Enter integer");
                d=s.nextInt();
            }
            while(d<0 || d>3){
                System.out.println("Enter valid integer");
                d = s.nextInt();
            }
            if(d==1){
                dispariope();
            }else if(d==2){
                displayarr(a);
            }else if(d==3){
                disptype();
            }
            System.out.println("Enter 1 to continue or else enter any other key to exit");
            str = s.next();
            if(str.equals("1")){
                b=true;
            }else {
                b=false;
            }
        }
    }
    void displayarr(int arr[]) {
        try {
            int i;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter index");
            i = s.nextInt();
            System.out.println(arr[i]);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(1234);
            System.out.println("Exception handled Successfully");
        }
    }

        void disptype() {
            try {
                int i;
                System.out.println("Enter int");
                i = s.nextInt();
                System.out.println(i);
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Exception handled Successfully");
            }
        }
        void dispariope(){
            try{
                int x,y;
                System.out.println("Enter dividend");
                x=s.nextInt();
                System.out.println("Enter divisor");
                y=s.nextInt();
                System.out.println(x/y);
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Exception handled Successfully");
            }
        }
        void numfor(){
            try{
                String st;
                System.out.println("Enter string");
                st = s.next();
                int i = Integer.parseInt(st);
                System.out.println(i);
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Exception handled Successfully");
            }
        }
        void nulptr(){
            try{
                String st = null;
                System.out.println(st.length());
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Exception handled Successfully");
            }
        }
}
