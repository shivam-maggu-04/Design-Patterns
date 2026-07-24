package org.example.Singleton;

public class Calculator {
    int a;
    int b;

    private static Calculator obj;

    private Calculator(){
        System.out.println("Instance created");
    }

    public int sum(){
        return a+b;
    }

//    single thread
//    public static Calculator getInstance(){
//        if(obj == null){
//            obj = new Calculator();
//        }
//        return obj;
//    }

//    if we have multiple thread to safe singleton use synchronized
//    public  synchronized static Calculator getInstance(){
//        if( obj == null){
//            obj = new Calculator();
//        }
//        return obj;
//    }

//   Double checked locking mechanism
    public static Calculator getInstance(){
        if(obj == null) {
            synchronized (Calculator.class) {
                if (obj == null) {
                    obj = new Calculator();
                }
            }
        }
        return obj;
    }
}
