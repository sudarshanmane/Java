public class HdfcBank extends Bank{



    int interestRate = 1000;
    String homeLone = "SBANC";
    String offerCard = "BLR";

    void getYourPA(){

    }

    HdfcBank(String interest,String branchCode){
   super(branchCode);
   interest = interest;
    }

    @Override
    void withdraw(int amount){
        if(amount>0){
            super.withdraw(amount);
        }

    }


}
