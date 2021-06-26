package com.example;

public class ArrayTest {

    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(1, 0);
        array.insert(2, 1);
        array.insert(3, 1);
        array.insert(0, 1);
        array.insert(5, 1);
        array.insert(8, 1);
        array.printAll();
        System.out.println(array.getSize());
        array.delete(0);
        array.delete(5);
        array.printAll();
        System.out.println(array.getSize());
        System.out.println(array.find(3));
        System.out.println(array.find(6));
    }
}
