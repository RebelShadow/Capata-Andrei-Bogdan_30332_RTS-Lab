package app1;

public class ExecutionThread2 extends Thread {

    int sleep, activity_min, activity_max;
    public ExecutionThread2( int activity_min, int
            activity_max, int sleep) {
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.sleep = sleep;

    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");

            System.out.println(this.getName() + " - STATE 2");
            int k = (int) Math.round(Math.random() * (activity_max
                    - activity_min) + activity_min);
            for (int i = 0; i < k * 100000; i++) {
                i++;
                i--;



            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println(this.getName() + " - STATE 3");
    }
}