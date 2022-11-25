import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        item it = new item();
        it.disall();
        shopping s = new shopping();
        int amount = s.totam(s.order());
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        System.out.println("1 to pay using credit card");
        System.out.println("2 to pay using gpay");
        d = sc.nextInt();
        if(d==1){
            card c = new card();
            c.cardpayment(amount);
        }else if(d==0){
            gpay g = new gpay();
            g.gpayment(amount);
        }
        System.out.println("Thanks for shopping do come again!");
    }
}
class item {
    ArrayList<products> items = new ArrayList<>();
    products p1 = new products(100, "Pen");
    products p2 = new products(150, "Pages");
    products p3 = new products(120, "Compass Box");
    void addproducts(){
        items.add(p1);
        items.add(p2);
        items.add(p3);
    }
    void disit(products p){
        System.out.println(p.name + "\t" + p.price);
    }
    void disall(){
        addproducts();
        System.out.println("Name \t Price");
        for(int i=0;i<3;i++){
            System.out.print((i+1) + ". ");
            disit(items.get(i));
        }
    }


}
class card{
    String ac, pw;
    Scanner s = new Scanner(System.in);
    void cardpayment(int am){
        System.out.println("Enter card number");
        ac = s.nextLine();
        System.out.println("Enter password");
        pw = s.nextLine();
        System.out.println(am + "Rs successfully paid to store");
    }


}

class gpay{
    String pw;
    Scanner s = new Scanner(System.in);
    void gpayment(int am){
        System.out.println("Enter password");
        pw = s.nextLine();
        System.out.println(am + "Rs successfully paid to store");
    }
}

class shopping{
    ArrayList<Integer> order(){
        Scanner s = new Scanner(System.in);
        int i, q, j;
        ArrayList <Integer> r = new ArrayList<>();
        System.out.println("How many products do you want to buy ?");
        j = s.nextInt();
        for(int k = 0;k<j;k++){
            System.out.println("Enter index of product you want to buy");
            i = s.nextInt();
            System.out.println("Enter quantity of selected product");
            q = s.nextInt();
            r.add(i-1);
            r.add(q);
        }
        return r;
    }
    int totam(ArrayList <Integer> l){
        int tot = 0;
        ArrayList <products> pro = new ArrayList<>();
        ArrayList <Integer> quan = new ArrayList<>();
        for(int i=0;i<l.size();i++){
            int j = l.get(i);
            if(i%2 == 0){
                item it = new item();
                it.addproducts();
                pro.add(it.items.get(j));
            }else{
                quan.add(j);
            }
        }
        for(int i=0;i<pro.size();i++){
            tot += pro.get(i).price*quan.get(i);
        }
        return tot;
    }
}



class products{
    products(int itprice, String itname){
        price = itprice;
        name = itname;
    }
    int price;
    String name;
}
