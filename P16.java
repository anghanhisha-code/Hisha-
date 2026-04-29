// Thread class to calculate sum
class SumThread extends Thread {
    private int start;
    private int end;
    private long sum = 0;

    // Constructor
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Thread task
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }

    // Getter method to return result
    public long getSum() {
        return sum;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create threads
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        // Start threads (run in parallel)
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // Combine results
        long totalSum = t1.getSum() + t2.getSum();

        System.out.println("\nFinal Total Sum = " + totalSum);
    }
}
