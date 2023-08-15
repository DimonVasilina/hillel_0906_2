package ua.hillel.lessons.lesson5.methods;

public class MethodsStr {
    public static void main(String[] args) {
        stringReplace();
    }

    public static void stringReplace() {
        String str = "Hello Alex";
        String str2 = str.replace("Alex", "Maks");
        System.out.println(str2);
    }

        public static void stringSubstring() {
        String str = "Hello World";
        System.out.println(str.substring(str.indexOf(" ")).trim());
    }

    public static void stringIndexOf() {
        String str = "Hello World";
        System.out.println(str.lastIndexOf("o"));
    }

    public static void stringCharAt() {
        String str = "Hello World";
        char returnedChar = str.charAt(1);
        System.out.println(returnedChar);
    }

    public static void stringContains() {
        String str = "Hello World";
        if (str.contains("world")) {
            System.out.println("Str are contains");
        } else {
            System.out.println("Str aren't contains");
        }
    }

    public static void stringEquals(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("Str are equals");
        } else {
            System.out.println("Str aren't equals");
        }
    }

    public static void stringToUppercase() {
        String str = "Hello World".toUpperCase();
        System.out.println(str);
    }

    public static void stringEndsWith() {
        String str = "Hello World";
        boolean end1 = str.endsWith("World");
        boolean end2 = str.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);
    }

    public static void stringTrim() {
        String str = "     Hello    ";
        System.out.println(str);
        System.out.println(str.trim());
    }

    public static void stringConcat() {
        String str = "Hello ";
        String str2 = "Maks";
        String result = str.concat(str2);
        System.out.println(result);
    }

    public static void stringLength() {
        String str = "Hello world ";
        System.out.println(str.length());
    }
}
