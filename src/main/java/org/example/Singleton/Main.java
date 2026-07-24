package org.example.Singleton;

public class Main {
    public static void main(String[] args) {

//        single thread
//        Calculator c1 = Calculator.getInstance();
//        Calculator c2  =  Calculator.getInstance();
//
//        c1.a = 10;
//        c1.b = 5;
//
//        c2.a = 7;
//        c2.b =3;
//
//        System.out.println(c1.sum()); // o/p: 10
//        System.out.println(c2.sum()); //o/p: 10

//        multiple thread
        Thread t1 = new Thread(() -> {
            Calculator.getInstance();
        });

        Thread t2 = new Thread(() ->{
            Calculator.getInstance();
        });

        t1.start();
        t2.start();

    }
}
