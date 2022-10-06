public class Studentbean {
    private int roll;
    private String name;
    private int age;
    private  int marks;
    public Studentbean() {

    }


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age>18 && age<60){
            this.age = age;
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks>0 && marks<500){
            this.marks = marks;
        }
    }



    public Studentbean(int roll, String name, int age, int marks){
        setAge(age) ;
        setMarks(marks);
        setName(name);
        setRoll(roll);
    }

    public void studentDetails(){
//        if(18<= age && age <60 && 0<marks&& marks<500){
//            System.out.println("Roll no: " + getRoll());
//            System.out.println("Name: " + getName());
//            System.out.println("Age: " + getAge());
//            System.out.println("Marks: " + getMarks());
//        }
//
//        else{
//            System.out.println("Not Eligible");
//        }
//
//        System.out.println("------------->");
    }









}
