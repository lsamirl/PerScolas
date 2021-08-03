import java.util.Arrays;

public class Student {
private  String name;
private int Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public static void main(String[] args) {
        Student S = new Student();

        System.out.println(S.toString());
    }

}
