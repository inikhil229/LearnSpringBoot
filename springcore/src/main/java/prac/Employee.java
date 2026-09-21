package prac;

public abstract class Employee {
    protected String empNamme;
    protected int empId ;

    public Employee(String empNamme,int empId){
        this.empNamme = empNamme;
        this.empId = empId;
    }

    void empInfo(){
        System.out.println(this.empNamme + " " + this.empId);
    }

    abstract void calcSalary();
    abstract  void showSal();
}
