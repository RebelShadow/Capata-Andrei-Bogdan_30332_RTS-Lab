package example3;

public class Main {
    // Static variable to hold the sum of divisors
    static int sumOfDivisors = 0;

    public static void main(String[] args) {
        // Create Thread 1 for numbers greater than 50,000
        JoinTestThread w1 = new JoinTestThread("Thread 1", null, 50000);


        // Create Thread 2 for numbers greater than 20,000
        JoinTestThread w2 = new JoinTestThread("Thread 2", w1, 20000);

        w1.start();
        w2.start();
    }
}
