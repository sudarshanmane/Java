public class CricketScore {


    int printResults(int one ,int two,int three ,int four ,int six){
        return one*1 + two*2 + three*3 + four*4 + six*6;
    };




    public static void main(String[] args) {

        CricketScore object = new CricketScore();
        System.out.println(object.printResults(20,5,10,2,1));
    };


};
