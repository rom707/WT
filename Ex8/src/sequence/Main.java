package sequence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter 1 array size: ");
            int size = scan.nextInt();
            int[] arrayA = fillArray(size, scan);
            if (!isIncreasing(arrayA))
                throw new Exception("Nonincreasing sequence.");

            for(int i = 0; i < size; i++){
                System.out.print(arrayA[i]+" ");
            }

            System.out.print("Enter 2 array size: ");
            size = scan.nextInt();
            int[] arrayB = fillArray(size, scan);
            if (!isIncreasing(arrayB))
                throw new Exception("Nonincreasing sequence.");

            Sequence seq = new Sequence();
            arrayA = seq.getMergingIndexes(arrayA, arrayB);

            for(int i = 0; i < size; i++){
                System.out.print(arrayA[i]+" ");
            }
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isIncreasing(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1])
                return false;
        }
        return true;
    }

    private static int[] fillArray(int size, Scanner scan){
        System.out.print("Fill array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }


}
