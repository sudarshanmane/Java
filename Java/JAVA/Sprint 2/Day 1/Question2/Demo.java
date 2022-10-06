public class Demo {
        Demo(){
            this("one");
            System.out.println("I am first Demo");
        }
      public   Demo(String s){
          this(10);
           System.out.println("I am Second Demo");
        }

         Demo(int i){
             this(10.1f);
            System.out.println("I am third Demo");
        }
        Demo(float f){
            System.out.println("I am fourth Demo");
        }


        public static  void main(String[] args) {

            Demo object= new Demo();

        }





}
