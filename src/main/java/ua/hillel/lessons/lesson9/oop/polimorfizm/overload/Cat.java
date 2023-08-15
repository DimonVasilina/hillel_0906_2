package ua.hillel.lessons.lesson9.oop.polimorfizm.overload;

public class Cat extends Animal {

    public String name;
    @Override
    public void sound() {
        System.out.println("May");
    }

     void aboutCat() {
        sayAnimalName("Marysia");
        sound();
    }
}
