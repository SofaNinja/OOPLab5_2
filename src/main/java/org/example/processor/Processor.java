package org.example.processor;
public class Processor implements ProcessArray {
    @Override
    public int calculate(int[][] array) {
        int max = 0;
        int iMax = -1;
        loop:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j > array.length - 2) && (i - j > -1)) {
                    if (array[i][j] < 0) {
                        max = array[i][j];
                        iMax = i;
                        break loop;
                    }
                }
            }
        }
        if (iMax == -1) return 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j > array.length - 2) && (i - j > -1)) {
                    if ((array[i][j] < 0) && (array[i][j] > max)) {
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }
    @Override
    public void processArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j > 98) && (i - j > -1)) {
                    System.out.printf("%5d", array[i][j]);
                } else {
                    System.out.printf("%5d", 0);
                }
            }
            System.out.println();
        }
    }
}