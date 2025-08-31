public class ArrayMinMax {
    public static void main(String[] args) {
        int numbers[] = {5, -3, 8, 1, 9, -4};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Минимальный элемент: " + max);
    }
}

