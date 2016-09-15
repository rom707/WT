package distance;

import java.util.Arrays;

/**
 * Created by User on 11.09.2016.
 */
public class Levenshtein {

    public int calculate(){//int[] route
        int[] route = {1, 4, 3, 4, 5, 9, 8 ,7};
        int[] sortRoute = route.clone();
        Arrays.sort(sortRoute);
        int a = restorePresription(route, sortRoute);
        return 2;
    }

   // Prescription restorePresription(int[] S1, int[] S2) {
    int restorePresription(int[] S1, int[] S2){
        int m = S1.length, n = S2.length;
        int[][] D = new int[m + 1][n + 1];
        char[][] P = new char[m + 1][n + 1];

        // Базовые значения
        for (int i = 0; i <= m; i++) {
            D[i][0] = i;
            P[i][0] = 'D';
        }
        for (int i = 0; i <= n; i++) {
            D[0][i] = i;
            P[0][i] = 'I';
        }

        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++) {
                int cost = (S1[i-1] != S2[j - 1]) ? 1 : 0;
                if(D[i][j - 1] < D[i - 1][j] && D[i][j - 1] < D[i - 1][j - 1] + cost) {
                    //Вставка
                    D[i][j] = D[i][j - 1] + 1;
                    P[i][j] = 'I';
                }
                else if(D[i - 1][j] < D[i - 1][j - 1] + cost) {
                    //Удаление
                    D[i][j] = D[i - 1][j] + 1;
                    P[i][j] = 'D';
                }
                else {
                    //Замена или отсутствие операции
                    D[i][j] = D[i - 1][j - 1] + cost;
                    P[i][j] = (cost == 1) ? 'R' : 'M';
                }
            }

        //Восстановление предписания
        StringBuilder route = new StringBuilder("");
        int i = m, j = n;
        int a = 0;
        do {
            char c = P[i][j];
          //  route.append(c);
            if(c == 'R' || c == 'D')
                a++;
            if(c == 'R' || c == 'M') {
                i --;
                j --;
            }
            else if(c == 'D') {
                i --;
            }
            else {
                j --;
            }
        } while((i != 0) || (j != 0));
        System.out.print(a);
   //    System.out.print(route.reverse().toString());
        return a;//new Prescription(D[m][n], route.reverse().toString());
    }
}
