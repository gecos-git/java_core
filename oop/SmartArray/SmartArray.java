public class SmartArray {
    int[] array;
    
    public SmartArray(int[] arr) {
        array = arr;
    }

    public int findMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int findMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] testArray = {5, 2, 8, 1, 23, 98};
        SmartArray smartArray = new SmartArray(testArray);

        System.out.println("Минминимальное: " + smartArray.findMin());
        System.out.println("Максимальное: " + smartArray.findMax());
        System.out.println("Среднее: " + smartArray.calculateAverage());
    }
}
