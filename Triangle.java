public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle() {
    }

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double C() {
        double a = B.distance(C);
        double b = A.distance(C);
        double c = B.distance(A);

        return a + b + c;
    }

    public boolean isTriangle() {
        double a = B.distance(C);
        double b = A.distance(C);
        double c = B.distance(A);

        return Math.max(a, Math.max(b, c)) < (this.C() / 2);
    }

    public double S() {
        double a = B.distance(C);
        double b = A.distance(C);
        double c = B.distance(A);
        
        double p = this.C() / 2;
        
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
