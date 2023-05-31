# Singleton

Ensures a class has only one instance and provides a global point of access to it.

- Many classes require only one instance, such as thread pools, caches, dialog boxes etc.
- Singletons are better than global objects as they can be instantiated only when required.
  - Useful to avoid resource intensive class instantiation.
- Using synchronized getInstance() for retrieving singleton instance:
  - Synchronization required only while instantiating.
  - After that, every call will face overhead due to synchronization.
  - Synchronization can impact performance by factor of 100.
- If performance is not critical, synchronizing can be avoided altogether at the cost of some overhead.
- If overhead of creation and runtime aspects of singleton aren't onerous, use singletons **eagerly** instead of **lazily**.
- Use "double checked locking" to reduce synchronization overhead in getInstance()
- Multiple classloaders might end up with separate instances of same singleton.

## TO-DO

Implement choco-holic example.
