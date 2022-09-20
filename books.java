import java.util.*;
public class books extends publication {
    Scanner s = new Scanner(System.in);
    String booktitles[]=new String[3];
    int price[] = new int[3];
    int bamount;

    void bbooks(){
        int i,c;
        setBooktitles();
        setPrice();
        booktitles=getBooktitles();
        price=getPrice();
        menu();
        System.out.println("Enter the index nuber of the book you want to order ");
        i=s.nextInt();
        System.out.println("Enter number of copies of "+booktitles[i-1]);
        c=s.nextInt();
        bamount=booksprice(i,c);

    }
    int booksprice(int i,int copi){
        while(i<0){
            System.out.println("Enter valid number of copies ");
            i=s.nextInt();
        }
        return copi*price[i-1];
    }

    void menu(){
        System.out.println("Books ->");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+booktitles[i]+" price -> "+price[i]);
        }
    }
    public void setBooktitles() {
        booktitles[0]="DSA";
        booktitles[1]="OOP";
        booktitles[2]="DM";
    }
    public String[] getBooktitles() {
        return booktitles;
    }
    public void setPrice() {
        price[0] = 500;
        price[1] = 400;
        price[2] = 250;
    }
    public int[] getPrice() {
        return price;
    }
}
