package lr2;

public class Task5 {

    static class Rectangle {
        private double length;
        private double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Длина: " + r.getLength());
        System.out.println("Ширина: " + r.getWidth());
        System.out.println("Площадь: " + r.area());
        System.out.println("Периметр: " + r.perimeter());
    }
}
