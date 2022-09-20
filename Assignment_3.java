import java.util.Scanner;

public class Assignment_3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        publication p = new publication();
        String r="1";
        while(r.equals("1")){
            int t;
            System.out.println("Enter 1 to buy books\nEnter 2 to buy magazine\nEnter 3 to buy both");
            t = s.nextInt();
            p.createclass(t);
            System.out.println("Enter 1 to order more or enter anything to exit ");
            r=s.next();
        }
    }
}
