public class FiveTask {

    public static void main(String[] args) {
        double[] numbers = {1.2, -3.4, 5.6, -7.8, 9.0, -10.1, 2.3, 4.5, 6.7, 8.9};
        double a = 3.0;
        double b = 7.0;

        // Знаходимо номер максимального за модулем елемента
        int maxAbsIndex = findMaxAbsIndex(numbers);

        // Обчислюємо суму елементів масиву, розташованих після першого додатного
        double sumAfterPositive = sumAfterPositive(numbers);

        // Перетворюємо масив
        transform(numbers, a, b);

        // Виводимо результати
        System.out.println("Номер максимального за модулем елемента: " + maxAbsIndex);
        System.out.println("Сума елементів масиву, розташованих після першого додатного: " + sumAfterPositive);
        System.out.println("Перетворений масив:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int findMaxAbsIndex(double[] numbers) {
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) > Math.abs(numbers[maxIndex])) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static double sumAfterPositive(double[] numbers) {
        double sum = 0;
        boolean foundPositive = false;
        for (double number : numbers) {
            if (foundPositive) {
                sum += number;
            } else if (number > 0) {
                foundPositive = true;
            }
        }
        return sum;
    }

    private static void transform(double[] numbers, double a, double b) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            while (left <= right && (numbers[left] < a || numbers[left] > b)) {
                left++;
            }
            while (left <= right && (numbers[right] < a || numbers[right] > b)) {
                right--;
            }
            if (left <= right) {
                double temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left++;
                right--;
            }
        }
    }
}
