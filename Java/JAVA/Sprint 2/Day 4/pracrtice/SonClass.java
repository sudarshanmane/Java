public class SonClass extends Father{

    void greet(){

        System.out.println("Hello");
    }

    public static void main(String[] args) {
        SonClass object = new SonClass();

          object.greet();
          object.drinks();

          Father father  = new SonClass();
//          father.drinks();

          SonClass sonObj = (SonClass)  father;
        System.out.println(object.skinTone);
        Father father1 = new SonClass();

        SonClass object1 = (SonClass) father1;
       
    }

}
