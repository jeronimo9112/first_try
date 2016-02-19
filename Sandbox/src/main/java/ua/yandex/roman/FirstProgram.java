package ua.yandex.roman;

public class FirstProgram {
	public static void main(String[] args) {
		hello("world!");
    hello("user!");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

    double a = 3;
    double b = 4;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("hello, " + somebody);
  }

  public static double area (double len) {
    return len * len;
  }

  public static double area (double a, double b) {
    return a * b;
  }
}