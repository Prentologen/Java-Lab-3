public class SevenTask {

    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, 0};

        transformNegativesPositives(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void transformNegativesPositives(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            while (left <= right && numbers[left] >= 0) {
                left++;
            }
            while (left <= right && numbers[right] < 0) {
                right--;
            }
            if (left <= right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left++;
                right--;
            }
        }
    }
}
