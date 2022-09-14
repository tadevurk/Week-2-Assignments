package assignment1;

public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String display(){
        return String.format("Name: %s, Email: %s", name,email);
    }

}
