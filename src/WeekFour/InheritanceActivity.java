package WeekFour;
class Employee{
    
    Long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    double basicSalary;
    double specialAllowance =250.80;
    double Hra = 1000.50;

    public Employee(Long Id, String Name, String Address, Long Phone) {
        this.employeeId = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
    }

    double calculateSalary(){
        double Salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        return Salary;
    }

    public void calculateTransportAllowance(){
        double transportAllowance = 10*basicSalary/100;
        System.out.println(transportAllowance);
    }
}

class Manager extends Employee{

    public Manager(Long Id, String Name, String Address, Long Phone, double Salary) {
        super(Id, Name, Address, Phone);
        this.basicSalary = Salary;

    }
    public void calculateTransportAllowance(){
        double transportAllowance = 15*basicSalary/100;
        System.out.println(transportAllowance);

}}

class Trainee extends Employee {

    public Trainee(Long Id, String Name, String Address, Long Phone, double Salary) {
        super(Id, Name, Address, Phone);
        this.basicSalary = Salary;
    }

    public void calculateTransportAllowance() {
        super.calculateTransportAllowance();
    }

}
public class InheritanceActivity {
    public static void main(String[] args) {

        Manager M = new Manager(126534L,"Peter","Chennai India", 237844L, 65000);
        System.out.println(M.calculateSalary()); //calculated salary for Manager.
        Trainee T = new Trainee(29846L,"Jack","Mumbai India", 442085L, 45000);
        System.out.println(T.calculateSalary());//calculated salary for Trainee.

        M.calculateTransportAllowance(); //The calculateTransportAllowance for the Manager.
        T.calculateTransportAllowance(); //The calculateTransportAllowance for the Trainee.
    }
}
