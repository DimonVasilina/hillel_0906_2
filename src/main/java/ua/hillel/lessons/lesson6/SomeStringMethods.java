package ua.hillel.lessons.lesson6;

public class SomeStringMethods {
    public static void main(String[] args) {
        parseIntExample();

    }

    public static void parseIntExample() {
        String actual = "3436";
        int num = Integer.parseInt(actual);
        Integer num2 = Integer.valueOf(actual);
        System.out.println(num == 1);
    }

    public static void valueOfExample() {
        String actual = "3436";
        int expected = 3436;
        String expectedStr = String.valueOf(expected);
        System.out.println(actual.equals(expectedStr));
    }

    public static void lastIndexOfExample() {
        String str = "hello, my name is Alex";
        System.out.println(str.indexOf("my"));
        System.out.println(str.lastIndexOf("le"));
    }

    public static void equalsIgnoreCaseExample(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Str are equals");
        } else {
            System.out.println("Str doesn't equals");
        }
    }

    public static void equalsExample(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Str are equals");
        } else {
            System.out.println("Str doesn't equals");
        }
    }
}
