import java.util.Scanner;

class ComplexNo {
    double real, img;

    ComplexNo(double r, double i) {
        real = r;
        img = i;
    }

    public static ComplexNo sum(ComplexNo c1, ComplexNo c2) {
        ComplexNo temp = new ComplexNo(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        ComplexNo c1 = new ComplexNo(r1, i1);
        ComplexNo c2 = new ComplexNo(r2, i2);

        ComplexNo temp = sum(c1, c2);

        System.out.println("Sum is: " + temp.real + " + " + temp.img + "i");

        sc.close();
    }
}
