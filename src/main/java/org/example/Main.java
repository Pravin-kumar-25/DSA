package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCircularDeque obj = new MyCircularDeque(3);
        obj.insertFront(9);
        System.out.println(obj.getRear());
        obj.insertFront(9);
        System.out.println(obj.getRear());
        obj.insertLast(5);
        System.out.println(obj.getFront());
        System.out.println(obj.getRear());
        System.out.println(obj.getFront());
        System.out.println(Arrays.toString(obj.getArray()));
        obj.insertLast(8);
        System.out.println(Arrays.toString(obj.getArray()));

        obj.deleteLast();
        System.out.println(Arrays.toString(obj.getAll()));

        System.out.println(Arrays.toString(obj.getArray()));
        System.out.println(obj.getFront());

        System.out.println(Arrays.toString(obj.getArray()));
    }
}