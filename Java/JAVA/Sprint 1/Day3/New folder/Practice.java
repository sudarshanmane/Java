public class Practice {

    String printCity( String city){

         switch(city){
             case "Mumbai" : return "Financial";
             case "Delhi" : return "Capital";
             case "Kolkata" : return  "Joy";
             case  "Goa" : return  "Beach";
             default: return "city not found";
         }
    };


    public static void main(String[] args) {

        Practice object = new Practice();
        System.out.println(object.printCity("Delhi"));
    }



};
