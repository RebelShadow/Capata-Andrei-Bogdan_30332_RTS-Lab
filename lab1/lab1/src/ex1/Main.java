package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        int real1 = scanner.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        int imag1 = scanner.nextInt();
        ComplexNumber CN1 = new ComplexNumber(real1, imag1);

        System.out.println("Enter the real part of the second complex number:");
        int real2 = scanner.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        int imag2 = scanner.nextInt();
        ComplexNumber CN2 = new ComplexNumber(real2, imag2);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = scanner.nextInt();

        ComplexNumber result;
        switch (choice) {
            case 1:
                result = CN1.Addition(CN1, CN2);
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = CN1.Subtraction(CN1, CN2);
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = CN1.Multiplication(CN1, CN2);
                System.out.println("The result of multiplication is: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
