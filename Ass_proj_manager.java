public class Ass_proj_manager extends Programmer{
    boolean checkassi(){
        boolean b = false;
        String desi = givedesi();
        String apm = "Asst. project manager";
        if(desi==apm){
            b=true;
        }
        return b;
    }
}
