import java.util.Scanner;


class Student {

    private String name;
    private int rollNo;
    private int Physics, Chemistry, Mathematics;


    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int physics, int chemistry, int mathematics) {
        this.Physics = physics;
        this.Chemistry = chemistry;
        this.Mathematics = mathematics;
    }


    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getTotal() {
        return Physics + Chemistry + Mathematics;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }
}


public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();


        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRollNo(sc.nextInt());

        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        int mathematics = sc.nextInt();

        s.setMarks(physics, chemistry, mathematics);


        System.out.println("\n--- Student Result ---");
        System.out.println("Name     : " + s.getName());
        System.out.println("Roll No  : " + s.getRollNo());
        System.out.println("Total    : " + s.getTotal());
        System.out.printf("Average  : %.2f\n", s.getAverage()); // 2 decimal places

        sc.close();
    }
}
