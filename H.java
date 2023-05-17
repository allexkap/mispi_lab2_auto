class H {
  int f2;
  int f17;
  int f33;
  int f40;
  int f34;
  long f38;
  long f23;
  long f30;
  int[] f18 = {1, 3, -1, 3, 3};
  int[] f14 = {-2, -1, 2, 3, -3};
  int[] f4 = {2, 3, -3, 0};
  static int f21;
  static int f8;
  static int f35;
  static int f31;
  static int f20;
  public H() {
    f2 = 1;
    f17 = 9;
    f33 = 4;
    f40 = 6;
    f34 = 1;
    f38 = 7L;
    f23 = 5L;
    f30 = 9L;
  }
  public void f36() {
    System.out.println("метод f36 в классе H");
    System.out.println(f33 >> 1);
  }
  public void f27() {
    System.out.println("метод f27 в классе H");
    System.out.println(f40 + 5);
  }
  public void f25() {
    System.out.println("метод f25 в классе H");
    System.out.println(f8++);
  }
  public void f26() {
    System.out.println("метод f26 в классе H");
    System.out.println((int)f30);
  }
  public void f9() {
    System.out.println("метод f9 в классе H");
    System.out.println(f17 >> 2);
  }
  public void f1() {
    System.out.println("метод f1 в классе H");
    System.out.println(f14[1]);
  }
  public static void f15() {
    System.out.println("метод f15 в классе H");
    System.out.println(f31);
  }
  public static void f22() {
    System.out.println("метод f22 в классе H");
    System.out.println((f31 + 5));
  }
  public static void f12() {
    System.out.println("метод f12 в классе H");
    System.out.println(f20);
  }
  public static void f19() {
    System.out.println("метод f19 в классе H");
    System.out.println((f20 + 4));
  }
  public void f24(H r) {
    r.f36();
  }
  public void f24(B r) {
    r.f27();
  }
}
