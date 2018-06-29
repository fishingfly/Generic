package com.zy.test;

public class Holder1 {
    public static void main(String[] args) {
        Test2 t2 = new Test2(new Automobile());
        Automobile a = (Automobile)t2.getA();
        t2.setA("not a Automobile");
        String s = (String)t2.getA();
        
        Test3<Automobile> t3 = new Test3<Automobile>(new Automobile());
        Automobile b = t3.getA();
    }
    
    
}


class Automobile {}

class Test1 {
    private Automobile a;
    public Test1(Automobile a) {
        this.a = a;
    }
    Automobile get() {
        return a;
    }
}

class Test2 {
    private Object a;
    public Test2(Object a) {
        this.setA(a);
    }
    public Object getA() {
        return a;
    }
    public void setA(Object a) {
        this.a = a;
    }
}

class Test3<T> {
    private T a;
    public Test3(T a) {
        this.setA(a);
    }
    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
}
