package assignment1;

public class Student extends Person{
    String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    public String GetGroup(){
        return group;
    }
}
