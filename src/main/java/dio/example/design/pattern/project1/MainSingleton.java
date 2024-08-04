package dio.example.design.pattern.project1;

import dio.example.design.pattern.project1.creational.SingletonEager;
import dio.example.design.pattern.project1.creational.SingletonLazy;
import dio.example.design.pattern.project1.creational.SingletonLazyHolder;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(String.format("SingletonLazy:%s", singletonLazy));
        System.out.println(String.format("SingletonEager:%s", singletonEager));
        System.out.println(String.format("SingletonLazyHolder:%s", singletonLazyHolder));

        System.out.println("--------------------------");
        singletonLazy = SingletonLazy.getInstance();
        singletonEager = SingletonEager.getInstance();
        singletonLazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(String.format("SingletonLazy:%s", singletonLazy));
        System.out.println(String.format("SingletonEager:%s", singletonEager));
        System.out.println(String.format("SingletonLazyHolder:%s", singletonLazyHolder));

    }
}