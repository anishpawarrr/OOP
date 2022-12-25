import java.util.Scanner;

public class prac6{
    public static void main(String[] args) {
        int n1, n2;
        int ar[] = {1,2,3};
        Scanner s = new Scanner(System.in);
        // div();
        arr(ar,3);
        
    }
    public static void div(){
        int n1,n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n1 = s.nextInt();
        System.out.println("Enter a number");
        n2 = s.nextInt();
        double d;
        try{;
            d = n1/n2;
            System.out.println("Answer-> "+ (double)n1/n2);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("enter valid no");
            n2 = s.nextInt();
            System.out.println("Answer-> "+ (double)n1/n2);
        }
    }
    public static void arr(int arr[], int size){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num");
        int i = s.nextInt();
        try{
            int d = arr[i-1];
            System.out.println(d);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Enter valid num");
            i = s.nextInt();
            System.out.println(arr[i-1]);
        }
        
    }

}