package thread;

public class FirstThread {

  private static class MyStopThread extends Thread {

    private volatile Thread stopIndicator;

    public void start() {
      stopIndicator = new Thread(this);
      stopIndicator.start();
    }

    public void stopThread() {
      stopIndicator = null;
    }

    @Override
    public void run() {
      Thread thisThread = Thread.currentThread();
      while (thisThread == stopIndicator) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      }
    }
  }

}
