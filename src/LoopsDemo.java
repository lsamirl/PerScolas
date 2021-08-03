public class LoopsDemo {
    public void programOne(){
        System.out.println("Java is good one ");
    }
    public void programTwo(){
        System.out.println("Java is good two");
    }
    public void programThree(){
        System.out.println("Java is good three");
    }
    public static void main(String[] args){
        LoopsDemo P1= new LoopsDemo(); P1.programOne();
        LoopsDemo P2= new LoopsDemo(); P2.programTwo();
        LoopsDemo P3= new LoopsDemo(); P3.programThree();

        System.out.println("---------object--" + P1.toString());
    }
}
