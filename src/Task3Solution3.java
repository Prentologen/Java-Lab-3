public class Task3Solution3 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = initializeMatrix(n);

        printMatrix(matrix);
    }

    private static int[][] initializeMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = n - i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                matrix[i][j] = j + 1;
            }
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] = 0;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
