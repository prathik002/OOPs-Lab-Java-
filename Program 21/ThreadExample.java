class FibonacciTask extends Thread {
    private int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("First " + n + " Fibonacci Numbers:");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

class EvenTask extends Thread {
    private int n;

    public EvenTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("First " + n + " Even Numbers:");
        int num = 2;
        for (int i = 0; i < n; i++) {
            System.out.println(num);
            num += 2;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        FibonacciTask fibonacciThread = new FibonacciTask(10);
        EvenTask evenThread = new EvenTask(10);

        // Start Fibonacci thread
        fibonacciThread.start();

        // Wait for Fibonacci thread to finish before starting Even thread
        try {
            fibonacciThread.join(); // ensures Fibonacci finishes first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start Even thread after Fibonacci finishes
        evenThread.start();
    }
}
