public class ArraySearch {
    public static void main(String[] args) {
        int numbers[] = {33, 7, 43, 18, 22};
        int target = 43;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Число " + target + " найдено на позиции " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Число " + target + " не найденов массиве");
        }
    }
}
