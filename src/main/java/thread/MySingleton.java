package thread;

public final class MySingleton {

  private static volatile MySingleton instance = null;

  private MySingleton() {
  }

  public static MySingleton getInstance() {
    if (instance == null) {
      synchronized (MySingleton.class) {
        if (instance == null) {
          instance = new MySingleton();
        }
      }
    }
    return instance;

  }
}
