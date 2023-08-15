package ua.hillel.lessons.lesson7;

public class Practice {

//    Написать программу, в которой создаётся целочисленный массив из 8 случайных чисел
//    из диапозона  [0, 100] и выводит максимальный элемент массива в консоль.

    public static void main(String[] args) {

        int max = 0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element = " + max);
    }
}
