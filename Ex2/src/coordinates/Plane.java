package coordinates;

/**
 * Created by User on 11.09.2016.
 */
public class Plane {
    public boolean within(int x, int y){
        if (withinUp(x,y) || withinDown(x,y))
            return true;
        return false;
    }

    private boolean withinUp(int x, int y){
        if (x >= -6 && x <= 6)
            if (y >= - 3 && y <=0)
                return true;
        return false;
    }

    private boolean withinDown(int x, int y){
        if (x >= -4 && x <= 4)
            if (y >= 0 && y <=5)
                return true;
        return false;
    }
}
