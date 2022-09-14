import assignment1.Person;
import assignment1.Student;
import assignment1.Teacher;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("Vedat","vedatturk@gmail.com","1A");
        people[1] = new Student("Riccardo","riccardo@gmail.com","1A");
        people[2] = new Teacher("Gerwin","gerwin@gmail.com",400.0);
        people[3] = new Teacher("Peter","peter@gmail.com",500.0);

        for (int i = 0; i < people.length; i++) {
            //people[i].getClass() == Student.Class)
            if (people[i] instanceof Student){
                System.out.println(people[i].display() + " " + ((Student) people[i]).GetGroup());
            }
            if (people[i] instanceof Teacher){
                System.out.println(people[i].display() + " " + ((Teacher) people[i]).GetSalary());
            }
        }
        }

    }
