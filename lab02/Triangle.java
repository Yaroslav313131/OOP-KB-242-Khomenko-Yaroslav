package lab02;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {

        double areaVal = 0.5 * Math.abs(
            a.x * (b.y - c.y) + 
            b.x * (c.y - a.y) + 
            c.x * (a.y - b.y)
        );

        if (areaVal == 0) {
            throw new IllegalArgumentException("Трикутник вироджений або не існує");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return 0.5 * Math.abs(
            a.x * (b.y - c.y) + 
            b.x * (c.y - a.y) + 
            c.x * (a.y - b.y)
        );
    }

    public Point centroid() {
        double centerX = (a.x + b.x + c.x) / 3;
        double centerY = (a.y + b.y + c.y) / 3;
        return new Point(centerX, centerY);
    }

    public static void main(String[] args) {
        Point p1 = new Point(-2, 1);
        Point p2 = new Point(3, 1);
        Point p3 = new Point(1, -4);

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println("Площа: " + triangle.area());

        System.out.println("Центроїд: " + triangle.centroid()); 
    }
}