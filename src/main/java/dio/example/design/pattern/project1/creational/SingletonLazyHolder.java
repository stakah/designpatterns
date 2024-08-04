package dio.example.design.pattern.project1.creational;

public class SingletonLazyHolder {
    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstance() {
        return Holder.instance;
    }
}
