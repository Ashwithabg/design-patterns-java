package singletonPattern;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();

        SyncSingleton syncSingleton = SyncSingleton.getInstance();


    }
}
