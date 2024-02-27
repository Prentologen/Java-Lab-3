public class SecondTask {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 0, 1, 2, 0, 2, 1};

        sortZerosOnesTwos(numbers);

        printArray(numbers);
    }

    private static void sortZerosOnesTwos(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int current = 0;

        while (current <= right) {
            if (numbers[current] == 0) {
                swap(numbers, current, left);
                left++;
                current++;
            } else if (numbers[current] == 2) {
                swap(numbers, current, right);
                right--;
            } else {
                current++;
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
