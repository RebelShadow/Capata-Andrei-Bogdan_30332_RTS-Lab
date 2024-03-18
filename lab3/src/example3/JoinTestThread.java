package example3;

public class JoinTestThread extends Thread {
    Thread t;
    int threshold;

    JoinTestThread(String n, Thread t, int threshold) {
        this.setName(n);
        this.t = t;
        this.threshold = threshold;
    }

    public void run() {
        String n = getName();
        System.out.println("Thread " + n + " has entered the run() method");

        try {
            if (t != null)
                t.join();

            // Calculate sum of divisors
            int divisorSum = calculateDivisorSum(threshold);
            System.out.println("Thread " + n + " calculated sum of divisors: " + divisorSum);

            // Synchronize on the class to ensure atomicity of update
            synchronized (Main.class) {
                // Update the static variable sumOfDivisors
                Main.sumOfDivisors += divisorSum;
                System.out.println("Thread " + n + " updated sumOfDivisors to: " + Main.sumOfDivisors);
            }

            System.out.println("Thread " + n + " has terminated operation.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to calculate the sum of divisors for numbers greater than the threshold
    private int calculateDivisorSum(int threshold) {
        int sum = 0;
        for (int i = threshold + 1; i <= 100000; i++) {
            if (100000 % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

