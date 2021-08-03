
package GenericDemo;

public class Runner {
    public static void main(String[] args) {
        GenMethod g = new GenMethod();
        g.genericDisplay("Samir");
        g.genericDisplay(2000);
        g.genericDisplay(12.36);
        g.genericDisplay(26.55f);
        System.out.println("==============");
        GenMethod.staticDisplay("Hachemi");
        GenMethod.staticDisplay(43);
        GenMethod.staticDisplay(2.9f);
        System.out.println("==============");
        String[]st = {"A","B","C"};
        g.printArray(st);
        Integer[] intArr ={1,2,3,4,5,6};
        g.printArray(intArr);
        System.out.println("==============");
        GenericClass obj = new GenericClass();
        obj.setVarName("Per-Scolas");
        System.out.println(obj.getVarName());
        obj.setVarName(2021);
        System.out.println(obj.getVarName());
        obj.setVarName(false);
        System.out.println(obj.getVarName());


        GenericClass<String> objSt = new GenericClass<>();
        objSt.setVarName("I'm is here");
        System.out.println(objSt.getVarName());
        GenericClass<Double> objDou = new GenericClass<>();
        objDou.setVarName(3.14);
        System.out.println(objDou.getVarName());
        GenericClass<Integer> objIn = new GenericClass<>();
        objIn.setVarName(2005);
        System.out.println(objIn.getVarName());



    }
}
