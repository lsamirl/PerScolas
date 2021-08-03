package WeekFour.GenericDemo;

import java.util.Arrays;

public class GenMethod {

    public int myMethod(int a){
        int b =a;
        return b;
    }

    public double myMethod(double a){
        double b =a;
        return b;
    }

    public <DataType> void genericDisplay(DataType a){
        System.out.println(a);
    }
    public static <Data> void staticDisplay(Data b){
        System.out.println(b);
    }
    public <DataIntry> void printArray(DataIntry[] E){

        System.out.println(Arrays.toString((E)));

        /* for (DataIntry item:E
             ) {
            System.out.println(item); }*/
    }


}

