package singletonPattern;

public class SyncSingleton {
    private static SyncSingleton uniqueInstance;

    private SyncSingleton() {
    }

    //make thread safe
    public static synchronized SyncSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SyncSingleton();
        }
        return uniqueInstance;
    }
}
