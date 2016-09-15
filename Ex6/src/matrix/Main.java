package matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            int[] array = fillArray(size, scan);

            Matrix m = new Matrix();
            int[][] mm = m.create(array);

            for(int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    System.out.print(mm[i][j]+" ");
                }
                System.out.print("\r\n");
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
