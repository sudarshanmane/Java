public class DayThree {

    static  int totalBankBalance =0;
    String name = "";
    int accno = 0;
    int mobile = 0;
    int balance = 0;

    void createAccount(String userName , int accNo,int mobileNumber,int accBalance){
        name = userName;
        accno = accNo;
        mobile = mobileNumber;
        balance = accBalance;
    };

    void displayAccountDetails(){
        System.out.println("Name =" + name);
        System.out.println("Account No =" + accno);
        System.out.println("mobile Number =" + mobile);
        System.out.println("Balance =" + balance);
    };




    public static void main(String[] args) {
        DayThree shiv = new DayThree();

        shiv.createAccount("Sudarshan",122,9370105,1000);
        shiv.displayAccountDetails();

        System.out.println("----------------->");

        DayThree shivRaj  = new DayThree();
        shivRaj.createAccount("ShivRaj",123,934052,2000);
        shivRaj.displayAccountDetails();

        totalBankBalance =10000;
        System.out.println("totalBankBalance = "  +  totalBankBalance  );



    }


}
