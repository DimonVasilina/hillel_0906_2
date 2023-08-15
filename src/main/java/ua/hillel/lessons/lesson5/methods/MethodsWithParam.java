package ua.hillel.lessons.lesson5.methods;

public class MethodsWithParam {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
        String name1 = "Oleg";
        String name22 = "Sasha";

        sayName(name1, name22);

        sayNameAndAge("Alex", 35);
    }

    public static void sayNameAndAge(String name, int age) {
        if(age == 33){
            System.out.println(name + " " + age);
        } else {
            System.out.println("Не знаю такой возраст ");
        }
    }

    public static void sayName(String name, String name2) {
        System.out.println(name + ", " + name2);
    }

    public static int sum(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }
}
