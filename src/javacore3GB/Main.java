package javacore3GB;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);

        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Box<Orange> orangeBox = new Box<>();

        appleBox.boxFritAdd(apple1);
        appleBox.boxFritAdd(apple2);

        orangeBox.boxFritAdd(orange1);

        System.out.println(appleBox.compare(orangeBox));

    }

    // 1 задание
    public static void swapIndex(int[] arr, int indexOne, int indexTwo) {
        if (indexOne > arr.length | indexTwo > arr.length) {
            System.out.println("Введены некоректные данные");
            return;
        }

        int a = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = a;
    }

    // 2 задание
    public static <T> void swapArrToList(T[] arr, List<T> list) {
        list.addAll(Arrays.asList(arr));
    }

}
