package ex2;

public class Matrix {
    private int[][] elements;

    public Matrix(int[][] elements) {
        this.elements = elements;
    }

    public Matrix add(Matrix other) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(elements[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}