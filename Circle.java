public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {

        return radius*radius*3.14;
    }

    @Override
    double calculateCircumference() {
        return 2*3.14*radius;
    }
}
