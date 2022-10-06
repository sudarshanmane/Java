public class Student {
      private int roll;
      private String name;
      private String address;
      private String collageName;

    public Student() {

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
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }



    Student(int roll, String name, String address){
        setRoll(roll);
        setName(name);
        setAddress(address);
    }

    Student(int roll,String name,String address,String collageName){
        setRoll(roll);
        setName(name);
        setAddress(address);
        setCollageName(collageName);
    }


    public  static Student getStudent(boolean isFromNIT){
        if(isFromNIT){
            Student s1 = new Student(10,"Sudarshan","Pune");
            return s1;

        }else{
            Student s2 = new Student(11,"pawan","Latur","Bidve") ;
            return s2;
        }
    }







}
