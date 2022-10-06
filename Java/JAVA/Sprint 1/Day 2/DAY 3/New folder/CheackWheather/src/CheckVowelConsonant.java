public class CheckVowelConsonant {
    char check  = 'a';
    public static  void checkVowelConsonant(char ch) {
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                 || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
             System.out.println(ch + " vowel");
     }
         else if(ch == '(' || ch == '#' || ch == '%'|| ch == '^'
                 || ch == '*' || ch == '$'  || ch == '£' || ch=='1'
                 || ch == '2' || ch == '3' || ch == '4' || ch == '5'
                 || ch =='6' ||ch=='7' || ch == '8' || ch=='9') {
         System.out.println(ch + " error");
     }
         else {
             System.out.println(ch + " consonant");
         }
     };

     public static void main(String[] args){


         checkVowelConsonant('1');
         //    result ---> 1 error

         checkVowelConsonant('a');
//         result ----> a vowel

         checkVowelConsonant('M');
//         result ----> M consonant
    };
};

