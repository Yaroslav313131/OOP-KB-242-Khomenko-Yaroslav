package lab02;

public class Line {
    private double k, b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }

        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point result = line1.intersection(line2);
        
        if (result != null) {
            System.out.println(result); 
        } else {
            System.out.println("null");
        }
    }
}