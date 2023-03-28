package org.example.io;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class IO implements ArrayReader{
    @Override
    public int[][] readTwoDimensionalArray(String fileName) {
        try (BufferedReader in = new BufferedReader(new
                FileReader(fileName))) {
            int n = Integer.parseInt(in.readLine());
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().trim().split("[ ]+");
                for (int j = 0; j < line.length; j++) {
                    array[i][j] = Integer.parseInt(line[j]);
                }
            }return array;
        } catch (IOException e) {
            return new int[0][0];
        }
    }
}