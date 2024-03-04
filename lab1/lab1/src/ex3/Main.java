package ex3;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
