package WeekFour.GenericDemo;

public class GenericClass <DataType>{

    private DataType varName;

    public GenericClass(DataType varName) {
        this.varName = varName;
    }
    public GenericClass(){

    }

    public DataType getVarName() {
        return this.varName;
    }

    public void setVarName(DataType varName) {
        this.varName = varName;
    }


    public void addingNumber(int a , int b){
        System.out.println(a+b);

    }
}
