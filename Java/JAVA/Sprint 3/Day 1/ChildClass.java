public class ChildClass extends ParentClass{

    @Override
    void fun1(){
        System.out.println("I am child class");
//        super.fun1();
    }

    void fun2(){
        System.out.println("I am child fun");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        ParentClass parent = new ChildClass();
//        parent.fun1();
//        child.fun2();
//        parent.fun2();

//         ParentClass parent2 = new Child2();
//         parent2.fun1();

//         ParentClass parent3 =  new GrandChild();
//         parent3.fun1();

         Object object =new ChildClass();
//
//         ChildClass c1 = (ChildClass) object;
//         c1.fun1();
//
//        if(object instanceof Child2){
//            Child2 c2 = (Child2) object;
//            c2.fun1();
//        }
//        else{
////            System.out.println("Wrong Child2");
//            ChildClass child3 = (ChildClass) object;
//            child3.fun1();
//        }
//

        ParentClass parentClass = new ChildClass();

//        ChildClass childClass = (ChildClass) parentClass;
//        childClass.fun2();


        if(parentClass instanceof Child2 ){

            Child2 child2 = (Child2) parentClass;
            child2.funChild2();
        }else{
            System.out.println("No");
        }
    }
}
