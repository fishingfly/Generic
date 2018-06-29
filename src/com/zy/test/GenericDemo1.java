package com.zy.test;

/**
泛型是jdk1.5后的新特性。用于解决安全问题，是一个类型安全机制

好处:
1、将运行时期出现问题ClassCastException，转移到了编译时期
2、避免强制转换麻烦。
泛型格式：通过<>来定义要操作的引用数据类型
在使用java提供的对象，在集合框架中很常见。
什么时候使用泛型类
当类中要操作的引用数据类型不确定的时候
早期多是定义Object来完成拓展
现在定义反省来完成拓展
 */
public class GenericDemo1 {
    
    public static void main(String[] args) {
//        Tool t = new Tool();
//        t.setObj(new Worker());
//        t.setObj(new Student());
//        Worker w = (Worker) t.getObj();
        Utils<Worker> u = new Utils<Worker>();//指定类型worker
        u.setT(new Worker());
//        u.setT(new Student());//让问题呈现在编译时期
        Worker w = u.getT();
    }

}

class Worker {
    
}

class Student {
    
}

//泛型类
class Utils<T> {//让使用者来指定使用哪种类型的对象
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}

class Tool {
    private Object obj;
    
    public Object getObj() {
      return obj;
    }
    
    public void setObj(Object obj) {
      this.obj = obj;
    }
}

//class Tool {//一个类对应一个工具类会很麻烦，需要提高可拓展性
//    private Worker worker;
//
//    public Worker getWorker() {
//        return worker;
//    }
//
//    public void setWorker(Worker worker) {
//        this.worker = worker;
//    }
//    
//}
