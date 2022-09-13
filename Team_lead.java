public class Team_lead extends Employee{
    boolean checktl(){
        boolean b = false;
        String desi = givedesi();
        String tl = "Team lead";
        if(desi==tl){
            b=true;
        }
        return b;
    }

}
