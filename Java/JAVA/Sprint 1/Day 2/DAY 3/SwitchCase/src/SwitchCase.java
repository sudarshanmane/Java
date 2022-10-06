public class SwitchCase {


    static String city(String X) {

        switch(X) {
            case "Mumbai":
                return "Financial City";
//                break;
            case "Kolkata":
                return "City of Joy";
//                break;
            case "Delhi":
                return "Capital of the country";
//                break;
            case "Bangalore":
                return "Cyber City";
//                break;
            default:
                return "May be Other Indian City";
        }

    };

    public static void main(String[] args) {

        System.out.println(city("Delhi"));


    };




}


