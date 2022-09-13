public class Salary_calculator{
    double setsalary(double salary){
        double da,hra,pf,scf;
        da = 0.97*salary;
        hra = 0.1*salary;
        pf = 0.1*salary;
        scf = 0.001*salary;
        salary =da+hra-pf-scf;
        return salary;
    }
}
