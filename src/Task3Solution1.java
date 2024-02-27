public class Task3Solution1 {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int col = 0; col < matrix[0].length; col++){
            int sum = 0;
            for (int row = 0; row < matrix.length; row +=2) {
                sum += matrix[row][col];
            }
            System.out.println("Стовпець" + col + ": " + sum);
        }
    }
}
