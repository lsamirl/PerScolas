import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public void Arr01() {
        System.out.println("\nOut put example 01 =" );
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i : arr) {

            System.out.print(i + ", ");
        }
    }
    public void Arr02() {
        System.out.println("\nOut put example 02 =" );
        int arr[] = {13,5,7,68,2};

       int s= arr.length/2;

            System.out.print(arr[s]);

    }
    public void Arr03() {
        System.out.println("\nOut put example 03 =" );
        String arr[] = {"red", "green", "blue", "yellow"};
        for (String i: arr
             ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        String NewArr[] = arr.clone();
        System.out.println(Arrays.toString(NewArr));

        System.out.println(arr==NewArr);

    }
    public void Arr04() {
        System.out.println("\nOut put example 04 =" );
        int arr []={23,13,72,1,59};

        System.out.println("The first element on the Array= "+arr[arr.length-(arr.length)]
                + " \nThe last element on the Array =" + arr[arr.length-1]);

      /*  System.out.println(arr[arr.length]);
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at ArraysDemo.Arr04(ArraysDemo.java:41)
        at ArraysDemo.main(ArraysDemo.java:112) */
    }
    public void Arr05() {
        System.out.println("\nOut put example 05 =" );
        int i=0;

        int arr[] = {44, 65, 32, 1, 9, 6};
             while(arr.length>i){
            System.out.print(arr[i] + ", ");
            i++;
        }

    }

    public void Arr06() {
        System.out.println("\nOut put example 06 =" );
        int i=0;
        int arr[] = {26, 77, 15, 29, 14, 81};

        while(arr.length>i){
            int a = arr[i]*2;
            System.out.print(a + ", ");
            i++;
    }
    }

    public void Arr07() {
        System.out.println("\nOut put example 07 =" );
        int arr[] ={78,22,94,0,13};

        for (int i : arr
             ) {


            if (i==arr[arr.length/2]){
                continue;
            }
            System.out.println(i);
        }

        }

    public void Arr08() {
        System.out.println("\nOut put example 08 =" );
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a number = ");
         ;
        int arr []=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value of arr " + i);
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sw = arr[0];
        arr[0] = arr[arr.length/2];
        arr[arr.length/2]=sw;
        System.out.println("Array in ascending order: "+Arrays.toString(arr));
    }

    public void Arr09() {
        System.out.println("\nOut put example 09 =" );

        int arr[] = {4,2,9,13,1,0};

        int big = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > big)
            {
                big = arr[i];
            }
        }
        System.out.println("The biggest number : " + big);

        int sml = arr[0];

        for(int j = 1; j < arr.length; j++)
        {
            if(arr[j] < sml)
            {
                sml = arr[j];
            }
        }
        System.out.println("The smallest number : " + sml);
    }


    public void Arr10() {
        System.out.println("\nOut put example 10 =" );

    Object[] arr = {2021, "Yellow", "Green", "Blue", 20.21};

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args){

        ArraysDemo obj = new ArraysDemo();
        obj.Arr01();
        obj.Arr02();
        obj.Arr03();
        obj.Arr04();
        obj.Arr05();
        obj.Arr06();
        obj.Arr07();
        obj.Arr08();
        obj.Arr09();
        obj.Arr10();

    }
}
