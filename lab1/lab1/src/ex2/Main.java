package ex2;

public class Main {
    public static void main(String[] args) {
        int[][] elements1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int[][] elements2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};
        Matrix matrix1 = new Matrix(elements1);
        Matrix matrix2 = new Matrix(elements2);

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Sum of the two matrices:");
        System.out.println(sum);

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Product of the two matrices:");
        System.out.println(product);
    }
}