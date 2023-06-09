package singleton;

public class DoubleCheckedLockingSingleton {
    // volatile signifies that variable may be accessed by multiple threads and should not be cached locally
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;
    
    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
