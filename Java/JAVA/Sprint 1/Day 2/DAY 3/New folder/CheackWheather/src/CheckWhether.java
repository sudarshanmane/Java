public class CheckWhether {


    boolean isSnowing = false;
    boolean isRaining = true;
    double temperature = 60.0;

       void changeValues(boolean snow,boolean rain,double temp){
           isSnowing = snow;
           isRaining = rain;
           temperature = temp;
       };


    public static void main(String[] args) {

        CheckWhether object = new CheckWhether();

        object.changeValues(false,false,70.00);

        if(object.isRaining == true || object.isSnowing ==true || object.temperature <50.00){
            System.out.println("Let’s stay home." );
        }
        else{
            System.out.println("Let’s go out!");
        }

    }
};


