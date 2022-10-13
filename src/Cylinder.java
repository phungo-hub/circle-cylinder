public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getParentColor(Circle c) {
        return c.getColor();
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }


}