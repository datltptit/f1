class Order {
  private static int counter = 0;
  private final String code;

  Order() {
    counter++;
    this.code = String.format("DH%05d", counter);
  }
                                                                                                 ''
  static int getCounter() { return counter; }
}

public class p1 {
  public static void main(String[] args) {
    new Order();
    new Order();
    System.out.println(Order.getCounter());
  }
}
