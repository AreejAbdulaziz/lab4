// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(20);
        c1.calculateArea();
        c1.calculateCircumference();
        System.out.println("Area of Circle :"+c1.calculateArea()+"\nCircumference of Circle :"+c1.calculateCircumference());
        Rectangle r1=new Rectangle(10,20);
        System.out.println("Area of Rectangle :"+r1.calculateArea()+"\nCircumference of Rectangle :"+r1.calculateCircumference());
        Triangle t1=new Triangle(4,6);
        System.out.println("Area of Triangle :"+t1.calculateArea()+"\nCircumference of Triangle :"+t1.calculateCircumference());
    }
}