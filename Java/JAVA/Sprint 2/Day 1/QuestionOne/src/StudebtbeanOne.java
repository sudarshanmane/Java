public class StudebtbeanOne {

    private int roll;
    private String name;
    private int age;
    private  int marks;

    public StudebtbeanOne() {

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



    public StudebtbeanOne(int roll, String name, int age, int marks){
        setAge(age) ;
        setMarks(marks);
        setName(name);
        setRoll(roll);
    }
//    private  int roll;
//    private String name;
//    private  int age;
//    private  int marks;
//
//
//     StudebtbeanOne(int marks,int age ,int roll,String name){
//        setAge(age);
//        setMarks(marks);
//        setRoll(roll);
//        setName(name);
//
//    }
//
//
//
//    public int getRoll() {
//        return roll;
//    }
//
//    public void setRoll(int roll) {
//        this.roll = roll;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age>18 && age<60){
//            this.age = age;
//        }
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        if(marks > 0 && marks < 500){
//            this.marks = marks;
//        }
//    }
//
//   public StudebtbeanOne(){
//
//
//    }


}
