public class SixTask {

    public static void main(String[] args) {
        double[] numbers = {1.2, -3.4, 5.6, -7.8, 9.0, -10.1, 2.3, 4.5, 6.7, 8.9};

        int countGreater3 = countGreater3(numbers);

        double productAfterMax = productAfterMax(numbers);

        System.out.println("Кількість елементів в масиві, які більші за 3: " + countGreater3);
        System.out.println("Добуток елементів масиву, розташованих після максимального за модулем: " + productAfterMax);
    }

    private static int countGreater3(double[] numbers) {
        int count = 0;
        for (double number : numbers) {
            if (number > 3) {
                count++;
            }
        }
        return count;
    }

    private static double productAfterMax(double[] numbers) {
        double product = 1;
        int maxIndex = findMaxAbsIndex(numbers);
        for (int i = maxIndex + 1; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
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
}
