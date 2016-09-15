package ex2.coordinates;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter 'x': ");
            int x = scan.nextInt();
            System.out.print("Enter 'y': ");
            int y = scan.nextInt();
            Plane pl = new Plane();
            System.out.print(pl.within(x, y));
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
