package lr2;

public class Task6 {

    interface Figure {
        double area();
        double perimeter();
    }

    static class Circle implements Figure {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Figure {
        private double side;

        Square(double side) {
            this.side = side;
        }

        public double area() {
            return side * side;
        }

        public double perimeter() {
            return 4 * side;
        }
    }

    static class Triangle implements Figure {
        private double a;
        private double b;
        private double c;

        Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double area() {
            double p = perimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public double perimeter() {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure square = new Square(5);
        Figure triangle = new Triangle(3, 4, 5);

        System.out.println("Круг: S=" + circle.area() + ", P=" + circle.perimeter());
        System.out.println("Квадрат: S=" + square.area() + ", P=" + square.perimeter());
        System.out.println("Треугольник: S=" + triangle.area() + ", P=" + triangle.perimeter());
    }
}
