public class Programmer extends Team_lead{
    boolean checkp(){
        boolean b = false;
        String desi = givedesi();
        String pr = "Programmer";
        if(desi==pr){
            b=true;
        }
        return b;
    }
}
