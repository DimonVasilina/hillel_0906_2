package ua.hillel.lessons.lesson14.initializationblock;

public class Dog {

    static String lastName;

    static {
        System.out.println("Hello world From static Block");
        lastName = "Rexovich";
    }

    private String name;
    private String breed;
    private int age;

    {
        System.out.println("Hello world");
        name = "Rex";
        breed = "Putin";
        age = 80;
    }

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
