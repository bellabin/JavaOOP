public class Abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape1 = new Rectangle();
        shape.draw();
        shape1.draw();
    }
}
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
