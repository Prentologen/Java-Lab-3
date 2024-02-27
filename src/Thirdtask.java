public class Thirdtask {

    public static void main(String[] args) {
        double[] numbers = {1.3, -3.6, 5.8, -7.10, 9.13, -10.16};

        int minIndex = findMinAbsIndex(numbers);
        int maxIndex = findMaxAbsIndex(numbers);

        System.out.println("Мінімальний елемент за модулем " + numbers[minIndex]);
        System.out.println("Максимальний елемент за модулем: " + numbers[maxIndex]);

        sortDescending(numbers, minIndex, maxIndex);

        System.out.println("Впорядкований масив:");
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

    private static int findMaxAbsIndex(double[] numbers) {
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) > Math.abs(numbers[maxIndex])) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void sortDescending(double[] numbers, int minIndex, int maxIndex) {
        for (int i = minIndex + 1; i < maxIndex; i++) {
            for (int j = i + 1; j <= maxIndex; j++) {
                if (numbers[i] < numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
