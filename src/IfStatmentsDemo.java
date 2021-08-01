public class IfStatmentsDemo {

    public void loops1(){
        System.out.println("Out put example 01 =" );
        for (int i = 0; i < 10; i++) {
            System.out.println("I = " + i);
        }
    }
    public void loops2(){
        System.out.println("Out put example 02 =" );
        int v=10;
        while( v<=100){
            System.out.println(v);
            v=v+10;
        }
    }

    public void loops3(){
        System.out.println("Out put example 03 =" );
        int t=1;
        do {
            System.out.println("t=" + t);
            t++;}
        while (t<=10);
        }

    public void loops4(){
        System.out.println("Out put example 04 =" );
        for (int i=0; i<=100; i++)
        {
            if (i %5 == 0){
                if (i>25 && i<75){
                    continue;
                }
                System.out.println("Print  i=" + i);
            }
        } }

    public void loops5(){
        System.out.println("Out put example 05 =" );
        for (int i=0; i<=100; i++)
        {
            if (i %5 == 0){
                if (i>50){
                    break;
                }
                System.out.println("Print  i=" + i);
            }
        }

    }

    public void loops6(){
        System.out.println("Out put example 06 =" );
        for (int i = 0; i <1; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.println("Day " +j);
            }
            System.out.println("Week 2 :");
            for (int h = 1; h <= 5; h++) {
                System.out.println("Day " +h);
                    }
                }
            }
    public void loops7(){
        System.out.println("Out put example 07 =" );
        for (int i = 10; i <200 ; i++)
            {
                int temp = i;
                int sum =0;
                int numb = i;

                    while(temp>0) {
                        int r   = temp % 10;
                        sum     = sum * 10 + r;
                        temp    = temp / 10;
                    }
                if(numb == sum){
                    System.out.print((numb+ ", "));
                }
            }
                System.out.println();
            }

    public void loops8(){
        System.out.println("Out put example 08 =" );

        int f1=0,f2=1,f3,i,fub=10;

        System.out.print(f1+", "+f2+", ");

        for(i=2;i<fub;++i)
        {
            f3=f1+f2;
            System.out.print(f3+", ");
            f1=f2;
            f2=f3;
        }
    }

    public static void main(String[]agrs){

        IfStatmentsDemo Loo = new IfStatmentsDemo();
        Loo.loops1();
        Loo.loops2();
        Loo.loops3();
        Loo.loops4();
        Loo.loops5();
        Loo.loops6();
        Loo.loops7();
        Loo.loops8();


    }
}
