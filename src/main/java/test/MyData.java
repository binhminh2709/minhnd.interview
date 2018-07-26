package test;

public interface MyData {

  static boolean isNull(String str) {
    System.out.println("Interface Null Check");

    return str == null ? true : "".equals(str) ? true : false;
  }

  default void print(String str) {
    if (!isNull(str)) {
      System.out.println("MyData Print::" + str);
    }
  }
}
