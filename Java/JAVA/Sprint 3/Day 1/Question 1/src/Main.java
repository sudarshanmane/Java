public class Main {

        public static void main(String[] args){
            Bird b1 = new Parrot();
            b1.fly();

            Parrot parrot = (Parrot) b1;
            parrot.sing();

    }


}
