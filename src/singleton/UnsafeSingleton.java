package singleton;

public class UnsafeSingleton {
    private static UnsafeSingleton uniqueInstance;

    private UnsafeSingleton() {}

    public static UnsafeSingleton getInstance() {
        if(uniqueInstance == null) {
            // will fail in case of multiple threads and return more than one instance here.
            uniqueInstance = new UnsafeSingleton();
        }
        return uniqueInstance;
    }
}
