public class CricketScore {

    static int returnTotal(int one, int two,int three ,int four,int six){
        int total = 0;
        total += one*1 + two*2 + three*3 + four*4 + six*6;
        return total;
    };

    public static void main(String[] args) {
        System.out.println(returnTotal(1,1,1,1,1));
    }

};
