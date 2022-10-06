import jdk.nashorn.internal.runtime.ScriptRuntime;

public class Main {

    public static Person generatePerson(Person person){



        if(person instanceof Student){
            person = new Student();
        }

        else {
            person = new Instructor();
        }
        return person;

    }

    public static void main(String[] args) {

        Person newStudent = (Student) generatePerson( new Student());
        Person newInstructor = (Instructor) generatePerson( new Instructor());

        System.out.println(newStudent);
        System.out.println(newInstructor);


    }
}
