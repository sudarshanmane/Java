public class Dog extends Animal{


    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }

    public static void main(String[] args) {

           Animal animal = new Dog();

        if(animal instanceof Dog){
            System.out.println("animal is the instanceof Dog");
        }else{
            System.out.println("animal is not the instanceof Dog");

        }

       if(animal instanceof Cat){
            System.out.println("animal is the instanceof Cat");
        }else{
            System.out.println("animal is not the instanceof Cat");

        }


//       Explanation
//        According to the above cae we can observe that as we upcast to the animal class with
//                Dog Class; thats mean Dog has became the instanceOf animal object;
//
//                in the other case Cat class is not the instance of the Animal case
//                because we have not casted to the cat class with anima class thats why
//                the Cat is the not instanceOf animal object;





    }
}

