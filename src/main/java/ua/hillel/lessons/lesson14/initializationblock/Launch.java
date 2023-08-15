package ua.hillel.lessons.lesson14.initializationblock;

public class Launch {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", "Spitz", 5);
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getAge());
        System.out.println("----------------------");
        System.out.println(Dog.lastName);
    }
}
