public class Triangle extends Shape{
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return (base*height)/2;
    }

    @Override
    double calculateCircumference() {
        return (2*height)+base;
    }
}
