package sk.itsovy.ladislavracz.array;
import sk.itsovy.ladislavracz.school.Student;
import sk.itsovy.ladislavracz.school.Teacher;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

    /**
     * sout 7 1-digit numbers descending using array
     */
    public static void test1() {
        System.out.println();

        int[] arr = new int[7];

        for (int i = 0; i <= 6; i++) {
            arr[i] = i + 1;
        }

        for (int i = 6; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Generate 10 2-digit numbers and sout them ascending and descending using array
     * sout only even numbers
     */
    public static void test2() {
        System.out.println();

        Random rn = new Random();
        int[] arr = new int[10];

        for (int i = 0; i <= 9; i++) {
            arr[i] = rn.nextInt(90) + 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Find arithmetic average number of array values
     * find minimum and maximum value of array
     * find second minimum and second maximum value of array
     * print how many even and how many odd numbers are in array
     */
    public static void test3() {
        System.out.println();

        Random rn = new Random();
        int[] arr = new int[12];

        for (int i = 0; i <= 11; i++) {
            arr[i] = rn.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += arr[i];
        }

        double average = sum / 12.0;
        System.out.println();
        System.out.println("Average: " + average);

        int min = arr[0];
        int second = arr[0];
        for (int i = 1; i < 12; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        for (int i = 1; i < 11; i++) {
            if (arr[i] < min) {
                second = min;
                min = arr[i];
            } else if (arr[i] < second && arr[i] != min) {
                second = arr[i];
            }
        }
        System.out.println("SecondMinimum: " + second);
        System.out.println("Minimum: " + min);

        int max = arr[0];

        for (int i = 1; i < 12; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 1; i < 11; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        System.out.println("SecondMaximum: " + second);
        System.out.println("Maximum: " + max);

        int even = 0;
        int odd = 0;
        for (int i = 0; i < 12; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    /**
     * Display fibonnaci sequence
     */
    public static void test4() {
        System.out.println();
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * Get the minimum and maximum value of given values
     * and stores it into array
     *
     * @param a int number
     * @param b int number
     * @param c int number
     * @return
     */
    public static int[] minmax(int a, int b, int c) {
        System.out.println();

        int[] result = new int[2];

        if (a <= b && a <= c) {
            result[0] = a;
        }
        if (b <= a && b <= c) {
            result[0] = b;
        }
        if (c <= a && c <= b) {
            result[0] = c;
        }
        if (a >= b && a >= c) {
            result[1] = a;
        }
        if (b >= a && b >= c) {
            result[1] = b;
        }
        if (c >= b && c >= a) {
            result[1] = c;
        }
        return result;
    }

    /**
     * Print first 10 powers of 2
     * Set the values of field2 to reversed values of field1
     */
    public static void test6() {
        System.out.println();
        int[] field1 = new int[10];
        int[] field2 = new int[10];

        for (int i = 0; i < 10; i++) {
            field1[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(field1[i] + " ");
        }

        System.out.println();
        for (int i = 9; i >= 0; i--) {
            field2[9 - i] = field1[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(field2[i] + " ");
        }
    }

    /**
     * Prints number not divisible by 3 from array a[]
     * Store copy of the array a[] in 3 ways
     */
    public static void test7() {
        System.out.println();
        int[] a = {12, 38, 47, 5, 29, 16, 10, 112, 48, 65, 75, 9};

        int i, size = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 3 != 0) {
                size++;

            }
        }

        int[] a3n = new int[size];
        int j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 3 != 0) {
                a3n[j] = a[i];
                j++;
            }
        }

        for (int value : a3n) {
            System.out.print(value + " ");
        }

		/*
		Copy of array
		 */
        int[] c = new int[a.length];
        for (int k = 0; k < a.length; k++) {
            c[k] = a[k];
        }

        int[] d = a.clone();
        System.arraycopy(a, 0, d, 0, a.length);
    }

    /**
     * Print array generated by Random without same values
     */
    public static void test8() {
        System.out.println();
        Random rn = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            int count = 0, temp;
            temp = rn.nextInt(50) + 1;
            for (int j = 0; j < i; j++) {
                if (temp == a[j]) {
                    count = 1;
                }
            }
            if (count == 0) a[i] = temp;
            else i--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        rn.nextInt(100);
    }

    /**
     * Prints Array of objects of class Student
     * Prints Array of objects of class Teacher
     * Prints object of class Teacher which has salary = 850 +- 10%
     */
    public static void test9() {
        System.out.println();
        Random rnd = new Random();
        Student[] arr = new Student[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student("noname" + i, rnd.nextInt(68) + 10, "1.N");
        }

        for (Student temp : arr) {
            System.out.println(temp.getName() + " " + temp.getAge());
        }

        System.out.println("Underage:");
        for (Student temp : arr) {
            if (temp.getAge() < 18) {
                System.out.println(temp.getName() + " " + temp.getAge());
            }
        }

        Teacher[] arr1 = new Teacher[8];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Teacher("teacher" + i, rnd.nextInt(48) + 18, rnd.nextInt(501) + 500);
        }

        for (Teacher temp1 : arr1) {
            System.out.println(temp1.getName() + " " + temp1.getAge() + " " + temp1.getSalary());
        }
        //850 - 85 850 + 85

        System.out.println("Salary is: 850 +- 10%:");
        for (Teacher temp1 : arr1) {
            double percentage = temp1.getSalary() / 10;
            if (temp1.getSalary() >= (850 - percentage) && temp1.getSalary() <= (850 + percentage)) {
                System.out.println(temp1.getName() + " " + temp1.getAge() + " " + temp1.getSalary());
            }
        }

    }

    /**
     * Prints Array containing names
     * Prints names containing "a"
     * Prints names with the longest size
     * Prints names with the shortest size
     * Prints array .toUpperCase()
     * Prints values of array and replace all vowels with "."
     */
    public static void test10() {
        System.out.println();
        String[] names = {"Ivan", "Peter", "Erik", "Zuzana", "Leo", "Viliam"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("a") || names[i].contains("A")) {
                System.out.print(names[i] + " ");
            }
        }

        int max = names[0].length();
        int min = names[0].length();
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > max) {
                max = names[i].length();
            }
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() < min) {
                min = names[i].length();
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == max) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == min) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].toUpperCase() + " ");
        }
        System.out.println();

        String name = "";
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].replaceAll("[aeiouyAEIOUY]", ".");
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");

        }


    }

    /**
     * Request word via scanner and returns it inverted
     */
    public static void test11() {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadaj slovo: ");
        String word = sc.nextLine();
        int length = word.length();


        for (int i = length - 1; i >= 0; i--) {
            System.out.print(word.trim().charAt(i));
        }


    }

    /**
     * Creating array and sort it in ascending and descending way
     */
    public static void test12() {
        System.out.println();
        int[] a = {17, 0, -2, 13, 68, 103, 21, 55, 1};
        int n = a.length;

        ascendingSelectionSort(a, n);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();

        descendingSelectionSort(a, n);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }


    /**
     * Generate 20 random numbers into an array without repeating and sorting them
     * Selectionsort
     * Bubblesort
     */
    public static void test13() {
        System.out.println();
        Random rn = new Random();
        int[] array1 = new int[20];


        for (int i = 0; i < array1.length; i++) {
            int count = 0, temp;
            temp = rn.nextInt(79) + 1;
            for (int j = 0; j < i; j++) {
                if (temp == array1[j]) {
                    count = 1;
                }
            }
            if (count == 0)
                array1[i] = temp;
            else i--;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        int n = array1.length;

        ascendingSelectionSort(array1, n);

        System.out.println("Selectionsort: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        ascendingBubbleSort(array1, n);

        System.out.println();
        System.out.println("Bubblesort: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }
    }

    /**
     * Sorting names using Selectionsort A-Z and Z-A
     */
    public static void test14() {
        System.out.println();
        String[] arr =
                {"Monika", "Elizabet", "Nikoleta", "Denis", "Patrik", "Miroslav", "Vladimir", "Martin", "Ladislav", "Damian", "Peter", "Jakub", "Jakub", "Jakub", "Artem", "Tibor"};
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    private static void ascendingSelectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void descendingSelectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void ascendingBubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void descendingBubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}