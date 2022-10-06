package Assignments;

public class Student{
    int roll;
    String name;
    String address;
    String collageName;

    Student(int roll,String name,String address){
        obj.roll = roll;
        obj.name = name;
        obj.address = address;
    }
    Student(int roll,String name,String address,String collageName){
        obj.roll = roll;
        obj.name = name;
        obj.address = address;
        obj.collageName = collageName;

    }

    static  Student obj = new Student();

    public Student() {

    }

    public static  Student getStudent(boolean isFromNIT){
          if(isFromNIT){


          }else{
              System.out.println(obj.collageName);
          }
        System.out.println(obj.roll);
        System.out.println(obj.name);
        System.out.println(obj.address);
        System.out.println("------------------>");
        return null;
      }





  }

