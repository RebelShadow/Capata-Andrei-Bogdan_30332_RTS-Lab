package app1;

public class Main {
    public static void main(String[] args) {
        Integer monitor = new Integer(1);
//        new ExecutionThread(monitor, 2, 4, 4).start();
//        new ExecutionThread(monitor, 3, 6, 3).start();
        new ExecutionThread2(2, 5, 3).start();
       new ExecutionThread2(3, 6, 4).start();

    }
}