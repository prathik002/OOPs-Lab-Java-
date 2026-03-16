class Student {

    int roll;
    int academicScore;

    Student(int roll, int academicScore) {
        this.roll = roll;
        this.academicScore = academicScore;
    }

    void displayAcademic() {
        System.out.println("Roll Number : " + roll);
        System.out.println("Academic Score : " + academicScore);
    }
}

interface Sports {

    int sportsScore = 90;

    void displaySports();
}

class Result extends Student implements Sports {

    Result(int roll, int academicScore) {
        super(roll, academicScore);
    }

    public void displaySports() {
        System.out.println("Sports Score : " + sportsScore);
    }

    void displayResult() {
        displayAcademic();
        displaySports();
    }
}

public class ResultDemo {

    public static void main(String[] args) {

        Result r1 = new Result(101, 85);
        r1.displayResult();
    }
}
