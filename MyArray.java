package sk.itsovy.ladislavracz.array;


import java.util.Random;

public class MyArray {
    public static void test1(){
        int[] arr= new int[7];
        int i;
        System.out.println();
        for (i=0; i<=6; i++){
            arr[i]=i+1;
        }
        for (i=6;i>=0;i--)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }
    public static void test2(){
        int arr[]= new int[10];
        Random rnd= new Random();
        int i;
        System.out.println();
        for (i=0; i<=9; i++){
            arr[i]=rnd.nextInt(90)+10;
        }
        i=0;
        while(i<10) {
            System.out.print(arr[i] + "  ");
            i++;
        }

        System.out.println();

        i=9;
        do {
            System.out.print(arr[i]+"  ");
            i--;
        }while (i>=0);
        System.out.println("");
    }
}
