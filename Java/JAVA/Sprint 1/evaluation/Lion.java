public class Lion {

    static int totalDeaths;



    void thinking(boolean isHungry,String name,int age){
        if(isHungry==false){
            System.out.println( name + " is sleeping");

        }
        else if( isHungry == true && age>12) {
            totalDeaths = totalDeaths + 2;
            System.out.println((name  + " has eaten two animal"));

        } else if (isHungry=true && age<=12 && age >=2){

            totalDeaths  = totalDeaths + 1;
            System.out.println( name +" has eaten one animal");

        }
        else if(isHungry=true && age<=2) {
            System.out.println(name + " is calling Mom");
        }


    }

    static  void printKillings(){
        System.out.println("Total killings by lions in jungle = " + totalDeaths);
    }


    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Lion lion3 = new Lion();

        lion1.thinking(true,"Lion1",13);
        lion2.thinking(false,"lino2",14);
        lion2.thinking(true,"lino2",14);
        lion3.thinking(true,"lino3",11);

        printKillings();


    }


}
