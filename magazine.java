import java.util.Scanner;

public class magazine extends publication {
    Scanner s = new Scanner(System.in);
    String magtitles[]=new String[3];
    int price[] = new int[3];
    int mamount;
    void mmagazine(){
        int i,c;
        setmagtitles();
        setPrice();
        magtitles=getMagtitles();
        price=getPrice();
        menu();
        System.out.println("Enter the index nuber of the book you want to order ");
        i=s.nextInt();
        System.out.println("Enter number of copies of "+magtitles[i-1]);
        c=s.nextInt();
        mamount=magprice(i,c);
//        System.out.println("Amount to be paid is "+getAmount(this));

    }
    public void setmagtitles() {
        magtitles[0]="National Geogaphy";
        magtitles[1]="Vogue";
        magtitles[2]="Times";
    }
    public int[] getPrice() {
        return price;
    }
    public void setPrice() {
        price[0] = 500;
        price[1] = 700;
        price[2] = 450;
    }
    public String[] getMagtitles() {
        return magtitles;
    }
    void menu(){
        System.out.println("Magazines ->");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+magtitles[i]+" price -> "+price[i]);
        }
    }
    int magprice(int i,int copi){
        while(i<0){
            System.out.println("Enter valid number of copies ");
            i=s.nextInt();
        }
        return copi*price[i-1];
    }


}
