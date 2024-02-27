public class FourthTask {

    public static void main(String[] args) {
        double[] numbers = {1.2, -3.4, 5.6, -7.8, 9.0, -10.1, 2.3, 4.5, 6.7, 8.9};
        double a = 3.0;
        double b = 7.0;

        int minAbsIndex = findMinAbsIndex(numbers);

        double sumAfterNegative = sumAfterNegative(numbers);

        compress(numbers, a, b);

        System.out.println("Номер мінімального елемента за модулем: " + minAbsIndex);
        System.out.println("Сума модулів елементів після першого від'ємного: " + sumAfterNegative);
        System.out.println("Стиснутий масив:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int findMinAbsIndex(double[] numbers) {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) < Math.abs(numbers[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static double sumAfterNegative(double[] numbers) {
        double sum = 0;
        boolean foundNegative = false;
        for (double number : numbers) {
            if (foundNegative) {
                sum += Math.abs(number);
            } else if (number < 0) {
                foundNegative = true;
            }
        }
        return sum;
    }

    private static void compress(double[] numbers, double a, double b) {
        int writeIndex = 0;
        for (double number : numbers) {
            if (number < a || number > b) {
                numbers[writeIndex++] = number;
            }
        }
        for (; writeIndex < numbers.length; writeIndex++) {
            numbers[writeIndex] = 0;
        }
    }
}
