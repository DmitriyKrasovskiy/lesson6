package by.pvt.DZ6;

import java.util.Scanner;

public class DZ6_16 {

    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArray = Integer.parseInt(scanner.nextLine());

        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * (Math.random()));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
