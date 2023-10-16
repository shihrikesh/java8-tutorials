package di;

public class DrawApp {

    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeTriangle = new Triangle();

        shapeCircle.draw();
        shapeTriangle.draw();

        // Dependency Injection
        System.out.println(" Draw shape using DI concepts ");
        Drawing drawing = new Drawing();
        drawing.setShape(shapeCircle);
        drawing.drawShape();

        drawing.setShape(shapeTriangle);
        drawing.drawShape();
    }
}
