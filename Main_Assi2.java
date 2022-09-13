import java.util.*;

public class Main_Assi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many employees' details do you want to enter ? ");
        int n = s.nextInt();
        Last arr[];
        arr = new Last[n];
        for(int i = 0; i< n; i++){
            arr[i] = new Last();
        }
        for(int i = 0; i< n; i++){
            System.out.println("Enter details of employee number "+(i+1));
            arr[i].getdata();
        }
        for(int i = 0; i< n; i++){
            arr[i].display();
            arr[i].dipsalary();
        }
    }

}
