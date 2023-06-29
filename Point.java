public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(4.0, 5.0);
        System.out.println("Distance: " + p1.distanceTo(p2));
    }
}
