import java.util.*;
public class prac7 {
    public static void main(String[] args) {
        ArrayList<tem> ar = new ArrayList<>();
        exec e = new exec();
        for(int i=0;i<4;i++){
            e.add(ar);
        }
        for(int i=0;i<4;i++){
            System.out.println(ar.get(i).data);
        }

    }
    public static void add(ArrayList<String> a){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input");
        String st = s.nextLine();
        a.add(st);
    }
    public static ArrayList<Integer> intar (ArrayList<String> a){
        ArrayList<Integer> r = new ArrayList<>();
        String s;
        for(int i=0;i<a.size();i++){
            try{
                s = a.get(i);
                int x = Integer.parseInt(s);
                r.add(x);
            }catch (Exception e){
                continue;
            }
        }
        return r;
    }
    public static class tem<T>{
        T data;
    }
    public static class exec extends tem{
        ArrayList <Integer> inte(ArrayList<tem> t){
            ArrayList<Integer> i = new ArrayList<>();
            for(int j=0;j<t.size();j++){
                try{
                    int x = (int)(t.get(j).data);
                    i.add(x);
                }catch (Exception e){
                    continue;
                }
            }
            return i;
        }
        ArrayList <String> stri(ArrayList<tem> t){
            ArrayList<String> i = new ArrayList<>();
            for(int j=0;j<t.size();j++){
                try{
                    String x = (String)t.get(j).data;
                    i.add(x);
                }catch (Exception e){
                    continue;
                }
            }
            return i;
        }
        void add(ArrayList<tem> t){
            Scanner sc = new Scanner(System.in);
            tem<Integer> i = new tem<>();
            tem<String> s = new tem<>();
            System.out.println("Enter 1 to add data as String or 2 to add as integer");
            int d = sc.nextInt();
            if(d==1){
                System.out.println("Enter data");
                i.data = sc.nextInt();
                t.add(i);
            }else{
                s.data = sc.nextLine();
                System.out.println("Enter data");
                s.data = sc.nextLine();
                t.add(s);
            }
        }
    }
}
