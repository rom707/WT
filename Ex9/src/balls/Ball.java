package balls;

/**
 * Created by User on 15.09.2016.
 */
public class Ball{
    enum Color {RED, BLUE, GREEN, YELLOW};

    private int weigth;
    private Color color;

    public Ball(int weigth, Color color){
        this.weigth = weigth;
        this.color = color;
    }

    public int getWeigth(){ return this.weigth; }
    public Color getColor(){ return this.color; }

}
