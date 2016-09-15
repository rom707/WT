package balls;


public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        fillBasket(basket);
        System.out.println("Balls weight: " + basket.getBallsWeight());
        System.out.println("Blue balls count: " + basket.getBallsCount(Ball.Color.BLUE));
    }

    public static void fillBasket(Basket basket){
        basket.balls.add(new Ball(20, Ball.Color.BLUE));
        basket.balls.add(new Ball(23, Ball.Color.RED));
        basket.balls.add(new Ball(31, Ball.Color.GREEN));
        basket.balls.add(new Ball(13, Ball.Color.RED));
        basket.balls.add(new Ball(18, Ball.Color.BLUE));
        basket.balls.add(new Ball(32, Ball.Color.BLUE));
    }
}