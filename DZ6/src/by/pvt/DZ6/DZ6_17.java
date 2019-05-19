package by.pvt.DZ6;

import java.util.Scanner;
// Заполнить массив бабочкой

public class DZ6_17 {

    public static void main(String[] args) {

        System.out.println("Введите размер массива Размер = нечетное число: ");
        Scanner scanner = new Scanner(System.in);
        int sise = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[sise][sise];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (i <= ((array.length-1)/2)) {
                    if (j >= i && j < array.length -i ) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                } else if (j <= i && j < array.length-i-1 || j>i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
