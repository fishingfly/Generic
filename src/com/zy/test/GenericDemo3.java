package com.zy.test;

//泛型定义在接口上
interface Inter<T> {
    void show(T t);
}

//class InterImpl implements Inter<String> {
//    public void show(String t) {
//        System.out.println("show" + t);
//    }
//}


class InterImpl<T> implements Inter<T> {//我们想指定什么类型就指定什么类型+
    public void show(T t) {//这个类的类型不固定了
        System.out.println("show" + t);
    }
}

public class GenericDemo3 {
    public static void main(String[] args) {
//        InterImpl i = new InterImpl();
//        i.show("asdasda");
        InterImpl<Integer> i = new InterImpl<Integer>();
        i.show(4);
    } 
}
