package test;

public class MyDataImpl implements MyData {

  public boolean isNull(String str) {
    System.out.println("Impl Null Check");

    return str == null ? true : false;
  }

  public static void main(String args[]) {
    /*MyDataImpl obj = new MyDataImpl();
    obj.print("");
    obj.isNull("abc");

    boolean result = MyData.isNull("abc");*/

    Persion p1 = new Persion("abc1", 1);
    Persion p2 = new Persion("abc2", 1);
    if (p1 == p2) {
      System.out.println("true");
    }

    /**
     *
     * == compares object references, it checks to see if the two operands point to the same object (not equivalent objects, the same object).
     *
     * If you want to compare strings (to see if they contain the same characters), you need to compare the strings using equals.
     *
     * In your case, if two instances of MyClass really are considered equal if the strings match, then:
     *
     * public boolean equals(Object object2) {
     *     return object2 instanceof MyClass && a.equals(((MyClass)object2).a);
     * }
     * ...but usually if you are defining a class, there's more to equivalency than the equivalency of a single field (a in this case).
     *
     * Side note: If you override equals, you almost always need to override hashCode. As it says in the equals JavaDoc:
     *
     * Note that it is generally necessary to override the hashCode method whenever this method is overridden,
     * so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.
     * */

  }
}
