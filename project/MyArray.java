package project;

public class MyArray implements ArrayMethods {

    private int[] arr;
    private int size;

    public MyArray(int size) {
        if (size > 0) {
            this.size = size;
            arr = new int[size];

            resetArrayToZero();
        } else {
            error("Incorrect array size:" + size);
        }

    }

    public MyArray(int[] input) {
        if (size > 0 && (input != null || input.length != 0)) {
            this.arr = input;
            this.size = input.length;
        } else {
            error("Incorrect array size: " + size);
        }
    }

    private void resetArrayToZero() {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    @Override
    public double getAverageValue() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double average = sum / (double) size;
        return average;
    }

    @Override
    public int min() {
        if (size > 0) {
            int min = arr[0];
            for (int i = 1; i < size; i++) {
                if (min > arr[i])
                    min = arr[i];
            }
            return min;
        } else {
            error("Incorrect array size: " + size);
            return 0;
        }
    }

    @Override
    public int max() {
        if (size > 0) {
            int max = arr[0];
            for (int i = 1; i < size; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            error("Incorrect array size: " + size);
            return 0;
        }
    }

    @Override
    public int min2() {
        if (size > 0) {
            int min = min();
            int second = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] < min) {
                    second = min();
                    min = arr[i];
                } else if (arr[i] < second && arr[i] != min) {
                    second = arr[i];
                }
            }
            return second;
        } else {
            error("Incorrect array size: " + size);
            return 0;
        }
    }

    @Override
    public int max2() {
        if (size > 0) {
            int max = max();
            int second = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] > max) {
                    second = max;
                    max = arr[i];
                } else if (arr[i] > second && arr[i] != max) {
                    second = arr[i];
                }
            }
            return second;
        } else {
            error("Incorrect array size: " + size);
            return 0;
        }

    }

    @Override
    public void generateValues(int start, int end, boolean repeating) {
        Random rn = new Random();
        if (repeating) {
            for (int i = 0; i < size; i++) {
                arr[i] = rn.nextInt(end - start + 1) + start;
            }
        } else {
            for (int i = 0; i < size; i++) {
                int count = 0, temp;
                temp = rn.nextInt(50) + 1;
                for (int j = 0; j < i; j++) {
                    if (temp == arr[j]) {
                        count = 1;
                    }
                }
                if (count == 0) arr[i] = temp;
                else i--;
            }
        }
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countOfEvenValues() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < size; i++) {
            arr[i] += 1;
        }

    }

    @Override
    public void sort(boolean ascending) {
        if (ascending) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }

    }

    @Override
    public void addItem(int newValue) {
        int[] arr2 = new int[size + 1];
        System.arraycopy(arr, 0, arr2, 0, size);
        arr2[size] = newValue;
        System.out.println("Added item: " + newValue);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

    }

    @Override
    public void addItem(int newValue, int position) {


    }

    @Override
    public int[] copy() {
        int[] copied = arr.clone();
        return copied;
    }

    @Override
    public int getItem(int position) {
        return arr[position];
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += arr[i] + " ";
        }
        return text;
    }

    public void error(String message) {
        System.out.println(message);
        System.exit(1);

    }
}