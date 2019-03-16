package pl.sda.patterns.creational.singleton;

public class EagerInitializedSingleton {

    private static final PropertyLoader instance = new PropertyLoader();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static PropertyLoader getInstance() {
        instance.init();
        return instance;
    }
}
