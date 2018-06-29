package com.zy.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
？是通配符也可理解为占位符
泛型限定
? extends E:可以接收E类型或者E的子类型。上限
? super E:可以接受E类型或者E的父类型。下限

 */

public class GenericDemo4 {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person("S"));
        al.add(new Person("a"));
        al.add(new Person("b"));
        printColl(al);
        ArrayList<Student1> all = new ArrayList<Student1>();
        all.add(new Student1("S"));
        all.add(new Student1("a"));
        all.add(new Student1("b"));
        printColl(all);
        
        
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("122");
//        al.add("123");
//        al.add("124");
//        printColl(al);
//        ArrayList<Integer> all = new ArrayList<Integer>();
//        all.add(4);
//        all.add(5);
//        all.add(6);
//        printColl(all);
//        printColl(all);//明显是类型不匹配，那怎么用一个函数对所有的类型的集合都起作用呢？
    }
    
//    public static void printColl(ArrayList<String> al) {
//        Iterator<String> it = al.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
//    public static void printColl(ArrayList<?> al) {//用占位符解决类型问题，当然你把占位符换成T也是可以的，
////        但是T算是一种类型了，?是不明确类型的
//        Iterator<?> it = al.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
    
//    public static void printColl(ArrayList<Person> al) {//如果这边既要求使用person又要使用student，那怎办
//        Iterator<Person>it = al.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().getName());
//        }
//    }
    public static void printColl(ArrayList< ? extends Person > al) {//这就是泛型限定
        Iterator<? extends Person>it = al.iterator();
        while (it.hasNext()) {
            System.out.println((it.next()).getName());
        }
    }

}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class Student1 extends Person {

    Student1(String name) {
        super(name);
    }
    
}

