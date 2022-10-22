package part3.shapes;

public class Square extends Shape {

    private final Point corner;
    private final double size;

    public Square(Point corner, double size, Color color) {
        super(color);
        this.size = size;
        this.corner = corner;
    }

    public Point getCorner() {
        return corner;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "corner=" + corner +
                ", size=" + size +
                ", color=" + getColor() +
                '}';
    }
}
