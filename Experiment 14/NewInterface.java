import java.util.Scanner;

interface AP {
    void input(Scanner sc);
    void area();
    void perimeter();
}

class Circle implements AP {
    double r;

    public void input(Scanner sc) {
        r = sc.nextDouble();
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * r));
    }
}

class Rectangle implements AP {
    double l, b;

    public void input(Scanner sc) {
        l = sc.nextDouble();
        b = sc.nextDouble();
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
    }
}

class Square implements AP {
    double a;

    public void input(Scanner sc) {
        a = sc.nextDouble();
    }

    public void area() {
        System.out.println("Area of Square: " + (a * a));
    }

    public void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * a));
    }
}

class Triangle implements AP {
    double a, b, c;

    public void input(Scanner sc) {
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }

    public void area() {
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of Triangle: " + area);
        } else {
            System.out.println("Invalid triangle sides!");
        }
    }

    public void perimeter() {
        System.out.println("Perimeter of Triangle: " + (a + b + c));
    }
}

public class NewInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AP shape;

        while (true) {
            System.out.println("\n1. Circle Area");
            System.out.println("2. Rectangle Area");
            System.out.println("3. Circle Perimeter");
            System.out.println("4. Rectangle Perimeter");
            System.out.println("5. Square Area");
            System.out.println("6. Square Perimeter");
            System.out.println("7. Triangle Area");
            System.out.println("8. Triangle Perimeter");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    shape = new Circle();
                    System.out.print("Enter radius: ");
                    shape.input(sc);
                    shape.area();
                    break;

                case 2:
                    shape = new Rectangle();
                    System.out.print("Enter length and breadth: ");
                    shape.input(sc);
                    shape.area();
                    break;

                case 3:
                    shape = new Circle();
                    System.out.print("Enter radius: ");
                    shape.input(sc);
                    shape.perimeter();
                    break;

                case 4:
                    shape = new Rectangle();
                    System.out.print("Enter length and breadth: ");
                    shape.input(sc);
                    shape.perimeter();
                    break;

                case 5:
                    shape = new Square();
                    System.out.print("Enter side: ");
                    shape.input(sc);
                    shape.area();
                    break;

                case 6:
                    shape = new Square();
                    System.out.print("Enter side: ");
                    shape.input(sc);
                    shape.perimeter();
                    break;

                case 7:
                    shape = new Triangle();
                    System.out.print("Enter three sides: ");
                    shape.input(sc);
                    shape.area();
                    break;

                case 8:
                    shape = new Triangle();
                    System.out.print("Enter three sides: ");
                    shape.input(sc);
                    shape.perimeter();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
