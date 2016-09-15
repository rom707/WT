package shell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            float[] array = fillArray(size, scan);

            Shell s = new Shell();
            s.sort(array);

            for(int i = 0; i < size; i++){
                System.out.print(array[i]+" ");
            }
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static float[] fillArray(int size, Scanner scan){
        System.out.print("Fill array: ");
        float[] array = new float[size];
        for (int i = 0; i < size; i++){
            array[i] = scan.nextFloat();
        }
        return array;
    }


}
