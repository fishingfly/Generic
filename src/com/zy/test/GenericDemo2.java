package com.zy.test;

//class Demo<T> {//泛型类定义的泛型，在整个类有效，如果被方法使用，泛型类
//的对象明确要操作的具体类型后，所有要操作的类型就已经确定了
//    public void show(T t) {
//        System.out.println("show:"+t);
//    }
//    public void print(T t) {
//        System.out.println("print:"+t);
//    }
//}

//为了不同方法可以操作不同类型，而且类型还不确定，可以将反省定义在方法上。
class Demo {
    public <T> void show(T t) {
        System.out.println("show:" + t);
    }
    
    public <T> void print(T t) {//两个方法上的T是不一样的
        System.out.println("print:" + t);
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
//        Demo<Integer> d = new Demo<Integer>();//创建对象时已经指定类型了
//        d.show(new Integer(7));//如果要使用String类型时，又要重新指定类型，这就是泛型类的局限性
        Demo d = new Demo();
        d.show("aaa");
        d.show(new Integer(0));
        d.print(new Integer(90));
    }
}
