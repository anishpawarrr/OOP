import java.util.Scanner;

class prac2{
    public static void main(String[] args) {
        book b = new book();
        int d = 1;
        Scanner s = new Scanner(System.in);
        while(d==1){
            b.ordercopies();
            System.out.println("Enter 1 to continue or 0 to exit");
            d = s.nextInt();
        }

        System.out.println("Amount to be paid -> "+b.price);
    }

    public static class publication{
        publication(){
            title = "";
            price = copy = 0;
        }
        String auuthor;
        String title;
        int price, copy;
        int salecopy(int pr, int qu){
            return pr*qu;
        }
    }

    public static class book extends publication{
        publication[] arr = new book[3];
        String btit[] = {"DSA", "OOP", "LDCO"};
        String bauth[] = {"Ram","Shyam","Aditya"};
        int bpric[] = {100,150,75};
        void setbooks(){
            publication[] arr = new book[3];
            arr[0].title = "DSA";
            arr[0].auuthor = "Ram";
            arr[0].price = 100;
            arr[1].title = "OOP";
            arr[1].auuthor = "Shyam";
            arr[1].price = 150;
            arr[2].title = "LDCO";
            arr[2].auuthor = "Aditya";
            arr[2].price = 75;
        }
        void display(){
            System.out.println("Books ->");
            for(int i=0;i<3;i++){
                System.out.println((i+1) + ".");
                System.out.println("Author -> "+ bauth[i]);
                System.out.println("Title -> "+ btit[i]);
                System.out.println("Price -> "+ bpric[i]);
            }
        }
        void ddisplay(){
            setbooks();
            System.out.println("Books ->");
            for(int i=0;i<3;i++){
                System.out.println((i+1) + ".");
                System.out.println("Author -> "+ arr[i].auuthor);
                System.out.println("Title -> "+ arr[i].title);
                System.out.println("Price -> "+ arr[i].price);
            }
        }
        int ordercopies(){
            try{
                Scanner s = new Scanner(System.in);
                display();
                int d;
                System.out.println("Enter index number of the book you want to buy");
                d = s.nextInt();
                d = d-1;
                System.out.println("Enter number of copies you want to buy");
                copy = s.nextInt();
                price += salecopy(bpric[d],copy);
                return 1;
            }catch(Exception e){
                System.out.println(e);
                return 0;
            }
        }
    }   
    
    public static class magazine extends publication{
        magazine(){
            title = "";
            copy = 0;
            price = 0;
        }
        String []issues = new String[3];
        int []mprice = new int[3];
        void display(magazine m){
            System.out.println("Title ->"+ m.title);
            System.out.println("Price ->"+m.price);
        }
        int orderquantity(){
            try{
                
            }catch(Exception e){

            }
            return 0;
        }
        String currentissue(int i){
            return "issue";
        }
        String receiveissue(int i){
            return "rissue";
        }
    }
}
