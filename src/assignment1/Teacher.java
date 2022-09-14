package assignment1;

public class Teacher extends Person{
    double salary;

    public Teacher(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
    }

    public double GetSalary(){
        return salary * 12;
    }
}
