import java.util.*;
public class publication {
    Scanner s = new Scanner(System.in);
    int amount =0;

    void createclass(int t){
        if(t==1){
            books b = new books();
            b.bbooks();
            amount+=getAmount(b);
        } else if (t==2) {
            magazine m = new magazine();
            m.mmagazine();
            amount+=getAmount(m);
        } else if (t==3) {
            books b = new books();
            b.bbooks();
            amount+=getAmount(b);
            magazine m = new magazine();
            m.mmagazine();
            amount+=getAmount(m);
        }else{
            while(t<0 && t>3){
                System.out.println("Enter valid number ");
                t = s.nextInt();
            }
            createclass(t);
        }
        System.out.println("Amount to be paid is "+amount);
    }
    int getAmount(books b){
        return b.bamount;
    }
    int getAmount(magazine b){
        return b.mamount;
    }
    int getAmount(books b, magazine m){
        return b.bamount+m.mamount;
    }
    int copies;
    int amout(int n,int p){
        return n*p;
    }
}
