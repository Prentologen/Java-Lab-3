public class Task3Solution2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {-1, 2, 3},
                {4, -5, 6},
                {7, 8, -9},
        };

        int sum = sumNegativeDiagonalElements(matrix);
        System.out.println("Сума від'ємних елементів на головній діагоналі: " + sum);
    }

    private static int sumNegativeDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] < 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }
}
