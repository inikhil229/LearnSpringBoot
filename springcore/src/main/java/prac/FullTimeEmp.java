package prac;

public class FullTimeEmp extends Employee{

    private double salary;
    public FullTimeEmp(String empNamme, int empId,double salary) {
        super(empNamme, empId);
        this.salary = salary;
    }

    @Override
    void calcSalary(){
        System.out.println(10 * salary);
    }

    @Override
    void showSal(){
        System.out.println(this.salary);
    }
}
