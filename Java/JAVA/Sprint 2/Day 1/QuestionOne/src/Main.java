public class Main {

    public static void main(String[] args) {

        Studentbean student1 = new  Studentbean();

        student1.setName("Ganesh");
        student1.setMarks(50);
        student1.setAge(40);
        student1.setRoll(102);
        System.out.println("------------->");


        if(student1.getAge() >18 && student1.getAge()<60 && student1.getMarks() >0 && student1.getMarks()<500 ){
            System.out.println("Student Age " + student1.getAge());
            System.out.println("Student Name " + student1.getName());
            System.out.println("Student Marks " + student1.getMarks());
            System.out.println("Student Roll " + student1.getRoll());
            System.out.println("------------------>");
        }
        else {
            System.out.println("Not Eligible");
            System.out.println("------------------>");

        }


        Studentbean  objectnew = new Studentbean(50,"Pawan",50,40);

        if(objectnew.getAge() >18 && objectnew.getAge()<60 && objectnew.getMarks() >0 && objectnew.getMarks()<500 ){
            System.out.println("Student Age " + objectnew.getAge());
            System.out.println("Student Name " + objectnew.getName());
            System.out.println("Student Marks " + objectnew.getMarks());
            System.out.println("Student Roll " + objectnew.getRoll());
            System.out.println("------------------>");
        }else {
            System.out.println("Not Eligible");
            System.out.println("------------------>");

        }


        Studentbean  objectnew1 = new Studentbean(50,"Ganu",16,70);

        if(objectnew1.getAge() >18 && objectnew1.getAge()<60 && objectnew1.getMarks() >0 && objectnew1.getMarks()<500 ){
            System.out.println("Student Age " + objectnew1.getAge());
            System.out.println("Student Name " + objectnew1.getName());
            System.out.println("Student Marks " + objectnew1.getMarks());
            System.out.println("Student Roll " + objectnew1.getRoll());
            System.out.println("------------------>");
        }else {
            System.out.println("Not Eligible");
            System.out.println("------------------>");

        }

//        result : Not Eligible "as age = 16 not greater than 18"









    }

}
