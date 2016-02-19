package ua.yandex.roman;

public class Point {
  double x;
  double y;

  public Point() {
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p) {
    return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));
  }

  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
  }
}
