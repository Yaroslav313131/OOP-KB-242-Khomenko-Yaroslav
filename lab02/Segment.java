package lab02;

public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Відрізок вироджений: початок і кінець збігаються.");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    public Point middle() {
        double midX = (start.x + end.x) / 2;
        double midY = (start.y + end.y) / 2;
        return new Point(midX, midY);
    }

    public Point intersection(Segment another) {
        double x1 = this.start.x, y1 = this.start.y;
        double x2 = this.end.x, y2 = this.end.y;
        double x3 = another.start.x, y3 = another.start.y;
        double x4 = another.end.x, y4 = another.end.y;

        double denominator = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);

        if (denominator == 0) {
            return null;
        }

        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denominator;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denominator;

        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            double intersectionX = x1 + ua * (x2 - x1);
            double intersectionY = y1 + ua * (y2 - y1);
            return new Point(intersectionX, intersectionY);
        }

        return null;
    }
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(0, 4);
        Point D = new Point(4, 0);

        Segment s1 = new Segment(A, B);
        Segment s2 = new Segment(C, D);

        System.out.println("Довжина s1: " + s1.length());
        System.out.println("Середина s1: " + s1.middle());
        
        Point res = s1.intersection(s2);
        System.out.println("Перетин s1 та s2: " + (res != null ? res : "немає"));
    }
}