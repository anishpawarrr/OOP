public class decicar extends prac10{
    public car retcar(int s){
        if(s == 1){
            return new hatchback();
        }else if(s == 2){
            return new sedan();
        }
        return new suv();
    }
}

