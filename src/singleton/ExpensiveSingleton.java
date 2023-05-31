package singleton;

public class ExpensiveSingleton {
    private static ExpensiveSingleton uniqueInstance;

    private ExpensiveSingleton() {}

    // synchronized forces every thread to complete its turn before entering subroutine
    // this is expensive because after initialization, every call to this method will
    // face overhead due to synchronization overhead
    public synchronized ExpensiveSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ExpensiveSingleton();
        }
        return uniqueInstance;
    }
    
}
