package expression;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter begin value: ");
            int begin = scan.nextInt();
            System.out.print("Enter end value: ");
            int end = scan.nextInt();
            System.out.print("Enter step value: ");
            int step = scan.nextInt();

            isCorrectInput(begin, end, step);

            int[] values = getStepsOnTheLine(begin, end, step);
            double[] tanValues = getTanValues(values);

            printTable(values, tanValues);
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Not int value.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printTable(int[] values, double[] tanValues){
        System.out.println("arg     tan");
        for(int i = 0; i<values.length; i++){
            System.out.println(values[i] + "      "+ tanValues[i]);
        }
    }

    public static double[] getTanValues(int[] values){
        double[] tanValues = new double[values.length];
        for(int i = 0; i<values.length; i++) {
            tanValues[i] = tanget(values[i]);
        }
        return tanValues;
    }

    public static void isCorrectInput(int begin, int end, int step) throws Exception{
        if (begin > end) {
            throw new Exception("Wrong parameters");
        }
        if (step <= 0){
            throw new Exception("Wrong step value");
        }
    }

    public static int[] getStepsOnTheLine(int begin, int end, int step){
        int[] values = new int[Math.abs((end - begin) / step + 1)];
        int value = begin;
        int index = 0;
        while (value <= end){
            values[index] = value;
            value += step;
            index++;
        }
        return values;
    }

    public static double tanget(int value){
        return Math.tan(value);
    }
}
