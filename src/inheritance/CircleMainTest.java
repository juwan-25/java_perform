package inheritance;

class Circle_Area{
    private double area;
    public void setArea(int r){
         this.area = 3.14 * r * r;
    }
    public double getArea(){
        return area;
    }
    protected double rouund(int r){
        return 2*3.14*r;
    }


}


public class CircleMainTest {
    public static void main(String[] args) {
        Circle_Area cp = new Circle_Area();
        cp.setArea(3);
        System.out.println(cp.getArea());
        System.out.println(cp.rouund(5));
    }
}
