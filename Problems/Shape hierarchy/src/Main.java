abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape{

   double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }

    @Override
    double getArea() {
        return Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
    }
}

class Rectangle extends Shape{

    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return a+a+b+b;
    }

    @Override
    double getArea() {
        return a*b;
    }
}

class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    double getArea() {
        return Math.PI*r*r;
    }
}