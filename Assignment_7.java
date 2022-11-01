import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        strl sl = new strl();
        intlis il = new intlis();
        int sn,in;
        System.out.println("How many numbers do you want in list ?");
        in = s.nextInt();
        il.inp(in);
        il.setcount();
        il.coudis();
        System.out.println("How many Strings do you want in list ?");
        sn = s.nextInt();
        sl.stinp(sn);
        sl.setco();
        sl.dis();
    }
}
class Gen <T>{
    Scanner s = new Scanner(System.in);
    ArrayList<T> list = new ArrayList<T>();
}
class intlis extends Gen<Integer>{
    int pc=0,ec=0,oc=0;
    Gen<Integer> intl = new Gen<Integer>();
    void inp(int n){
        int t;
        for(int i=0;i<n;i++){
            System.out.println("Enter a number");
            t = s.nextInt();
            intl.list.add(t);
        }
    }

    void setcount(){
        int d = 0;
        for(int i=0;i<intl.list.size();i++){
            int c = intl.list.get(i);
            if( intl.list.get(i) %2 == 0){
                ec+=1;
                if(intl.list.get(i)==2){
                    pc++;
                }
            }else{
                oc++;
                for(int j=2;j<intl.list.get(i);j++){
                    if(intl.list.get(i)%j == 0){
                        d=1;
                        break;
                    }
                }
                if(d==0){
                    pc++;
                }
                if(intl.list.get(i)==1){
                    pc--;
                }
            }
        }
    }

    void coudis(){
        System.out.println("Number of Even numbers -> "+ec);
        System.out.println("Number of odd numbers -> "+oc);
        System.out.println("Number of Prime numbers -> "+pc);
    }
}

class strl extends Gen<String>{
    Gen<String> st = new Gen<String>();
    int palc=0;

    void stinp(int n){
        String t;
        for(int i=0;i<n;i++){
            System.out.println("Enter a string");
            t = s.next();
            st.list.add(t);
        }
    }
    void setco(){
        for(int i=0;i<st.list.size();i++){
            if(ispale(st.list.get(i))){
                palc++;
            }
        }
    }
    boolean ispale(String s){
        int i = s.length()-1;
        int j = 0;
        while(i>=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    boolean recipale(String s,int f, int l){
        int i=f, j = l-1;
        if(i>=j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            recipale(s,i+1,j-1);
        }else{
            return false;
        }
        return false;
    }

    void dis(){
        System.out.println("Number of palindromes are "+palc);
    }

}
