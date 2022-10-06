public class SumNatural {

    int printSumNaturalNumbers(int number){
        return  number*(number+1)/2;
    }

    public static void main(String[] args) {

        SumNatural object = new SumNatural();
        System.out.println(object.printSumNaturalNumbers(5));

    }

}
