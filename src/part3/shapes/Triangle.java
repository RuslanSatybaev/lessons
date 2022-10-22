package part3.shapes;

public class Triangle extends Shape {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    //https://translated.turbopages.org/proxy_u/en-ru.ru.
    //4cc5b926-63443dd0-e1e8544e-74722d776562/https/en.wikipedia.org/wiki/Triangle#Using_coordinates
    @Override
    public double getArea() {
        return Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) -
                (a.getX() - b.getX()) * (c.getY() - a.getY())) * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "color=" + getColor() +
                '}';
    }
}
