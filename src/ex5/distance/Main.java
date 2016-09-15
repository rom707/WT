package ex5.distance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Levenshtein l = new Levenshtein();
        l.calculate();
      /*  try {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            int[] array = fillArray(size, scan);


        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        } */
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
