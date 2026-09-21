package prac;

public class Intern extends Employee{
    private double salary;

    public Intern(String name, int empId, double salary){
        super(name,empId);
        this.salary = salary;
    }

    void calcSalary(){
        System.out.println(5 * salary);
    }

    @Override
    void showSal(){
        System.out.println(this.salary);
    }
}
