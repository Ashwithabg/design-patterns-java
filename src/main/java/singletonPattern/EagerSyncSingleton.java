package singletonPattern;

public class EagerSyncSingleton {
    private volatile static EagerSyncSingleton uniqueInstance;

    private EagerSyncSingleton() {
    }

    //double check locking
    public static EagerSyncSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized ((EagerSyncSingleton.class)) {
                if (uniqueInstance == null) {
                    uniqueInstance = new EagerSyncSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
