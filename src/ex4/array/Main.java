package ex4.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            int[] array = fillArray(size, scan);

            Sieve s = new Sieve();
            for (int item: s.simple(array)) {
                System.out.print(item);
            }
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
