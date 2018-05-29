package com.foor;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        b.printA();
        b.x = 123;
        System.out.println("x:" + b.x);

    }
}
