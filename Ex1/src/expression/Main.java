package expression;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter 'x': ");
            double x = scan.nextDouble();
            System.out.print("Enter 'y': ");
            double y = scan.nextDouble();
            Expression exp = new Expression();
            double result = exp.calculate(x, y);
            System.out.print(result);
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
