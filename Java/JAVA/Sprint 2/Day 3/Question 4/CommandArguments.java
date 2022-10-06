public class CommandArguments {

    public static void main(String[] args) {
        if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            int factorial = 1;
            for (int a = 1; a <= num; a++) {
                factorial = factorial * a;
            }
            System.out.println(" Factorials : " + factorial);
        } else if (args.length ==2) {
            int req = Math.abs(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
            int factorial = 1;
            for (int a = 1; a <=req; a++) {
                factorial = factorial * a;
            }
            System.out.println(" Factorials : " + factorial);
        }else {
            System.out.println("Error");
        }
    }
}

