package ua.hillel.lessons.lesson9.oop.polimorfizm.overload;

public class Cow extends Animal {

    @Override
    public void sound() {
        System.out.println("Myyyy");
    }

    public void aboutCow() {
        sayAnimalName("butionka");
        sound();
    }
}
