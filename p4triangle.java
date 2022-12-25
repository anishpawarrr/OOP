public class p4triangle extends p4shape{
    public void inputdata(){
        double b,h;
        System.out.println("Enter base of triangle");
        b = s.nextDouble();
        System.out.println("Enter height of triangle");
            h = s.nextDouble();
            inputdata(b, h);
        }        
        public double compute__area(){
            return (s1*s2)/2;
        }
    }

