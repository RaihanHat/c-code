public class Circle extends Shape {
    public Circle(double r)
    {
        super(r,r);
    }

    @Override
    void area() {
        double area = Math.PI* dim1 * dim2;
        System.out.println("Circle area is " + area);
    }
}
