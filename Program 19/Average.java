import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Average{
    public static double calculateAverage(int n) throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter number" + i + ": ");
            double num = sc.nextDouble();
            if(num < 0){
                throw new NegativeNumberException("Negative numbers are not allowed: " + num);
            }
            sum += num; 
        }
        return sum / n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        try {
            double average = calculateAverage(n);
            System.out.println("The average is: " + average);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!!");
        }
    }
}