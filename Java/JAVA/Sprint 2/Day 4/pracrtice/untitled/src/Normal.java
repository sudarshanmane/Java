public class Normal {

    Object getAnyNewObject(int objNumber){
        if(objNumber==1){
            return new A();
        }
        else if(objNumber == 2){
            return new B();
        } else{
            return new C();
        }

    }



    public static void main(String[] args) {

       A a = new B();

       B b = (B) a;

        if(b instanceof  A){
            System.out.println("True");
            System.out.println(a);
        }else{
            System.out.println("False");
            System.out.println(a);

        }

        Normal normal = new Normal();

        C a1 = (C) normal.getAnyNewObject(3);
        System.out.println("I am C's Object" );


        ModelClass modelClass = new ModelClass("shvi","BLR");
        System.out.println(modelClass.toString());

    }
}
