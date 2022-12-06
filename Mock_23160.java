import java.util.ArrayList;
import java.util.Scanner;

public class Mock_23160 {
    public static void main(String[] args){
       inventory i = new inventory();
       i.setProduct();
       Scanner s = new Scanner(System.in);
       int d,f=1;
       while (f==1){
           System.out.println("Enter");
           System.out.println("1 to get list of products");
           System.out.println("2 to display individual product info");
           System.out.println("3 to purchase products");
           System.out.println("4 to ship your order");
           System.out.println("5 to see profit earned");
           d = s.nextInt();
           if(d<1 || d>5){
               System.out.println("Enter valid number");
               d = s.nextInt();
           }
           if(d==1){
               i.displaylistofallproducts();
           }else if(d==2){
               i.individualproductinfo();
           }else if(d==3){
               i.purchase();
           }else if(d==4){
               i.ship();
           }else{
               i.pprofit();
           }
           System.out.println("Enter 1 to continue or 0 to exit");
           f = s.nextInt();
       }
    }
    public static class inventory {
        ArrayList<String> products = new ArrayList<>();
        String p1,p2,p3;
        int s1=100,s2=100,s3=100,profit=0;
        void setProduct(){
            p1 = "Pen, 10";
            p2 = "Eraser, 5";
            p3 = "Glue, 5";
        }

        void displaylistofallproducts() {
            System.out.println("Product, Price");
            System.out.println("1. "+p1);
            System.out.println("2. "+p2);
            System.out.println("3. "+p3);
        }

        void purchase() {
            displaylistofallproducts();
            int q,d,p,am=0;
            Scanner s = new Scanner(System.in);
            System.out.println("How many types of products do you want to buy?");
            p = s.nextInt();
            while(p<1 || p>3){
                System.out.println("Enter valid number");
                p = s.nextInt();
            }
            for(int i=0;i<p;i++){
                System.out.println("Enter index of product you want to buy");
                d = s.nextInt();
                while (d<1 || d > 3){
                    System.out.println("Enter valid number");
                    d = s.nextInt();
                }
                if(d == 1){
                    System.out.println("How many items do you want to buy?");
                    q = s.nextInt();
                    if(q<s1){
                        s1 = s1-q;
                        am = am + 10*q;
                    }else{
                        System.out.println("Not enough stock");
                    }
                }else if(d==2){
                    System.out.println("How many items do you want to buy?");
                    q = s.nextInt();
                    if(q<s2){
                        s2 = s2-q;
                        am = am + 5*q;
                    }else{
                        System.out.println("Not enough stock");
                    }
                }else if(d==3){
                    System.out.println("How many items do you want to buy?");
                    q = s.nextInt();
                    if(q<s3){
                        s3 = s3-q;
                        am = am + 5*q;
                    }else{
                        System.out.println("Not enough stock");
                    }
                }
            }
            profit += am;
            System.out.println("Amount to be paid is " + am);
        }

        void ship() {
            Scanner s = new Scanner(System.in);
            String l="";
            System.out.println("Where do you want to ship your order?");
            l = s.nextLine();
            System.out.println("Order will be shipped to "+l+ "for 1000 Rs");
            profit+=1000;
        }

        void balancestock() {
            System.out.println("Stock of Pen ->" + s1);
            System.out.println("Stock of Eraser ->" + s2);
            System.out.println("Stock of Glue ->" + s3);
        }
        void individualproductinfo(){
            Scanner s = new Scanner(System.in);
            int d;
            System.out.println("Enter");
            System.out.println("1 to get info of Pens");
            System.out.println("2 to get info of Erasers");
            System.out.println("3 to get info of Glue");
            d = s.nextInt();
            while(d<1 || d > 3){
                System.out.println("Enter valid number");
                d = s.nextInt();
            }
            if(d==1){
                System.out.println("Product name -> Pen, Price-> 10, stock -> "+s1);
            }
            if(d==2){
                System.out.println("Product name -> Eraser, Price-> 5, stock -> "+s2);
            }
            if(d==3){
                System.out.println("Product name -> Glue, Price-> 5, stock -> "+s3);
            }
        }
        void pprofit(){
            System.out.println("Profit earned is -> " + profit);
        }
    }

}
