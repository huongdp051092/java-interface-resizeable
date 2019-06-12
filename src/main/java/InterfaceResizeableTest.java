public class InterfaceResizeableTest {
    public static void main(String[] args) {
        // Test Circle
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.1);
        circles[1] = new Circle(2.2);
        circles[2] = new Circle(3.3);

        System.out.println("Before Resize:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }

        circles[0].resize(Math.random()* 100);
        circles[1].resize(Math.random()* 100);
        circles[2].resize(Math.random()* 100);

        System.out.println("After Resize:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }
        // Test Rectangle
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4.4, 5.5);
        rectangles[1] = new Rectangle(6.6, 7.7);
        rectangles[2] = new Rectangle(8.8, 9.9);

        System.out.println("Before Resize:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getPerimeter());
        }

        for (Rectangle i : rectangles) {
            i.resize(Math.random() * 100);
        }

        System.out.println("After Resize:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getPerimeter());
        }
        // Test Square
        Square[] squares = new Square[3];
        squares[0] = new Square(1.1);
        squares[1] = new Square(2.2);
        squares[2] = new Square(3.3);

        System.out.println("Before Resize:");
        for (Square square : squares) {
            System.out.println(square.getSide());
        }

        for (Square i : squares) {
            i.resize(Math.random() * 100);
        }

        System.out.println("After Resize:");
        for (Square square : squares) {
            System.out.println(square.getSide());
        }
    }
}
