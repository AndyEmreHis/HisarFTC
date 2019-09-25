package org.firstinspires.ftc.teamcode;

//Single line comment

/*
Multi Line
Comment
 */

public class JavaLearning {

    public static void main (String[] args){

        System.out.println("Hello World");

        int TestNum = 16; // int = Intiger. Same as math. Can have + or - values.

        double TestDouble = 1.25; // Double = decimal point numbers. Ondalik sayi.

        String TestString = "This is a string";// Represented with "". Strings are used to keep characters or words. Numbers in strings cannot be operated on.

        System.out.println("1" + "1");

        System.out.println(1 + 1);

        boolean TestBool = true; // boolean = bool. Can hold a value of true of false.

        boolean isItRainingOutside = false;

        char TestChar = 'A';// Represented with ''. Can only store a single character.

        float TestFloat = 1.54f;//Represented with an f in the end of the number.Generally doubles are preferred over floats. Because doubles give more accurate data.


        // Java arithmetic

        /*
        Same as

        int x;

        x = 5
         */
        int x = 5;

        int y = 2;

        int sumOfNums = x + y;  // toplama islemi. + ile gosterilir.
        System.out.println("5 " + "+ " + "2 " + "= " + sumOfNums);

        int subOfNums = x - y; // cikarma islemi. - ile gosterilir
        System.out.println("5 " + "- " + "2 " + "= " + subOfNums);

        int multOfNums = x * y; // carpma islemi, * ile gosterilir
        System.out.println("5 " + "* " + "2 " + "= " + multOfNums);

        int divOfNums = x / y; // bolme islemi. / ile gosterilir
        System.out.println("5 " + "/ " + "2 " + "= " + divOfNums);

        int modOfNums = x % y; // mod alma. bolme islemindeki kalani almaktir. % ile gosterilir.
        System.out.println("5 " + "% " + "2 " + "= " + modOfNums);







    }
}
