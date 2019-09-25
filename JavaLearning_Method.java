package org.firstinspires.ftc.teamcode;

public class JavaLearning_Method {
    public static void main(String[] args){

        Addition(1, 2);

        System.out.println(Addition(1,2));

        int z = 5;

        ChangeValue(z);

        System.out.println("original z value " + z);

    }

    public static int Addition(int x, int y){

     int AddValue = x + y;

     System.out.println(AddValue);

     return AddValue;

    }

    public static void ChangeValue(int z){

        z = z+1;

        System.out.println("changed z value " + z);

    }
}
