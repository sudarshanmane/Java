package Assignments;

public class Multiarray {

    public static void main(String[] args) {

        int[][] multi = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int sum  = 0;

        for(int a =0;a<multi.length;a++){
            for(int i = 0; i< multi[0].length ; i++){
                sum = sum + multi[a][i];
            }
        }
        System.out.println(sum + Integer.parseInt("10"));

    }
}
