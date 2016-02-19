package ua.yandex.roman;

public class FirstProgram {
	public static void main(String[] args) {
    Point p1 = new Point();
    p1.x = 5;
    p1.y = 10;

    Point p2 = new Point();
    p2.x = 5;
    p2.y = 10;

    System.out.println(distance(p1,p2));
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(((p1.y - p1.x) * (p1.y - p1.x)) + ((p2.y - p2.x) * (p2.y - p2.x)));
  }
}