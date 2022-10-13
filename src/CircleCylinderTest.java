public class CircleCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        Cylinder cylinder = new Cylinder();

        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getParentColor(circle));
    }
}
