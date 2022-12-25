interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {

    double width;
    double height;
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double calculateArea() {
        return this.width * this.height;
    }
}

class Circle implements Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }
}

public class FactoryMethodDemo{

    public static void main(String[] args){

      Rectangle r = new Rectangle(10, 20);
      Circle c = new Circle(25);
      
      System.out.println("Rectangle area is: " + r.calculateArea());
      System.out.println("Circle area is: " + c.calculateArea());
    }
}