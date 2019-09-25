package org.firstinspires.ftc.teamcode;

public class JavaLearning_Conditional {
    public static void main (String[] args){
        /*
        Java conditional statements operators

        < : less than

        > : greater than

        <= : less then or equal to

        >= : greater then or equal to

        == : equal to| e.g: a == b

        != : not equal to| e.g: a != b

         */

    /*
    Java Conditional Logic

    && : means and, both values need to be true

    || : means or, only one value or more needs to be correct to run this set of code.

    ! : means not, so it is like a negation. Changes value from True to False, and False to True.
     */
        boolean isItRaining = false;

        boolean snowing = true;

        if (isItRaining == true){
            System.out.println("It's raining");
        }

        else if (isItRaining == false && snowing == true){
            System.out.println("It's snowing");
        }

        else if (isItRaining == true || snowing == true){
            System.out.println("The weather is cold");
        }

        else if (!(isItRaining == true)){
            System.out.println("It's not raining");
        }

        else {
            System.out.println("It's sunny outside");
        }

    }
}
