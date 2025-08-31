public class ArraySumAverage {
    public static void main(String[] args) {
        int numbers[] = {33, 7, 43, 18, 22};
        int sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum/numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
