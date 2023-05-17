class B extends H {
  public B() {
    f17 = 7;
    f33 = 4;
    f38 = 6L;
    f23 = 8L;
    f30 = 8L;
  }
  public void f36() {
    System.out.println("метод f36 в классе B");
    System.out.println(f40++);
  }
  public void f9() {
    System.out.println("метод f9 в классе B");
    System.out.println(f40 << 2);
  }
  public void f1() {
    System.out.println("метод f1 в классе B");
    System.out.println(f17 - 4);
  }
  public static void f15() {
    System.out.println("метод f15 в классе B");
    System.out.println((f21 - 5));
  }
  public static void f22() {
    System.out.println("метод f22 в классе B");
    System.out.println(f21++);
  }
  public static void f12() {
    System.out.println("метод f12 в классе B");
    System.out.println(f8);
  }
  public static void f19() {
    System.out.println("метод f19 в классе B");
    System.out.println((f8 - 3));
  }
  public void f24(H r) {
    r.f25();
  }
  public void f24(B r) {
    r.f26();
  }
}
