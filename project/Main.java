package project;

public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray(5);

        array.generateValues(10, 20, false);
        System.out.println(array.toString());
        System.out.println(array.min());
        System.out.println(array.min2());
        System.out.println(array.max());
        System.out.println(array.max2());
        System.out.println(array.getAverageValue());
        array.addItem(8);
        System.out.println();
        System.out.println(array.toString());
        System.out.println(array.getItem(2));
        array.sort(false);
        System.out.println(array.toString());
        array.reverse();
        System.out.println(array.toString());
    }
}