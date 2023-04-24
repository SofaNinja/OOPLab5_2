package org.example;
import org.example.io.ArrayReader;
import org.example.io.Input;
import org.example.processor.ProcessArray;
import org.example.processor.Processor;
public class Main {
    public static void main(String[] args) {
        ArrayReader input = new Input();
        ProcessArray processor = new Processor();
        int[][] array = input.readTwoDimensionalArray("lab52.txt");
        int max = processor.calculate(array);
        System.out.println("Max = " + max);
    }
}