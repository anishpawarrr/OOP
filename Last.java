public class Last extends Ass_proj_manager{
//    String idarr[];
//    void getsize(int n){
//        idarr = new String[n];
//    }
    boolean checkidd(Last x, Last y){
        if(x.id.equals(y.id)){
            return true;
        }else{
            return false;
        }
    }
    boolean checkmono(Last x, Last y){
        if(x.mono==y.mono){
            return true;
        }else{
            return false;
        }
    }
}
