public class Task2Routing {
    public static void main(String[] args) {
        int[] numbers = {150, 100, 95, 90, 85, 80, 75, 70, 65, 60};

        int countSegments = countNonDecreasingSegments(numbers);

        System.out.println("Кількість ділянок з не спадаючими значеннями: " + countSegments);
    }

    private static int countNonDecreasingSegments(int[] numbers) {
        int countSegments = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                countSegments++;
            }
        }
        return countSegments;
    }
}

