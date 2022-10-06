public class StringMutable {



//       Q2: Why String is immutable in java and what is the difference between String and String Builder? And
//       write some of the methods of String class at least 5 with example.
//
//        In the String constant pool, a String object is likely to have one or many references
//        If several references point to the same String without even knowing it,
//        it would be bad if one of the references modified that String value.
//        That's why String objects are immutable.
//
//       difference between String and StringBuffer;
//        1)String:
//
//                1)Slow as compared to StringBuilder
//                during frequent updates and
//                concatening.
//                2)The string created using the String
//                class is immutable.
//                3)An object of String is read-only in
//                nature.
//
//        2)StringBuffer;
//                1)Fast as compared to String. Like it is
//                 faster than String while concatenating
//                  many strings together in a loop.
//                 2)The string created using StringBuilder is
//                   mutable.
//                 3)An object of StringBuilder is dynamic in
//                   nature
//
//        3) Methods Of String Class:
//        Example1)CharAt();
//            String one = "one";
//                 System.out.println(one.charAt(2));
//            output: e ;
//
//            Example 2)concat();
//            String one = "one";
//            String two = "two";
//                    System.out.println(one + two);
//
//            output: onetwo;
//
//
//            Example 3)String substring()
//            String one = "onetwo";
//
//                System.out.println(one.substrin(3));
//
//            output: ewo;
//
//            Example 4)String toLoweCase()
//            String one = "ONE";
//
//                System.out.println(one.toLoweCase());
//
//            output: one;
//
//            Example 5)String toUpperCase()
//            String one = "one";
//
//                 System.out.println(one.toLoweCase());
//
//            output: ONE;
//
//
//
//
//
//
//
//
//}

}
