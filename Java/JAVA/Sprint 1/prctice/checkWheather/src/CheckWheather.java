public class CheckWheather {

    boolean isRaining;
    boolean isSnowing;
    double temprature;

    void add(boolean snow ,boolean rain ,double temp){
        isSnowing = snow;
        isRaining = rain;
        temprature = temp;

    };
    void printadd(){

        if(isSnowing == true || isRaining == true || temprature<50.00){
            System.out.println("Lets stay home");
        }else{
            System.out.println("Let’s go out!");
        };
    }



    public static void main(String[] args) {
        CheckWheather object = new CheckWheather();
        object.add(false,false,40);
        object.printadd();
    };
};
