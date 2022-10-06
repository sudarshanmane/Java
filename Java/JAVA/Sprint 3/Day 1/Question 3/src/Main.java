public class Main {


        public static void main(String[] args){

            String[] array = {"makeNoise()" , "eat()" , "walk()"};
            Animal animal = new Dog();
            Dog dog = (Dog) animal;
            dog.makeNoise();
            dog.eat();
            dog.walk();
            `
            Animal animal1 = new Cat();
            Cat cat = (Cat) animal1;
            cat.makeNoise();
            cat.eat();
            cat.walk();

            Animal animal2 = new Tiger();
            Tiger tiger = (Tiger) animal2;
            tiger.makeNoise();
            tiger.eat();
            tiger.walk();






    }

}
