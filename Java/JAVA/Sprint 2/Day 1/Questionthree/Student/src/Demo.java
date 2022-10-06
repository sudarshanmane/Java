public class Demo {


    public static  void main(String[] args) {
        Student obj = new Student();
        
        Student obj1 =  obj.getStudent(true);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAddress());
        System.out.println(obj1.getRoll());


        Student obj2 =  obj.getStudent(false);
        System.out.println(obj2.getName());
        System.out.println(obj2.getAddress());
        System.out.println(obj2.getRoll());
        System.out.println(obj2.getCollageName());
    }
}

