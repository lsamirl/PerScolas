package WeekFour.StaticClas;

public class StaticDemo {
    public static void main (String[] args){

        System.out.println(StaticClassDemo.Month);
        StaticClassDemo.Month="July";
        System.out.println(StaticClassDemo.Month);

        StaticClassDemo.go();
        StaticClassDemo obj = new StaticClassDemo();

        System.out.println(obj.st = "Ha");




    }

}
