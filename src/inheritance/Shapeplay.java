package inheritance;

public class Shapeplay extends ShapeEx {
    @Override
    public double getArea(int r) {
        return r * r * 3.14;
    }

    @Override
    public double getCircum(int r) {
        return 2 * r * 3.14;
    }
}
