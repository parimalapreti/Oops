
class Main {

    public void square(int side) {
        int area = side * side;
        int perimeter = 4 * side;

        System.out.println("Square Area = " + area);
        System.out.println("Square Perimeter = " + perimeter);
    }

    public void rectangle(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }

    public void triangle(double base, double height, double a, double b, double c) {
        double area = 0.5 * base * height;
        double perimeter = a + b + c;

        System.out.println("Triangle Area = " + area);
        System.out.println("Triangle Perimeter = " + perimeter);
    }

    public void circle(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area = " + area);
        System.out.println("Circle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.square(5);

        obj.rectangle(10, 5);

        obj.triangle(6, 4, 5, 5, 6);

        obj.circle(7);
    }
}

