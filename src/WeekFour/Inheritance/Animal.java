package WeekFour.Inheritance;

class Animal extends LivingThings{
    String Name;
    int Age;
    String eat;
    String sound;
    String walk;
    String color;

    public Animal(String name, int age, String color) {
        Name = name;
        Age = age;
        this.color = color;
    }

    public void eat(){

        this.eat="Yes this animal can eat";  }



}
