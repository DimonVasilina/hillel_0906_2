package ua.hillel.lessons.lesson11.superwithconstructor;

public class A {

    int value;

    public A() {
    }

    public A(int value) {
        System.out.println("Метод построения A c параметром " + value);
        this.value = value;
    }

    public void sayHello() {
        System.out.println("Hello " + this.value);
    }
}
