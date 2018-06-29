package com.zy.test;

public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }
    
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
    
    
    
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}


class CountedObject {
    private static long counter = 0;
    private final long id = counter++;// 用于记录创建对象的次数
    public long getId() {
        return id;
    }
    public String toString() {
        return "CountedObject" + id;
    }
}

