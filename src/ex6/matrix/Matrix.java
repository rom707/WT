package ex6.matrix;


/**
 * Created by User on 13.09.2016.
 */
public class Matrix {

    int[][] create(int[] numbers){
        int size = numbers.length;
        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++){
            int k = i;
            for (int j = 0; j < size; j++){
                matrix[i][j] = numbers[k];
                k = (k + 1) % size;
            }
        }

        return matrix;
    }
}
