import java.util.*;

public class Main_Assi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many employees' details do you want to enter ? ");
        int n = s.nextInt();
        Last arr[];
        arr = new Last[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Last();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of employee number " + (i + 1));
            arr[i].getdata();
            for (int j = 0; j < i; j++) {
                if (arr[i].checkidd(arr[i], arr[j]) || arr[i].checkmono(arr[i], arr[j])) {
                    System.out.println("You entered something wrong enter employee number " + (i + 1) + "'s detail once again");
                    arr[i].getdata();
                }
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i].display();
            arr[i].dipsalary();
        }
    }

}
