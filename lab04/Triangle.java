package lab04;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (area() <= 0.0001) { 
            throw new IllegalArgumentException("Трикутник вироджений: точки лежать на одній прямій.");
        }
    }

    @Override
    public double area() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) + 
                         b.getX() * (c.getY() - a.getY()) + 
                         c.getX() * (a.getY() - b.getY())) / 2.0);
    }

    @Override
    public Point centroid() {
        return new Point((a.getX() + b.getX() + c.getX()) / 3.0, 
                         (a.getY() + b.getY() + c.getY()) / 3.0);
    }

    @Override
    public String toString() {
        return String.format("Triangle[A%s B%s C%s]", a, b, c);
    }
}