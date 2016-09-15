package balls;

import java.util.LinkedList;

/**
 * Created by User on 15.09.2016.
 */
public class Basket {
    public LinkedList<Ball> balls = new LinkedList<>();

    public int getBallsWeight(){
        int weight = 0;
        for (Ball ball:balls) {
            weight += ball.getWeigth();
        }
        return weight;
    }

    public int getBallsCount(Ball.Color color){
        int count = 0;
        for (Ball ball:balls) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
}
