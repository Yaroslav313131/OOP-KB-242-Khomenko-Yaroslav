package lab04;

public class Quadrilateral extends Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a; this.b = b; this.c = c; this.d = d;
        if (area() <= 0.0001) {
            throw new IllegalArgumentException("Чотирикутник вироджений.");
        }
    }

    @Override
    public double area() {
        double area1 = Math.abs((a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY())) / 2.0);
        double area2 = Math.abs((a.getX()*(c.getY()-d.getY()) + c.getX()*(d.getY()-a.getY()) + d.getX()*(a.getY()-c.getY())) / 2.0);
        return area1 + area2;
    }

    @Override
    public Point centroid() {
        double x1 = (a.getX() + b.getX() + c.getX()) / 3.0;
        double y1 = (a.getY() + b.getY() + c.getY()) / 3.0;
        double area1 = Math.abs((a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY())) / 2.0);

        double x2 = (a.getX() + c.getX() + d.getX()) / 3.0;
        double y2 = (a.getY() + c.getY() + d.getY()) / 3.0;
        double area2 = Math.abs((a.getX()*(c.getY()-d.getY()) + c.getX()*(d.getY()-a.getY()) + d.getX()*(a.getY()-c.getY())) / 2.0);

        return new Point((x1 * area1 + x2 * area2) / (area1 + area2), 
                         (y1 * area1 + y2 * area2) / (area1 + area2));
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral[A%s B%s C%s D%s]", a, b, c, d);
    }
}