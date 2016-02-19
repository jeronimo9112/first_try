package ua.yandex.roman;

public class FirstProgram {
	public static void main(String[] args) {

    //Первый метод
    System.out.println("Расстояние между двумя точками = " + new Point(5,10).distance(new Point(7,12)));

    //Второй метод
    System.out.println("Расстояние между двумя точками = " + new Point().distance(new Point(5,10), new Point(7,12)));

    //Третий метод такой же как второй
    Point p1 = new Point(5,10);
    Point p2 = new Point(7,12);

    System.out.println("Расстояние между двумя точками = " + p1.distance(p1,p2));
  }
}