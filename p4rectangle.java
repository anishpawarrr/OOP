public class p4rectangle extends p4shape{
    public void inputdata(){
        double b,h;
        System.out.println("Enter lenght of rectangle");
        b = s.nextDouble();
        System.out.println("Enter breadth of rectangle");
        h = s.nextDouble();
        inputdata(b, h);
    }
    public double compute__area(){
        return s1*s2;
    }
}