package ua.hillel.lessons.lesson14.classes.inner.aninymous;

public class Launch {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String sayHello() {
                return "Hello World";
            }
        });

    }
}
