public class FirstTask {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 1, 3, 6, 4};

        int minIndex = findMinIndex(numbers);
        int maxIndex = findMaxIndex(numbers);

        swap(numbers, minIndex, maxIndex);

        printArray(numbers);
    }

    private static int findMinIndex(int[] numbers) {
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findMaxIndex(int[] numbers) {
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void swap(int[] numbers, int minIndex, int maxIndex) {
        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
