package inheritance;

abstract class ShapeEx{
    public abstract double getArea(int r);
    public abstract double getCircum(int r);

}

public class Shape{
    public static void main(String[] args) {
        Shapeplay sp = new Shapeplay();
        System.out.println(sp.getArea(3));
        System.out.println(sp.getCircum(4));
    }
}